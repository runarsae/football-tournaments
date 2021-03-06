package ft.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ft.AbstractHost;
import ft.AssociationHost;
import ft.Club;
import ft.ExtendedTimeResult;
import ft.FootballTournaments;
import ft.FtFactory;
import ft.FtPackage;
import ft.GenderKind;
import ft.Match;
import ft.PenaltyShootoutResult;
import ft.Region;
import ft.RegionalHost;
import ft.Result;
import ft.Round;
import ft.Season;
import ft.Stage;
import ft.Tournament;

/**
 * Reads data from a .ft file, fetches data from .csv files, 
 * combines the data and stores it back into the .ft file.
 */
public class FetchData {
	
	static FtFactory factory = FtFactory.eINSTANCE;

	
	static String MODEL_FILE = "instances/EnglishTournaments.ft";
	static String FILE = "datasets/premier_league_2021_2022.csv";
	static String HOST_TYPE = "REGIONAL";
	static String ASSOCIATION_HOST_NAME = "";
	static String REGION = "England";
	static String TOURNAMENT = "Premier League";
	static Stage stage = factory.createDoubleRoundRobin();
	static GenderKind GENDER = GenderKind.MALE;
	
	public static FootballTournaments load() {
		ResourceSet resSet = new ResourceSetImpl();
		
		// Maps the URI for the model to the package
		resSet.getPackageRegistry().put(FtPackage.eNS_URI, FtPackage.eINSTANCE);
		
		// When loading an .ft file, use FtResourceFactory to handle resources (parsing to real instances of our model)
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ft", new FtResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI(MODEL_FILE), true);
		
		return (FootballTournaments) resource.getContents().get(0);
	}
	
