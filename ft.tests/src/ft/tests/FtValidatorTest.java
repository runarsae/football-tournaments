package ft.tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.acceleo.query.delegates.AQLValidationDelegate;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EValidator.ValidationDelegate;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

import ft.AbstractHost;
import ft.Club;
import ft.DoubleRoundRobin;
import ft.ExtendedTimeResult;
import ft.FootballTournaments;
import ft.FtFactory;
import ft.GenderKind;
import ft.Match;
import ft.PenaltyShootoutResult;
import ft.Region;
import ft.RegionalHost;
import ft.Result;
import ft.Round;
import ft.Season;
import ft.SingleElimination;
import ft.Stage;
import ft.Tournament;
import ft.util.TestResourceLoader;
import junit.framework.TestCase;

public class FtValidatorTest extends TestCase {
	
	static FtFactory factory = FtFactory.eINSTANCE;
	
	@Override
	protected void setUp() throws Exception {
		// Register AQL constraint support
		ValidationDelegate.Registry.INSTANCE.put("http://www.eclipse.org/acceleo/query/1.0", new AQLValidationDelegate());
	}
	
	private FootballTournaments getFixture() {
		// Rig a generic tournament with one double round robin stage and two clubs to be used in tests
		FootballTournaments ft = factory.createFootballTournaments();
		
		Region region = factory.createRegion();
		region.setName("Norway");
		ft.getRegions().add(region);
		
		RegionalHost host = factory.createRegionalHost();
		host.setRegion(region);
		ft.getHosts().add(host);
		
		Tournament tournament = factory.createTournament();
		tournament.setHost(host);
		tournament.setName("Eliteserien");
		tournament.setGender(GenderKind.MALE);
		
		Season season = factory.createSeason();
		season.setTournament(tournament);
		season.setStartDate(LocalDate.of(2021, 01, 01));
		season.setEndDate(LocalDate.of(2021, 01, 31));
		
		Club club1 = factory.createClub();
		club1.setName("Rosenborg");
		club1.setGender(GenderKind.MALE);
		club1.setRegion(region);
		season.getClubs().add(club1);
		
		Club club2 = factory.createClub();
		club2.setName("Molde");
		club2.setGender(GenderKind.MALE);
		club2.setRegion(region);
		season.getClubs().add(club2);
		
		DoubleRoundRobin stage = factory.createDoubleRoundRobin();
		stage.setSeason(season);
		stage.getClubs().add(club1);
		stage.getClubs().add(club2);
		
		Round round1 = factory.createRound();
		round1.setRoundNumber(1);
		round1.setStage(stage);
		
		Round round2 = factory.createRound();
		round2.setRoundNumber(2);
		round2.setStage(stage);
		
		Match match1 = factory.createMatch();
		match1.setHomeClub(club1);
		match1.setAwayClub(club2);
		match1.setDate(LocalDateTime.of(2021, 01, 01, 18, 00));
		match1.setRound(round1);
		
		Result result1 = factory.createResult();
		result1.setHomeGoalsFullTime(1);
		result1.setAwayGoalsFullTime(0);
		match1.setResult(result1);
		
		Match match2 = factory.createMatch();
		match2.setHomeClub(club2);
		match2.setAwayClub(club1);
		match2.setDate(LocalDateTime.of(2021, 01, 31, 18, 00));
		match2.setRound(round2);

		Result result2 = factory.createResult();
		result2.setHomeGoalsFullTime(1);
		result2.setAwayGoalsFullTime(4);
		match2.setResult(result2);
		
		return ft;
	}
	
