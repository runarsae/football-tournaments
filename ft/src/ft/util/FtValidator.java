/**
 */
package ft.util;

import ft.*;
import ft.Club;
import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtPackage;
import ft.GenderKind;
import ft.Match;
import ft.Region;
import ft.Result;
import ft.ResultKind;
import ft.Round;
import ft.Season;
import ft.SingleElimination;
import ft.Statistic;
import ft.Table;
import ft.Tournament;
import ft.WinnerKind;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ft.FtPackage
 * @generated
 */
public class FtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FtValidator INSTANCE = new FtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ft";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FtPackage.FOOTBALL_TOURNAMENTS:
				return validateFootballTournaments((FootballTournaments)value, diagnostics, context);
			case FtPackage.ABSTRACT_HOST:
				return validateAbstractHost((AbstractHost)value, diagnostics, context);
			case FtPackage.ASSOCIATION_HOST:
				return validateAssociationHost((AssociationHost)value, diagnostics, context);
			case FtPackage.REGIONAL_HOST:
				return validateRegionalHost((RegionalHost)value, diagnostics, context);
			case FtPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case FtPackage.CLUB:
				return validateClub((Club)value, diagnostics, context);
			case FtPackage.TOURNAMENT:
				return validateTournament((Tournament)value, diagnostics, context);
			case FtPackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case FtPackage.STAGE:
				return validateStage((Stage)value, diagnostics, context);
			case FtPackage.DOUBLE_ROUND_ROBIN:
				return validateDoubleRoundRobin((DoubleRoundRobin)value, diagnostics, context);
			case FtPackage.SINGLE_ELIMINATION:
				return validateSingleElimination((SingleElimination)value, diagnostics, context);
			case FtPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case FtPackage.STATISTIC:
				return validateStatistic((Statistic)value, diagnostics, context);
			case FtPackage.ROUND:
				return validateRound((Round)value, diagnostics, context);
			case FtPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case FtPackage.ABSTRACT_RESULT:
				return validateAbstractResult((AbstractResult)value, diagnostics, context);
			case FtPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case FtPackage.EXTENDED_TIME_RESULT:
				return validateExtendedTimeResult((ExtendedTimeResult)value, diagnostics, context);
			case FtPackage.PENALTY_SHOOTOUT_RESULT:
				return validatePenaltyShootoutResult((PenaltyShootoutResult)value, diagnostics, context);
			case FtPackage.GENDER_KIND:
				return validateGenderKind((GenderKind)value, diagnostics, context);
			case FtPackage.RESULT_KIND:
				return validateResultKind((ResultKind)value, diagnostics, context);
			case FtPackage.WINNER_KIND:
				return validateWinnerKind((WinnerKind)value, diagnostics, context);
			case FtPackage.ELOCAL_DATE:
				return validateELocalDate((LocalDate)value, diagnostics, context);
			case FtPackage.ELOCAL_DATE_TIME:
				return validateELocalDateTime((LocalDateTime)value, diagnostics, context);
			case FtPackage.SCORE:
				return validateScore((Integer)value, diagnostics, context);
			case FtPackage.ROUND_NUMBER:
				return validateRoundNumber((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFootballTournaments(FootballTournaments footballTournaments, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footballTournaments, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractHost(AbstractHost abstractHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationHost(AssociationHost associationHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationHost, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalHost(RegionalHost regionalHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalHost, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalHost, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalHost_clubsInTournamentSeasonsMustBeInRegion(regionalHost, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the clubsInTournamentSeasonsMustBeInRegion constraint of '<em>Regional Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGIONAL_HOST__CLUBS_IN_TOURNAMENT_SEASONS_MUST_BE_IN_REGION__EEXPRESSION = "self.tournaments.seasons.clubs->forAll(club | club.region = self.region)";

	/**
	 * Validates the clubsInTournamentSeasonsMustBeInRegion constraint of '<em>Regional Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalHost_clubsInTournamentSeasonsMustBeInRegion(RegionalHost regionalHost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.REGIONAL_HOST,
				 regionalHost,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubsInTournamentSeasonsMustBeInRegion",
				 REGIONAL_HOST__CLUBS_IN_TOURNAMENT_SEASONS_MUST_BE_IN_REGION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(region, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_clubsMustBeUnique(region, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the clubsMustBeUnique constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGION__CLUBS_MUST_BE_UNIQUE__EEXPRESSION = "self.clubs->isUnique(club | club.name + club.gender)";

	/**
	 * Validates the clubsMustBeUnique constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_clubsMustBeUnique(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.REGION,
				 region,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubsMustBeUnique",
				 REGION__CLUBS_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTournament(Tournament tournament, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tournament, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClub(Club club, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(club, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(season, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_startDateMustBeBeforeEndDate(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_clubsGenderMustBeEqualToTournamentGender(season, diagnostics, context);
		return result;
	}

	/**
	 * Validates the startDateMustBeBeforeEndDate constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSeason_startDateMustBeBeforeEndDate(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Check if season start date is before end date 
		if (!season.getStartDate().isBefore(season.getEndDate())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "startDateMustBeBeforeEndDate", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the clubsGenderMustBeEqualToTournamentGender constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEASON__CLUBS_GENDER_MUST_BE_EQUAL_TO_TOURNAMENT_GENDER__EEXPRESSION = "self.clubs.gender->forAll(g | g = self.tournament.gender)";

	/**
	 * Validates the clubsGenderMustBeEqualToTournamentGender constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason_clubsGenderMustBeEqualToTournamentGender(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.SEASON,
				 season,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubsGenderMustBeEqualToTournamentGender",
				 SEASON__CLUBS_GENDER_MUST_BE_EQUAL_TO_TOURNAMENT_GENDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_roundNumbersMustBeUnique(stage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_clubsInStageMustBeInSeason(stage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the roundNumbersMustBeUnique constraint of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STAGE__ROUND_NUMBERS_MUST_BE_UNIQUE__EEXPRESSION = "self.rounds->isUnique(r | r.roundNumber)";

	/**
	 * Validates the roundNumbersMustBeUnique constraint of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage_roundNumbersMustBeUnique(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.STAGE,
				 stage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "roundNumbersMustBeUnique",
				 STAGE__ROUND_NUMBERS_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the clubsInStageMustBeInSeason constraint of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STAGE__CLUBS_IN_STAGE_MUST_BE_IN_SEASON__EEXPRESSION = "self.season.clubs->includesAll(self.clubs)";

	/**
	 * Validates the clubsInStageMustBeInSeason constraint of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage_clubsInStageMustBeInSeason(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.STAGE,
				 stage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubsInStageMustBeInSeason",
				 STAGE__CLUBS_IN_STAGE_MUST_BE_IN_SEASON__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(doubleRoundRobin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_roundNumbersMustBeUnique(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_clubsInStageMustBeInSeason(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleRoundRobin_numberOfRoundsIsCorrect(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleRoundRobin_roundNumbersMustBeInValidRange(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleRoundRobin_everyClubMustMeetEveryOtherClubHomeAndAwayOnce(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleRoundRobin_numberOfMatchesInEachRoundIsCorrect(doubleRoundRobin, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleRoundRobin_noExtendedTimeOrPenaltyShootout(doubleRoundRobin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numberOfRoundsIsCorrect constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE_ROUND_ROBIN__NUMBER_OF_ROUNDS_IS_CORRECT__EEXPRESSION = " self.rounds->size() <= (self.clubs->size() - 1) * 2";

	/**
	 * Validates the numberOfRoundsIsCorrect constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin_numberOfRoundsIsCorrect(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.DOUBLE_ROUND_ROBIN,
				 doubleRoundRobin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "numberOfRoundsIsCorrect",
				 DOUBLE_ROUND_ROBIN__NUMBER_OF_ROUNDS_IS_CORRECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the roundNumbersMustBeInValidRange constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE_ROUND_ROBIN__ROUND_NUMBERS_MUST_BE_IN_VALID_RANGE__EEXPRESSION = "self.rounds.roundNumber->forAll(roundNumber | roundNumber >= 1 and roundNumber <=  ((self.clubs->size() - 1) * 2))";

	/**
	 * Validates the roundNumbersMustBeInValidRange constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin_roundNumbersMustBeInValidRange(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.DOUBLE_ROUND_ROBIN,
				 doubleRoundRobin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "roundNumbersMustBeInValidRange",
				 DOUBLE_ROUND_ROBIN__ROUND_NUMBERS_MUST_BE_IN_VALID_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the everyClubMustMeetEveryOtherClubHomeAndAwayOnce constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE_ROUND_ROBIN__EVERY_CLUB_MUST_MEET_EVERY_OTHER_CLUB_HOME_AND_AWAY_ONCE__EEXPRESSION = "self.clubs->collect(club1 | self.clubs->select(club2 | club1 <> club2)->collect(club2  | self.rounds.matches->select(match | match.homeClub = club1 and match.awayClub = club2)->size()->collect(size | size = 0 or size = 1)))->forAll(v | v)";

	/**
	 * Validates the everyClubMustMeetEveryOtherClubHomeAndAwayOnce constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin_everyClubMustMeetEveryOtherClubHomeAndAwayOnce(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.DOUBLE_ROUND_ROBIN,
				 doubleRoundRobin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "everyClubMustMeetEveryOtherClubHomeAndAwayOnce",
				 DOUBLE_ROUND_ROBIN__EVERY_CLUB_MUST_MEET_EVERY_OTHER_CLUB_HOME_AND_AWAY_ONCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the numberOfMatchesInEachRoundIsCorrect constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE_ROUND_ROBIN__NUMBER_OF_MATCHES_IN_EACH_ROUND_IS_CORRECT__EEXPRESSION = "self.rounds->forAll(round | round.matches->size() = (self.clubs->size() /2))";

	/**
	 * Validates the numberOfMatchesInEachRoundIsCorrect constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin_numberOfMatchesInEachRoundIsCorrect(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.DOUBLE_ROUND_ROBIN,
				 doubleRoundRobin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "numberOfMatchesInEachRoundIsCorrect",
				 DOUBLE_ROUND_ROBIN__NUMBER_OF_MATCHES_IN_EACH_ROUND_IS_CORRECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noExtendedTimeOrPenaltyShootout constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOUBLE_ROUND_ROBIN__NO_EXTENDED_TIME_OR_PENALTY_SHOOTOUT__EEXPRESSION = "self.rounds.matches.result->forAll(result | result.eClass().name = 'Result')";

	/**
	 * Validates the noExtendedTimeOrPenaltyShootout constraint of '<em>Double Round Robin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleRoundRobin_noExtendedTimeOrPenaltyShootout(DoubleRoundRobin doubleRoundRobin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.DOUBLE_ROUND_ROBIN,
				 doubleRoundRobin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "noExtendedTimeOrPenaltyShootout",
				 DOUBLE_ROUND_ROBIN__NO_EXTENDED_TIME_OR_PENALTY_SHOOTOUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleElimination(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleElimination, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_roundNumbersMustBeUnique(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateStage_clubsInStageMustBeInSeason(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElimination_numberOfRoundsIsCorrect(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElimination_roundNumbersMustBeInValidRange(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElimination_numberOfMatchesInEachRoundIsCorrect(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElimination_everyClubMustHaveWonInPreviousRound(singleElimination, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElimination_matchesMustHaveAWinner(singleElimination, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfRoundsIsCorrect constraint of '<em>Single Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleElimination_numberOfRoundsIsCorrect(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Number of rounds must be maximum log2(number of clubs)
		if (singleElimination.getRounds().size() > (int) (Math.log(singleElimination.getClubs().size()) / Math.log(2))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "numberOfRoundsIsCorrect", getObjectLabel(singleElimination, context) },
						 new Object[] { singleElimination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the roundNumbersMustBeInValidRange constraint of '<em>Single Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleElimination_roundNumbersMustBeInValidRange(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Round numbers must be in range from 1 to log2(number of clubs), inclusive
		
		boolean valid = true;
		
		// Check each round number if valid
		for (Round round : singleElimination.getRounds()) {
			if (round.getRoundNumber() < 1 || round.getRoundNumber() > (int) (Math.log(singleElimination.getClubs().size()) / Math.log(2))) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "roundNumbersMustBeInValidRange", getObjectLabel(singleElimination, context) },
						 new Object[] { singleElimination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the numberOfMatchesInEachRoundIsCorrect constraint of '<em>Single Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleElimination_numberOfMatchesInEachRoundIsCorrect(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Round i (starting from 1) must have 2^(log2(number of clubs) - i) matches
		
		boolean valid = true;
		
		// Go through each round to check the number of matches
		for (Round round : singleElimination.getRounds()) {
			if (round.getMatches().size() != (int) Math.pow(2, ((int) (Math.log(singleElimination.getClubs().size()) / Math.log(2)) - round.getRoundNumber()))) {
				valid = false;
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "numberOfMatchesInEachRoundIsCorrect", getObjectLabel(singleElimination, context) },
						 new Object[] { singleElimination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the everyClubMustHaveWonInPreviousRound constraint of '<em>Single Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleElimination_everyClubMustHaveWonInPreviousRound(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		EList<Round> rounds = singleElimination.getRounds();
		
		if (rounds.size() < 2) {
			// Does not apply to stages with number of rounds less than 2
			return true;
		}
		
		boolean valid = true;
		
		// For round 2 and upwards, check for all matches in the round if the home club and away club has won in the previous round
		for (int i = 2; i < rounds.size() + 1; i++) {
			Round round = rounds.get(i - 1);
			Round prevRound = rounds.get(i - 2);
			
			List<Club> prevRoundWinners = new ArrayList<Club>();
			
			// Get all winners from previous round
			for (Match match : prevRound.getMatches()) {
				if (match.getResult() != null) {
					if (match.getResult().getWinner() == WinnerKind.HOME) {
						prevRoundWinners.add(match.getHomeClub());
					} else {
						prevRoundWinners.add(match.getAwayClub());
					}
				}
			}
			
			// Check if clubs in this round are winners from the previous round
			for (Match match : round.getMatches()) {
				if (!prevRoundWinners.contains(match.getHomeClub()) || !prevRoundWinners.contains(match.getAwayClub())) {
					valid = false;
					break;
				}
			}
			
			if (!valid) {
				break;
			}
		}
		
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "everyClubMustHaveWonInPreviousRound", getObjectLabel(singleElimination, context) },
						 new Object[] { singleElimination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the matchesMustHaveAWinner constraint of '<em>Single Elimination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleElimination_matchesMustHaveAWinner(SingleElimination singleElimination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Every match must have a winner, i.e. not draw
		
		boolean valid = true;
		
		// Loop through all matches in stage to check if any has DRAW as the winner
		for (Round round : singleElimination.getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null && match.getResult().getWinner() == WinnerKind.DRAW) {
					valid = false;
					break;
				}
			}
			
			if (!valid) {
				break;
			}
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "matchesMustHaveAWinner", getObjectLabel(singleElimination, context) },
						 new Object[] { singleElimination },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRound(Round round, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(round, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_homeClubAndAwayClubCannotBeTheSame(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_homeClubMustBeInStage(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_awayClubMustBeInStage(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_homeClubMustBeInOnlyOneMatchPerRound(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_awayClubMustBeInOnlyOneMatchPerRound(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_dateMustBeWithinSeasonStartAndEnd(match, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the homeClubAndAwayClubCannotBeTheSame constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATCH__HOME_CLUB_AND_AWAY_CLUB_CANNOT_BE_THE_SAME__EEXPRESSION = "self.homeClub <> self.awayClub";

	/**
	 * Validates the homeClubAndAwayClubCannotBeTheSame constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_homeClubAndAwayClubCannotBeTheSame(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.MATCH,
				 match,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "homeClubAndAwayClubCannotBeTheSame",
				 MATCH__HOME_CLUB_AND_AWAY_CLUB_CANNOT_BE_THE_SAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the homeClubMustBeInStage constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATCH__HOME_CLUB_MUST_BE_IN_STAGE__EEXPRESSION = "self.round.stage.clubs->includes(self.homeClub)";

	/**
	 * Validates the homeClubMustBeInStage constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_homeClubMustBeInStage(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.MATCH,
				 match,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "homeClubMustBeInStage",
				 MATCH__HOME_CLUB_MUST_BE_IN_STAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the awayClubMustBeInStage constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATCH__AWAY_CLUB_MUST_BE_IN_STAGE__EEXPRESSION = "self.round.stage.clubs->includes(self.awayClub)";

	/**
	 * Validates the awayClubMustBeInStage constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_awayClubMustBeInStage(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.MATCH,
				 match,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "awayClubMustBeInStage",
				 MATCH__AWAY_CLUB_MUST_BE_IN_STAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the homeClubMustBeInOnlyOneMatchPerRound constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATCH__HOME_CLUB_MUST_BE_IN_ONLY_ONE_MATCH_PER_ROUND__EEXPRESSION = "self.round.matches.homeClub->count(self.homeClub) = 1 and self.round.matches.awayClub->count(self.homeClub) = 0";

	/**
	 * Validates the homeClubMustBeInOnlyOneMatchPerRound constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_homeClubMustBeInOnlyOneMatchPerRound(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.MATCH,
				 match,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "homeClubMustBeInOnlyOneMatchPerRound",
				 MATCH__HOME_CLUB_MUST_BE_IN_ONLY_ONE_MATCH_PER_ROUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the awayClubMustBeInOnlyOneMatchPerRound constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATCH__AWAY_CLUB_MUST_BE_IN_ONLY_ONE_MATCH_PER_ROUND__EEXPRESSION = "self.round.matches.homeClub->count(self.awayClub) = 0 and self.round.matches.awayClub->count(self.awayClub) = 1";

	/**
	 * Validates the awayClubMustBeInOnlyOneMatchPerRound constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_awayClubMustBeInOnlyOneMatchPerRound(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.MATCH,
				 match,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "awayClubMustBeInOnlyOneMatchPerRound",
				 MATCH__AWAY_CLUB_MUST_BE_IN_ONLY_ONE_MATCH_PER_ROUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the dateMustBeWithinSeasonStartAndEnd constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMatch_dateMustBeWithinSeasonStartAndEnd(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Season season = match.getRound().getStage().getSeason();
		
		// Check if match date is before or after season duration
		if (match.getDate().toLocalDate().isBefore(season.getStartDate()) || match.getDate().toLocalDate().isAfter(season.getEndDate())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "dateMustBeWithinSeasonStartAndEnd", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractResult(AbstractResult abstractResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(result, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedTimeResult(ExtendedTimeResult extendedTimeResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedTimeResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenaltyShootoutResult(PenaltyShootoutResult penaltyShootoutResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penaltyShootoutResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateTable_numberOfStatisticsMustEqualNumberOfClubsInStage(table, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the numberOfStatisticsMustEqualNumberOfClubsInStage constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TABLE__NUMBER_OF_STATISTICS_MUST_EQUAL_NUMBER_OF_CLUBS_IN_STAGE__EEXPRESSION = "self.statistics->size() = self.stage.clubs->size()";

	/**
	 * Validates the numberOfStatisticsMustEqualNumberOfClubsInStage constraint of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable_numberOfStatisticsMustEqualNumberOfClubsInStage(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.TABLE,
				 table,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "numberOfStatisticsMustEqualNumberOfClubsInStage",
				 TABLE__NUMBER_OF_STATISTICS_MUST_EQUAL_NUMBER_OF_CLUBS_IN_STAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatistic(Statistic statistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statistic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatistic_clubMustBeInStage(statistic, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatistic_clubMustBeInOnlyOneStatisticPerTable(statistic, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the clubMustBeInStage constraint of '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATISTIC__CLUB_MUST_BE_IN_STAGE__EEXPRESSION = "self.eContainer().stage.clubs->includes(self.club)";

	/**
	 * Validates the clubMustBeInStage constraint of '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatistic_clubMustBeInStage(Statistic statistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.STATISTIC,
				 statistic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubMustBeInStage",
				 STATISTIC__CLUB_MUST_BE_IN_STAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the clubMustBeInOnlyOneStatisticPerTable constraint of '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATISTIC__CLUB_MUST_BE_IN_ONLY_ONE_STATISTIC_PER_TABLE__EEXPRESSION = "self.eContainer().statistics.club->count(self.club) = 1";

	/**
	 * Validates the clubMustBeInOnlyOneStatisticPerTable constraint of '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatistic_clubMustBeInOnlyOneStatisticPerTable(Statistic statistic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FtPackage.Literals.STATISTIC,
				 statistic,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "clubMustBeInOnlyOneStatisticPerTable",
				 STATISTIC__CLUB_MUST_BE_IN_ONLY_ONE_STATISTIC_PER_TABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultKind(ResultKind resultKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWinnerKind(WinnerKind winnerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderKind(GenderKind genderKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELocalDate(LocalDate eLocalDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELocalDateTime(LocalDateTime eLocalDateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScore(Integer score, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScore_Min(score, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScore_Min
	 */
	public static final Integer SCORE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Score</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScore_Min(Integer score, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = score.compareTo(SCORE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(FtPackage.Literals.SCORE, score, SCORE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundNumber(Integer roundNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRoundNumber_Min(roundNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRoundNumber_Min
	 */
	public static final Integer ROUND_NUMBER__MIN__VALUE = new Integer(1);

	/**
	 * Validates the Min constraint of '<em>Round Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoundNumber_Min(Integer roundNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = roundNumber.compareTo(ROUND_NUMBER__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(FtPackage.Literals.ROUND_NUMBER, roundNumber, ROUND_NUMBER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FtValidator