	public static void save(FootballTournaments ft) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("ft", new FtResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Create a resource
        Resource resource = resSet.createResource(URI
                .createURI(MODEL_FILE));
        
        // Add content
        resource.getContents().add(ft);

        // Save the content
        try {
        	Map<Object, Object> saveOptions = new HashMap<Object, Object>();	  
        	saveOptions.put(FtResourceImpl.OPTION_ENCODING,"UTF-8");
        	resource.save(saveOptions);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	

	public static void main(String[] args) throws IOException {
		
		FootballTournaments footballTournaments = load();
		
		Region region = null;
		
		Optional<Region> r = footballTournaments.getRegions().stream().filter(x -> x.getName().equals(REGION)).findFirst();
		
		if (!r.isPresent()) {
			region = factory.createRegion();
			region.setName(REGION);
			footballTournaments.getRegions().add(region);
		}
		
		if (r.isPresent()) {
			region = r.get();
		}
		
		String regionName = region.getName();
		
		AbstractHost host = null;
		Optional<AbstractHost> h = footballTournaments.getHosts().stream().filter(x -> HOST_TYPE == "REGIONAL" ? (x instanceof RegionalHost ? ((RegionalHost) x).getRegion().getName() == regionName : false) : ((AssociationHost) x).getName() == ASSOCIATION_HOST_NAME).findFirst();
				
		if (!h.isPresent()) {
			host = factory.createRegionalHost();
			if (HOST_TYPE == "REGIONAL") {
				((RegionalHost) host).setRegion(region);
			} else {
				((AssociationHost) host).setName(ASSOCIATION_HOST_NAME);
			}
			footballTournaments.getHosts().add(host);
		}
		
		if (h.isPresent()) {
			host = h.get();
		}
		
		Tournament tournament = null;
		Optional<Tournament> t = host.getTournaments().stream().filter(x -> x.getName().equals(TOURNAMENT)).findFirst();
		
		if (t.isPresent()) {
			tournament = t.get();
		}
		
		if (!t.isPresent()) {
			tournament = factory.createTournament();
			tournament.setName(TOURNAMENT);
			tournament.setGender(GENDER);
			tournament.setHost(host);
		}
		
		Season season = factory.createSeason();
		season.setTournament(tournament);
		
		stage.setSeason(season);

		String line = "";

		Round currentRound = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(FILE, StandardCharsets.UTF_8));

			while ((line = br.readLine()) != null) {
				String[] matchString = line.split(";");
				Integer roundNumber = Integer.parseInt(matchString[0]);
				String dateString = matchString[1];
				Integer day = Integer.parseInt(dateString.substring(0, 2));
				Integer month = Integer.parseInt(dateString.substring(3, 5));
				Integer year = Integer.parseInt(dateString.substring(6));
				String timeString = matchString[2];
				Integer hours = Integer.parseInt(timeString.substring(0, 2));
				Integer minutes = Integer.parseInt(timeString.substring(3));
				
			    LocalDateTime date = LocalDateTime.of(year, month, day, hours, minutes);

				String homeClubName = matchString[3];
				String awayClubName = matchString[5];
				
				String resultString = matchString[4];
				Integer homeGoalsFullTime = null;
				Integer awayGoalsFullTime = null;

				if (resultString.length() >= 5 && resultString.contains(" - ")) {
					String[] results = resultString.split(" - ");
					homeGoalsFullTime = Integer.parseInt(results[0]);
					awayGoalsFullTime = Integer.parseInt(results[1]);
				}
				
				Integer homeGoalsExtendedTime = null;
				Integer awayGoalsExtendedTime = null;
				
				if (matchString.length >= 7) {
					String[] results = matchString[6].split(" - ");
					homeGoalsExtendedTime = Integer.parseInt(results[0]);
					awayGoalsExtendedTime = Integer.parseInt(results[1]);
				}
				
				Integer homeGoalsPenaltyShootout = null;
				Integer awayGoalsPenaltyShootout = null;
				
				if (matchString.length == 8) {
					String[] results = matchString[7].split(" - ");
					homeGoalsPenaltyShootout = Integer.parseInt(results[0]);
					awayGoalsPenaltyShootout = Integer.parseInt(results[1]);
				}

				if (!stage.getRounds().stream().anyMatch(x -> x.getRoundNumber() == roundNumber)) {
					Round round = factory.createRound();
					round.setRoundNumber(roundNumber);
					round.setStage(stage);
					currentRound = round;
				}
				
				Club homeClub = null;
				Club awayClub = null;
				Optional<Club> homeClubOptional = region.getClubs().stream().filter(x -> x.getName().equals(homeClubName) && x.getGender().equals(GENDER)).findFirst();
				Optional<Club> awayClubOptional = region.getClubs().stream().filter(x -> x.getName().equals(awayClubName) && x.getGender().equals(GENDER)).findFirst();


				if (!homeClubOptional.isPresent()) {
					Club c = factory.createClub();
					c.setName(homeClubName);
					c.setGender(GENDER);
					season.getClubs().add(c);
					stage.getClubs().add(c);
					c.setRegion(region);
					homeClub = c;
				} else {
					homeClub = homeClubOptional.get();
					
					if (!season.getClubs().contains(homeClub)) {
						season.getClubs().add(homeClub);
					}
					
					if (!stage.getClubs().contains(homeClub)) {
						stage.getClubs().add(homeClub);
					}
				}

				if (!awayClubOptional.isPresent()) {
					Club c = factory.createClub();
					c.setName(awayClubName);
					c.setGender(GENDER);
					season.getClubs().add(c);
					stage.getClubs().add(c);
					c.setRegion(region);
					awayClub = c;
				} else {
					awayClub = awayClubOptional.get();
					
					if (!season.getClubs().contains(awayClub)) {
						season.getClubs().add(awayClub);
					}
					
					if (!stage.getClubs().contains(awayClub)) {
						stage.getClubs().add(awayClub);
					}
				}
				
				Match match = factory.createMatch();
				match.setHomeClub(homeClub);
				match.setAwayClub(awayClub);
				match.setRound(currentRound);
				match.setDate(date);
				
				if (season.getStartDate() == null || season.getEndDate() == null) {
					season.setStartDate(date.toLocalDate());
					season.setEndDate(date.toLocalDate());
				} else if (date.toLocalDate().isBefore(season.getStartDate())) {
					season.setStartDate(date.toLocalDate());
				} else if (date.toLocalDate().isAfter(season.getEndDate())) {
					season.setEndDate(date.toLocalDate());
				}
				
				if (homeGoalsPenaltyShootout != null) {
					PenaltyShootoutResult result = factory.createPenaltyShootoutResult();
					result.setHomeGoalsFullTime(homeGoalsFullTime);
					result.setAwayGoalsFullTime(awayGoalsFullTime);
					result.setHomeGoalsExtendedTime(homeGoalsExtendedTime);
					result.setAwayGoalsExtendedTime(awayGoalsExtendedTime);
					result.setHomeGoalsPenaltyShootout(homeGoalsPenaltyShootout);
					result.setAwayGoalsPenaltyShootout(awayGoalsPenaltyShootout);
					match.setResult(result);
				} else if (homeGoalsExtendedTime != null) {
					ExtendedTimeResult result = factory.createExtendedTimeResult();
					result.setHomeGoalsFullTime(homeGoalsFullTime);
					result.setAwayGoalsFullTime(awayGoalsFullTime);
					result.setHomeGoalsExtendedTime(homeGoalsExtendedTime);
					result.setAwayGoalsExtendedTime(awayGoalsExtendedTime);
					match.setResult(result);
				} else if (homeGoalsFullTime != null && awayGoalsFullTime != null) {
					Result result = factory.createResult();
					result.setHomeGoalsFullTime(homeGoalsFullTime);
					result.setAwayGoalsFullTime(awayGoalsFullTime);
					match.setResult(result);
				}

			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		save(footballTournaments);
	}

}