	/*
	 *	Tests for constraints on classes
	 */
	public void testConstraint_RegionalHost_clubsInTournamentSeasonsMustBeInRegion() {
		Resource resource = TestResourceLoader.load("testConstraint_RegionalHost_clubsInTournamentSeasonsMustBeInRegion.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<AbstractHost> hosts = ft.getHosts();
		
		// Validate first regional host (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(hosts.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second regional host with tournament season with a club from another region (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(hosts.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Region_clubsMustBeUnique() {		
		FootballTournaments ft = getFixture();
		
		Region region = ft.getRegions().get(0);
		
		// Validate region with two unique clubs (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(region);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		Club club3 = factory.createClub();
		club3.setGender(GenderKind.MALE);
		club3.setName("Rosenborg");
		club3.setRegion(region);
		
		// Validate region with two equal clubs (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(region);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
	}
	
	public void testConstraint_Season_startDateMustBeBeforeEndDate() {
		Season season = factory.createSeason();
		season.setTournament(factory.createTournament());
		season.setStartDate(LocalDate.of(2021, 01, 01));
		season.setEndDate(LocalDate.of(2021, 01, 31));
		
		// Validate season with start date before end date (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(season);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		season.setEndDate(LocalDate.of(2021, 01, 01));
		
		// Validate season with equal start date and end date (valid)
		diagnostics = Diagnostician.INSTANCE.validate(season);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		season.setEndDate(LocalDate.of(2020, 01, 01));
		
		// Validate season with start date after end date (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(season);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Season_clubsGenderMustBeEqualToTournamentGender() {
		FootballTournaments ft = getFixture();
		
		Season season = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0);
		
		// Validate season with MALE clubs in a MALE tournament (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(season);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		season.getClubs().get(0).setGender(GenderKind.FEMALE);
		
		// Validate season with FEMALE clubs in a MALE tournament (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(season);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Stage_roundNumbersMustBeUnique() {		
		Stage stage = factory.createStage();
		stage.setSeason(factory.createSeason());
		
		Round round1 = factory.createRound();
		round1.setRoundNumber(1);
		round1.setStage(stage);
		stage.getRounds().add(round1);
		
		Round round2 = factory.createRound();
		round2.setRoundNumber(2);
		round2.setStage(stage);
		
		// Validate stage with unique round numbers (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		round1.setRoundNumber(2);
		
		// Validate season with equal round numbers (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Stage_clubsInStageMustBeInSeason() {
		FootballTournaments ft = getFixture();
		
		Stage stage = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage with all clubs in season (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		stage.getSeason().getClubs().remove(0);
		
		// Validate stage with a club that is not in the season (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_DoubleRoundRobin_numberOfRoundsIsCorrect() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage correct number of rounds (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		Round round3 = factory.createRound();
		round3.setRoundNumber(3);
		round3.setStage(stage);
		
		// Validate stage with too many rounds (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);		
	}
	
	public void testConstraint_DoubleRoundRobin_roundNumbersMustBeInValidRange() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage round numbers in valid range (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		stage.getRounds().get(1).setRoundNumber(3);
		
		// Validate stage with round number above maximum (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
		stage.getRounds().get(1).setRoundNumber(0);
		
		// Validate stage with round number under minimum (= 1) (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);		
	}
	
	public void testConstraint_DoubleRoundRobin_everyClubMustMeetEveryOtherClubHomeAndAwayOnce() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage where every club meets every other club home and away once (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		Match match = stage.getRounds().get(0).getMatches().get(0);
		
		Club homeClub = match.getHomeClub();
		Club awayClub = match.getAwayClub();
		
		match.setHomeClub(awayClub);
		match.setAwayClub(homeClub);
		
		// Validate stage with clubs meeting each other twice (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
		stage.getRounds().remove(1);
		
		// Validate stage with not all rounds planned (valid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
	}
	
	public void testConstraint_DoubleRoundRobin_numberOfMatchesInEachRoundIsCorrect() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage where number of matches in each round is correct (all clubs play once) (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		Club club3 = factory.createClub();
		club3.setGender(GenderKind.MALE);
		club3.setName("Bodø/Glimt");
		club3.setRegion(((RegionalHost) stage.getSeason().getTournament().getHost()).getRegion());
		stage.getSeason().getClubs().add(club3);
		stage.getClubs().add(club3);
		
		Match match3 = factory.createMatch();
		match3.setHomeClub(stage.getClubs().get(0));
		match3.setAwayClub(club3);
		match3.setDate(LocalDateTime.of(2021, 01, 15, 18, 00));
		match3.setRound(stage.getRounds().get(0));
		
		// Validate stage with a round with too many matches (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
		
		stage.getRounds().get(0).getMatches().remove(0);
		stage.getRounds().get(0).getMatches().remove(0);
		
		// Validate stage with a round with too few matches (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_DoubleRoundRobin_noExtendedTimeOrPenaltyShootout() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
		
		// Validate stage where results are normal (no extended time or penalty shoot-out) (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		ExtendedTimeResult extendedTimeResult = factory.createExtendedTimeResult();
		extendedTimeResult.setHomeGoalsFullTime(0);
		extendedTimeResult.setAwayGoalsFullTime(0);
		extendedTimeResult.setHomeGoalsExtendedTime(2);
		extendedTimeResult.setHomeGoalsExtendedTime(1);
		
		stage.getRounds().get(0).getMatches().get(0).setResult(extendedTimeResult);
		
		// Validate stage with an extended time result (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);		
		
		PenaltyShootoutResult penaltyShooutoutResult = factory.createPenaltyShootoutResult();
		penaltyShooutoutResult.setHomeGoalsFullTime(0);
		penaltyShooutoutResult.setAwayGoalsFullTime(0);
		penaltyShooutoutResult.setHomeGoalsExtendedTime(1);
		penaltyShooutoutResult.setHomeGoalsExtendedTime(1);
		penaltyShooutoutResult.setHomeGoalsPenaltyShootout(5);
		penaltyShooutoutResult.setAwayGoalsPenaltyShootout(4);
		
		stage.getRounds().get(0).getMatches().get(0).setResult(penaltyShooutoutResult);
		
		// Validate stage with a penalty shoot-out result (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);	
	}
	
	public void testConstraint_SingleElimination_numberOfRoundsIsCorrect() {
		Resource resource = TestResourceLoader.load("testConstraint_SingleElimination_numberOfRoundsIsCorrect.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Stage> stages = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages();
		
		// Validate first single elimination stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second stage with one more round (invalid)
		diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_SingleElimination_roundNumbersMustBeInValidRange() {
		Resource resource = TestResourceLoader.load("testConstraint_SingleElimination_roundNumbersMustBeInValidRange.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Stage> stages = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages();
		
		// Validate first single elimination stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second stage with a round with too high round number (invalid)
		diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_SingleElimination_numberOfMatchesInEachRoundIsCorrect() {
		Resource resource = TestResourceLoader.load("testConstraint_SingleElimination_numberOfMatchesInEachRoundIsCorrect.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Stage> stages = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages();
		
		// Validate first single elimination stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second stage with a round with too many matches (invalid)
		diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_SingleElimination_everyClubMustHaveWonInPreviousRound() {
		Resource resource = TestResourceLoader.load("testConstraint_SingleElimination_everyClubMustHaveWonInPreviousRound.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Stage> stages = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages();
		
		// Validate first single elimination stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second stage with a round with a club that lost in previous round (invalid)
		diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_SingleElimination_matchesMustHaveAWinner() {
		Resource resource = TestResourceLoader.load("testConstraint_SingleElimination_matchesMustHaveAWinner.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Stage> stages = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages();
		
		// Validate first single elimination stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second stage with a match that has DRAW as result (invalid)
		diagnostics = Diagnostician.INSTANCE.validate((SingleElimination) stages.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Round_clubsInRoundMatchesMustBeUnique() {
		Resource resource = TestResourceLoader.load("testConstraint_Round_clubsInRoundMatchesMustBeUnique.ft");
		
		FootballTournaments ft = (FootballTournaments) resource.getContents().get(0);
		List<Round> rounds = ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0).getRounds();
		
		// Validate first round (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(rounds.get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate second round with same club in two matches (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(rounds.get(1));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_Match_homeClubAndAwayClubCannotBeTheSame() {
		FootballTournaments ft = getFixture();
		
		Match match = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getRounds().get(0).getMatches().get(0);
		
		// Validate match with different home club and away club (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		match.setAwayClub(match.getHomeClub());
		
		// Validate match with same home club and away club (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);	
	}
	
	public void testConstraint_Match_homeClubMustBeInStage() {
		FootballTournaments ft = getFixture();
		
		Match match = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getRounds().get(0).getMatches().get(0);
		
		// Validate match where home club is in stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		match.getRound().getStage().getClubs().remove(match.getHomeClub());
		
		// Validate match where home club is not in stage (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);	
	}
	
	public void testConstraint_Match_awayClubMustBeInStage() {
		FootballTournaments ft = getFixture();
		
		Match match = ((DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0)).getRounds().get(0).getMatches().get(0);
		
		// Validate match where home club is in stage (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		match.getRound().getStage().getClubs().remove(match.getAwayClub());
		
		// Validate match where home club is not in stage (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(match);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);	
	}
	
	public void testConstraint_Match_dateMustBeWithinSeasonStartAndEnd() {
		FootballTournaments ft = getFixture();
		
		DoubleRoundRobin stage = (DoubleRoundRobin) ft.getHosts().get(0).getTournaments().get(0).getSeasons().get(0).getStages().get(0);
				
		// Validate match where date is on season start (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(stage.getRounds().get(0).getMatches().get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		// Validate match where date is on season end (valid)
		diagnostics = Diagnostician.INSTANCE.validate(stage.getRounds().get(1).getMatches().get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		stage.getRounds().get(0).getMatches().get(0).setDate(LocalDateTime.of(2021, 01, 15, 18, 00));
		
		// Validate match where date is in the middle of the season (valid)
		diagnostics = Diagnostician.INSTANCE.validate(stage.getRounds().get(0).getMatches().get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		stage.getRounds().get(0).getMatches().get(0).setDate(LocalDateTime.of(2021, 02, 01, 18, 00));
		
		// Validate match where date is outside season (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(stage.getRounds().get(0).getMatches().get(0));
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);	
	}
	
	public void testConstraint_ExtendedTimeResult_fullTimeResultMustBeDraw() {
		ExtendedTimeResult result = factory.createExtendedTimeResult();
		result.setHomeGoalsFullTime(1);
		result.setAwayGoalsFullTime(1);
		result.setHomeGoalsExtendedTime(2);
		result.setAwayGoalsExtendedTime(1);
		
		// Validate result where full time scores are equal, i.e. draw (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		result.setHomeGoalsFullTime(2);
		
		// Validate result where full time scores are different (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_ExtendedTimeResult_mustBeAWinner() {
		ExtendedTimeResult result = factory.createExtendedTimeResult();
		result.setHomeGoalsFullTime(1);
		result.setAwayGoalsFullTime(1);
		result.setHomeGoalsExtendedTime(2);
		result.setAwayGoalsExtendedTime(1);
		
		// Validate result where scores in extended time are different, i.e. we have a winner (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		result.setHomeGoalsExtendedTime(1);
		
		// Validate result where extended time scores are equal (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_PenaltyShooutoutResult_extendedTimeResultMustBeDraw() {
		PenaltyShootoutResult result = factory.createPenaltyShootoutResult();
		result.setHomeGoalsFullTime(1);
		result.setAwayGoalsFullTime(1);
		result.setHomeGoalsExtendedTime(1);
		result.setAwayGoalsExtendedTime(1);
		result.setHomeGoalsPenaltyShootout(5);
		result.setAwayGoalsPenaltyShootout(4);
		
		// Validate result where scores in extended time are equal, i.e. draw (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		result.setHomeGoalsExtendedTime(2);
		
		// Validate result where extended time scores different (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	/*
	 *	Tests for constraints on data types
	 */
	public void testConstraint_Score_minInclusive() {
		Result result = factory.createResult();
		result.setHomeGoalsFullTime(0);
		result.setAwayGoalsFullTime(2);
		
		// Validate result where scores are equal and above minimum (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		result.setHomeGoalsFullTime(-1);
		
		// Validate result where a score is under minimum (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(result);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
	
	public void testConstraint_RoundNumber_minInclusive() {
		Round round = factory.createRound();
		round.setStage(factory.createStage());
		round.setRoundNumber(1);
		
		// Validate round where round number is equal to the minimum value (valid)
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(round);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		round.setRoundNumber(3);
		
		// Validate round where round number is above the minimum value (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(round);
		assertTrue(diagnostics.getSeverity() == Diagnostic.OK);
		
		round.setRoundNumber(0);
		
		// Validate round where round number is under the minimum value (invalid)
		diagnostics = Diagnostician.INSTANCE.validate(round);
		assertTrue(diagnostics.getSeverity() == Diagnostic.ERROR);
	}
}
