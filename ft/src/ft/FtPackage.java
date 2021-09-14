/**
 */
package ft;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ft.FtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface FtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ft";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ft/model/ft.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ft";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtPackage eINSTANCE = ft.impl.FtPackageImpl.init();

	/**
	 * The meta object id for the '{@link ft.impl.FootballTournamentsImpl <em>Football Tournaments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.FootballTournamentsImpl
	 * @see ft.impl.FtPackageImpl#getFootballTournaments()
	 * @generated
	 */
	int FOOTBALL_TOURNAMENTS = 0;

	/**
	 * The feature id for the '<em><b>Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTBALL_TOURNAMENTS__HOSTS = 0;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTBALL_TOURNAMENTS__REGIONS = 1;

	/**
	 * The number of structural features of the '<em>Football Tournaments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTBALL_TOURNAMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Football Tournaments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTBALL_TOURNAMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.AbstractHostImpl <em>Abstract Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.AbstractHostImpl
	 * @see ft.impl.FtPackageImpl#getAbstractHost()
	 * @generated
	 */
	int ABSTRACT_HOST = 1;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HOST__TOURNAMENTS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HOST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_HOST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.AssociationHostImpl <em>Association Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.AssociationHostImpl
	 * @see ft.impl.FtPackageImpl#getAssociationHost()
	 * @generated
	 */
	int ASSOCIATION_HOST = 2;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_HOST__TOURNAMENTS = ABSTRACT_HOST__TOURNAMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_HOST__NAME = ABSTRACT_HOST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_HOST_FEATURE_COUNT = ABSTRACT_HOST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_HOST_OPERATION_COUNT = ABSTRACT_HOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.RegionalHostImpl <em>Regional Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.RegionalHostImpl
	 * @see ft.impl.FtPackageImpl#getRegionalHost()
	 * @generated
	 */
	int REGIONAL_HOST = 3;

	/**
	 * The feature id for the '<em><b>Tournaments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_HOST__TOURNAMENTS = ABSTRACT_HOST__TOURNAMENTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_HOST__REGION = ABSTRACT_HOST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regional Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_HOST_FEATURE_COUNT = ABSTRACT_HOST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regional Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_HOST_OPERATION_COUNT = ABSTRACT_HOST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.RegionImpl
	 * @see ft.impl.FtPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Clubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CLUBS = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.TournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.TournamentImpl
	 * @see ft.impl.FtPackageImpl#getTournament()
	 * @generated
	 */
	int TOURNAMENT = 6;

	/**
	 * The meta object id for the '{@link ft.impl.ClubImpl <em>Club</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.ClubImpl
	 * @see ft.impl.FtPackageImpl#getClub()
	 * @generated
	 */
	int CLUB = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__GENDER = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB__REGION = 2;

	/**
	 * The number of structural features of the '<em>Club</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Club</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUB_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__GENDER = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__HOST = 2;

	/**
	 * The feature id for the '<em><b>Seasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__SEASONS = 3;

	/**
	 * The number of structural features of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.SeasonImpl
	 * @see ft.impl.FtPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Year Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__YEAR_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Tournament</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__TOURNAMENT = 3;

	/**
	 * The feature id for the '<em><b>Clubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__CLUBS = 4;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__STAGES = 5;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.StageImpl
	 * @see ft.impl.FtPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 8;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__SEASON = 0;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ROUNDS = 1;

	/**
	 * The feature id for the '<em><b>Clubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__CLUBS = 2;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.DoubleRoundRobinImpl <em>Double Round Robin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.DoubleRoundRobinImpl
	 * @see ft.impl.FtPackageImpl#getDoubleRoundRobin()
	 * @generated
	 */
	int DOUBLE_ROUND_ROBIN = 9;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN__SEASON = STAGE__SEASON;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN__ROUNDS = STAGE__ROUNDS;

	/**
	 * The feature id for the '<em><b>Clubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN__CLUBS = STAGE__CLUBS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN__TABLE = STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN_FEATURE_COUNT = STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Round Robin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ROUND_ROBIN_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.SingleEliminationImpl <em>Single Elimination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.SingleEliminationImpl
	 * @see ft.impl.FtPackageImpl#getSingleElimination()
	 * @generated
	 */
	int SINGLE_ELIMINATION = 10;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__SEASON = STAGE__SEASON;

	/**
	 * The feature id for the '<em><b>Rounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__ROUNDS = STAGE__ROUNDS;

	/**
	 * The feature id for the '<em><b>Clubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION__CLUBS = STAGE__CLUBS;

	/**
	 * The number of structural features of the '<em>Single Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION_FEATURE_COUNT = STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ELIMINATION_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.RoundImpl <em>Round</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.RoundImpl
	 * @see ft.impl.FtPackageImpl#getRound()
	 * @generated
	 */
	int ROUND = 13;

	/**
	 * The meta object id for the '{@link ft.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.MatchImpl
	 * @see ft.impl.FtPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 14;

	/**
	 * The meta object id for the '{@link ft.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.ResultImpl
	 * @see ft.impl.FtPackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 16;

	/**
	 * The meta object id for the '{@link ft.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.TableImpl
	 * @see ft.impl.FtPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 11;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STATISTICS = 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STAGE = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.StatisticImpl
	 * @see ft.impl.FtPackageImpl#getStatistic()
	 * @generated
	 */
	int STATISTIC = 12;

	/**
	 * The feature id for the '<em><b>Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__CLUB = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__PLAYED = 2;

	/**
	 * The feature id for the '<em><b>Won</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__WON = 3;

	/**
	 * The feature id for the '<em><b>Drawn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__DRAWN = 4;

	/**
	 * The feature id for the '<em><b>Lost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__LOST = 5;

	/**
	 * The feature id for the '<em><b>Goals For</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__GOALS_FOR = 6;

	/**
	 * The feature id for the '<em><b>Goals Against</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__GOALS_AGAINST = 7;

	/**
	 * The feature id for the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__GOAL_DIFFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__POINTS = 9;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__FORM = 10;

	/**
	 * The number of structural features of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Round Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__ROUND_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__MATCHES = 1;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND__STAGE = 2;

	/**
	 * The number of structural features of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Round</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Round</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ROUND = 0;

	/**
	 * The feature id for the '<em><b>Home Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_CLUB = 1;

	/**
	 * The feature id for the '<em><b>Away Club</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_CLUB = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATE = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESULT = 4;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ft.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.AbstractResultImpl
	 * @see ft.impl.FtPackageImpl#getAbstractResult()
	 * @generated
	 */
	int ABSTRACT_RESULT = 15;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__WINNER = 0;

	/**
	 * The feature id for the '<em><b>Home Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__HOME_GOALS_FINAL = 1;

	/**
	 * The feature id for the '<em><b>Away Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT__AWAY_GOALS_FINAL = 2;

	/**
	 * The number of structural features of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RESULT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__WINNER = ABSTRACT_RESULT__WINNER;

	/**
	 * The feature id for the '<em><b>Home Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__HOME_GOALS_FINAL = ABSTRACT_RESULT__HOME_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Away Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__AWAY_GOALS_FINAL = ABSTRACT_RESULT__AWAY_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Home Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__HOME_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Away Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__AWAY_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = ABSTRACT_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.ExtendedTimeResultImpl <em>Extended Time Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.ExtendedTimeResultImpl
	 * @see ft.impl.FtPackageImpl#getExtendedTimeResult()
	 * @generated
	 */
	int EXTENDED_TIME_RESULT = 17;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__WINNER = ABSTRACT_RESULT__WINNER;

	/**
	 * The feature id for the '<em><b>Home Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__HOME_GOALS_FINAL = ABSTRACT_RESULT__HOME_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Away Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__AWAY_GOALS_FINAL = ABSTRACT_RESULT__AWAY_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Home Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Away Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Home Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Away Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extended Time Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Extended Time Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_TIME_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.impl.PenaltyShootoutResultImpl <em>Penalty Shootout Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.impl.PenaltyShootoutResultImpl
	 * @see ft.impl.FtPackageImpl#getPenaltyShootoutResult()
	 * @generated
	 */
	int PENALTY_SHOOTOUT_RESULT = 18;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__WINNER = ABSTRACT_RESULT__WINNER;

	/**
	 * The feature id for the '<em><b>Home Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FINAL = ABSTRACT_RESULT__HOME_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Away Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FINAL = ABSTRACT_RESULT__AWAY_GOALS_FINAL;

	/**
	 * The feature id for the '<em><b>Home Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Away Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Home Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Away Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME = ABSTRACT_RESULT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Home Goals Penalty Shootout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT = ABSTRACT_RESULT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Away Goals Penalty Shootout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT = ABSTRACT_RESULT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Penalty Shootout Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT_FEATURE_COUNT = ABSTRACT_RESULT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Penalty Shootout Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENALTY_SHOOTOUT_RESULT_OPERATION_COUNT = ABSTRACT_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ft.ResultKind <em>Result Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.ResultKind
	 * @see ft.impl.FtPackageImpl#getResultKind()
	 * @generated
	 */
	int RESULT_KIND = 20;

	/**
	 * The meta object id for the '{@link ft.WinnerKind <em>Winner Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.WinnerKind
	 * @see ft.impl.FtPackageImpl#getWinnerKind()
	 * @generated
	 */
	int WINNER_KIND = 21;

	/**
	 * The meta object id for the '{@link ft.GenderKind <em>Gender Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ft.GenderKind
	 * @see ft.impl.FtPackageImpl#getGenderKind()
	 * @generated
	 */
	int GENDER_KIND = 19;

	/**
	 * The meta object id for the '<em>ELocal Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDate
	 * @see ft.impl.FtPackageImpl#getELocalDate()
	 * @generated
	 */
	int ELOCAL_DATE = 22;

	/**
	 * The meta object id for the '<em>ELocal Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDateTime
	 * @see ft.impl.FtPackageImpl#getELocalDateTime()
	 * @generated
	 */
	int ELOCAL_DATE_TIME = 23;


	/**
	 * The meta object id for the '<em>Score</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ft.impl.FtPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 24;


	/**
	 * The meta object id for the '<em>Round Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ft.impl.FtPackageImpl#getRoundNumber()
	 * @generated
	 */
	int ROUND_NUMBER = 25;


	/**
	 * Returns the meta object for class '{@link ft.FootballTournaments <em>Football Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Football Tournaments</em>'.
	 * @see ft.FootballTournaments
	 * @generated
	 */
	EClass getFootballTournaments();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.FootballTournaments#getHosts <em>Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosts</em>'.
	 * @see ft.FootballTournaments#getHosts()
	 * @see #getFootballTournaments()
	 * @generated
	 */
	EReference getFootballTournaments_Hosts();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.FootballTournaments#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see ft.FootballTournaments#getRegions()
	 * @see #getFootballTournaments()
	 * @generated
	 */
	EReference getFootballTournaments_Regions();

	/**
	 * Returns the meta object for class '{@link ft.AbstractHost <em>Abstract Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Host</em>'.
	 * @see ft.AbstractHost
	 * @generated
	 */
	EClass getAbstractHost();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.AbstractHost#getTournaments <em>Tournaments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tournaments</em>'.
	 * @see ft.AbstractHost#getTournaments()
	 * @see #getAbstractHost()
	 * @generated
	 */
	EReference getAbstractHost_Tournaments();

	/**
	 * Returns the meta object for class '{@link ft.AssociationHost <em>Association Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Host</em>'.
	 * @see ft.AssociationHost
	 * @generated
	 */
	EClass getAssociationHost();

	/**
	 * Returns the meta object for the attribute '{@link ft.AssociationHost#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ft.AssociationHost#getName()
	 * @see #getAssociationHost()
	 * @generated
	 */
	EAttribute getAssociationHost_Name();

	/**
	 * Returns the meta object for class '{@link ft.RegionalHost <em>Regional Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Host</em>'.
	 * @see ft.RegionalHost
	 * @generated
	 */
	EClass getRegionalHost();

	/**
	 * Returns the meta object for the reference '{@link ft.RegionalHost#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see ft.RegionalHost#getRegion()
	 * @see #getRegionalHost()
	 * @generated
	 */
	EReference getRegionalHost_Region();

	/**
	 * Returns the meta object for class '{@link ft.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ft.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link ft.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ft.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Region#getClubs <em>Clubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clubs</em>'.
	 * @see ft.Region#getClubs()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Clubs();

	/**
	 * Returns the meta object for class '{@link ft.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see ft.Tournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the attribute '{@link ft.Tournament#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ft.Tournament#getName()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Name();

	/**
	 * Returns the meta object for the attribute '{@link ft.Tournament#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see ft.Tournament#getGender()
	 * @see #getTournament()
	 * @generated
	 */
	EAttribute getTournament_Gender();

	/**
	 * Returns the meta object for the container reference '{@link ft.Tournament#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Host</em>'.
	 * @see ft.Tournament#getHost()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Tournament#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seasons</em>'.
	 * @see ft.Tournament#getSeasons()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Seasons();

	/**
	 * Returns the meta object for class '{@link ft.Club <em>Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Club</em>'.
	 * @see ft.Club
	 * @generated
	 */
	EClass getClub();

	/**
	 * Returns the meta object for the attribute '{@link ft.Club#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ft.Club#getName()
	 * @see #getClub()
	 * @generated
	 */
	EAttribute getClub_Name();

	/**
	 * Returns the meta object for the attribute '{@link ft.Club#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see ft.Club#getGender()
	 * @see #getClub()
	 * @generated
	 */
	EAttribute getClub_Gender();

	/**
	 * Returns the meta object for the container reference '{@link ft.Club#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Region</em>'.
	 * @see ft.Club#getRegion()
	 * @see #getClub()
	 * @generated
	 */
	EReference getClub_Region();

	/**
	 * Returns the meta object for class '{@link ft.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see ft.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link ft.Season#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ft.Season#getStartDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ft.Season#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ft.Season#getEndDate()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link ft.Season#getYearIdentifier <em>Year Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Identifier</em>'.
	 * @see ft.Season#getYearIdentifier()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_YearIdentifier();

	/**
	 * Returns the meta object for the container reference '{@link ft.Season#getTournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tournament</em>'.
	 * @see ft.Season#getTournament()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Tournament();

	/**
	 * Returns the meta object for the reference list '{@link ft.Season#getClubs <em>Clubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clubs</em>'.
	 * @see ft.Season#getClubs()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Clubs();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Season#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see ft.Season#getStages()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Stages();

	/**
	 * Returns the meta object for class '{@link ft.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see ft.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the container reference '{@link ft.Stage#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Season</em>'.
	 * @see ft.Stage#getSeason()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Season();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Stage#getRounds <em>Rounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rounds</em>'.
	 * @see ft.Stage#getRounds()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Rounds();

	/**
	 * Returns the meta object for the reference list '{@link ft.Stage#getClubs <em>Clubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clubs</em>'.
	 * @see ft.Stage#getClubs()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Clubs();

	/**
	 * Returns the meta object for class '{@link ft.DoubleRoundRobin <em>Double Round Robin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Round Robin</em>'.
	 * @see ft.DoubleRoundRobin
	 * @generated
	 */
	EClass getDoubleRoundRobin();

	/**
	 * Returns the meta object for the reference '{@link ft.DoubleRoundRobin#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see ft.DoubleRoundRobin#getTable()
	 * @see #getDoubleRoundRobin()
	 * @generated
	 */
	EReference getDoubleRoundRobin_Table();

	/**
	 * Returns the meta object for class '{@link ft.SingleElimination <em>Single Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Elimination</em>'.
	 * @see ft.SingleElimination
	 * @generated
	 */
	EClass getSingleElimination();

	/**
	 * Returns the meta object for class '{@link ft.Round <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round</em>'.
	 * @see ft.Round
	 * @generated
	 */
	EClass getRound();

	/**
	 * Returns the meta object for the attribute '{@link ft.Round#getRoundNumber <em>Round Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Number</em>'.
	 * @see ft.Round#getRoundNumber()
	 * @see #getRound()
	 * @generated
	 */
	EAttribute getRound_RoundNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Round#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see ft.Round#getMatches()
	 * @see #getRound()
	 * @generated
	 */
	EReference getRound_Matches();

	/**
	 * Returns the meta object for the container reference '{@link ft.Round#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stage</em>'.
	 * @see ft.Round#getStage()
	 * @see #getRound()
	 * @generated
	 */
	EReference getRound_Stage();

	/**
	 * Returns the meta object for class '{@link ft.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see ft.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the container reference '{@link ft.Match#getRound <em>Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Round</em>'.
	 * @see ft.Match#getRound()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Round();

	/**
	 * Returns the meta object for the reference '{@link ft.Match#getHomeClub <em>Home Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Club</em>'.
	 * @see ft.Match#getHomeClub()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_HomeClub();

	/**
	 * Returns the meta object for the reference '{@link ft.Match#getAwayClub <em>Away Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away Club</em>'.
	 * @see ft.Match#getAwayClub()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_AwayClub();

	/**
	 * Returns the meta object for the attribute '{@link ft.Match#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ft.Match#getDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Date();

	/**
	 * Returns the meta object for the containment reference '{@link ft.Match#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see ft.Match#getResult()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Result();

	/**
	 * Returns the meta object for class '{@link ft.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Result</em>'.
	 * @see ft.AbstractResult
	 * @generated
	 */
	EClass getAbstractResult();

	/**
	 * Returns the meta object for the attribute '{@link ft.AbstractResult#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see ft.AbstractResult#getWinner()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EAttribute getAbstractResult_Winner();

	/**
	 * Returns the meta object for the attribute '{@link ft.AbstractResult#getHomeGoalsFinal <em>Home Goals Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Goals Final</em>'.
	 * @see ft.AbstractResult#getHomeGoalsFinal()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EAttribute getAbstractResult_HomeGoalsFinal();

	/**
	 * Returns the meta object for the attribute '{@link ft.AbstractResult#getAwayGoalsFinal <em>Away Goals Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Goals Final</em>'.
	 * @see ft.AbstractResult#getAwayGoalsFinal()
	 * @see #getAbstractResult()
	 * @generated
	 */
	EAttribute getAbstractResult_AwayGoalsFinal();

	/**
	 * Returns the meta object for class '{@link ft.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see ft.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for the attribute '{@link ft.Result#getHomeGoalsFullTime <em>Home Goals Full Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Goals Full Time</em>'.
	 * @see ft.Result#getHomeGoalsFullTime()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_HomeGoalsFullTime();

	/**
	 * Returns the meta object for the attribute '{@link ft.Result#getAwayGoalsFullTime <em>Away Goals Full Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Goals Full Time</em>'.
	 * @see ft.Result#getAwayGoalsFullTime()
	 * @see #getResult()
	 * @generated
	 */
	EAttribute getResult_AwayGoalsFullTime();

	/**
	 * Returns the meta object for class '{@link ft.ExtendedTimeResult <em>Extended Time Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Time Result</em>'.
	 * @see ft.ExtendedTimeResult
	 * @generated
	 */
	EClass getExtendedTimeResult();

	/**
	 * Returns the meta object for the attribute '{@link ft.ExtendedTimeResult#getHomeGoalsExtendedTime <em>Home Goals Extended Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Goals Extended Time</em>'.
	 * @see ft.ExtendedTimeResult#getHomeGoalsExtendedTime()
	 * @see #getExtendedTimeResult()
	 * @generated
	 */
	EAttribute getExtendedTimeResult_HomeGoalsExtendedTime();

	/**
	 * Returns the meta object for the attribute '{@link ft.ExtendedTimeResult#getAwayGoalsExtendedTime <em>Away Goals Extended Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Goals Extended Time</em>'.
	 * @see ft.ExtendedTimeResult#getAwayGoalsExtendedTime()
	 * @see #getExtendedTimeResult()
	 * @generated
	 */
	EAttribute getExtendedTimeResult_AwayGoalsExtendedTime();

	/**
	 * Returns the meta object for class '{@link ft.PenaltyShootoutResult <em>Penalty Shootout Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Penalty Shootout Result</em>'.
	 * @see ft.PenaltyShootoutResult
	 * @generated
	 */
	EClass getPenaltyShootoutResult();

	/**
	 * Returns the meta object for the attribute '{@link ft.PenaltyShootoutResult#getHomeGoalsPenaltyShootout <em>Home Goals Penalty Shootout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Goals Penalty Shootout</em>'.
	 * @see ft.PenaltyShootoutResult#getHomeGoalsPenaltyShootout()
	 * @see #getPenaltyShootoutResult()
	 * @generated
	 */
	EAttribute getPenaltyShootoutResult_HomeGoalsPenaltyShootout();

	/**
	 * Returns the meta object for the attribute '{@link ft.PenaltyShootoutResult#getAwayGoalsPenaltyShootout <em>Away Goals Penalty Shootout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Goals Penalty Shootout</em>'.
	 * @see ft.PenaltyShootoutResult#getAwayGoalsPenaltyShootout()
	 * @see #getPenaltyShootoutResult()
	 * @generated
	 */
	EAttribute getPenaltyShootoutResult_AwayGoalsPenaltyShootout();

	/**
	 * Returns the meta object for class '{@link ft.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see ft.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ft.Table#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statistics</em>'.
	 * @see ft.Table#getStatistics()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Statistics();

	/**
	 * Returns the meta object for the reference '{@link ft.Table#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage</em>'.
	 * @see ft.Table#getStage()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Stage();

	/**
	 * Returns the meta object for class '{@link ft.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see ft.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the reference '{@link ft.Statistic#getClub <em>Club</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Club</em>'.
	 * @see ft.Statistic#getClub()
	 * @see #getStatistic()
	 * @generated
	 */
	EReference getStatistic_Club();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ft.Statistic#getPosition()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Position();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getPlayed <em>Played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Played</em>'.
	 * @see ft.Statistic#getPlayed()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Played();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getWon <em>Won</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Won</em>'.
	 * @see ft.Statistic#getWon()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Won();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getDrawn <em>Drawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drawn</em>'.
	 * @see ft.Statistic#getDrawn()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Drawn();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getLost <em>Lost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lost</em>'.
	 * @see ft.Statistic#getLost()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Lost();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getGoalsFor <em>Goals For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals For</em>'.
	 * @see ft.Statistic#getGoalsFor()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_GoalsFor();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getGoalsAgainst <em>Goals Against</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals Against</em>'.
	 * @see ft.Statistic#getGoalsAgainst()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_GoalsAgainst();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getGoalDifference <em>Goal Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Difference</em>'.
	 * @see ft.Statistic#getGoalDifference()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_GoalDifference();

	/**
	 * Returns the meta object for the attribute '{@link ft.Statistic#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see ft.Statistic#getPoints()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Points();

	/**
	 * Returns the meta object for the attribute list '{@link ft.Statistic#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Form</em>'.
	 * @see ft.Statistic#getForm()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Form();

	/**
	 * Returns the meta object for enum '{@link ft.ResultKind <em>Result Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Kind</em>'.
	 * @see ft.ResultKind
	 * @generated
	 */
	EEnum getResultKind();

	/**
	 * Returns the meta object for enum '{@link ft.WinnerKind <em>Winner Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winner Kind</em>'.
	 * @see ft.WinnerKind
	 * @generated
	 */
	EEnum getWinnerKind();

	/**
	 * Returns the meta object for enum '{@link ft.GenderKind <em>Gender Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Kind</em>'.
	 * @see ft.GenderKind
	 * @generated
	 */
	EEnum getGenderKind();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>ELocal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELocal Date</em>'.
	 * @see java.time.LocalDate
	 * @model instanceClass="java.time.LocalDate"
	 * @generated
	 */
	EDataType getELocalDate();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDateTime <em>ELocal Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELocal Date Time</em>'.
	 * @see java.time.LocalDateTime
	 * @model instanceClass="java.time.LocalDateTime"
	 * @generated
	 */
	EDataType getELocalDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Score</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minInclusive='0'"
	 * @generated
	 */
	EDataType getScore();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Round Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Round Number</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minInclusive='1'"
	 * @generated
	 */
	EDataType getRoundNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtFactory getFtFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ft.impl.FootballTournamentsImpl <em>Football Tournaments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.FootballTournamentsImpl
		 * @see ft.impl.FtPackageImpl#getFootballTournaments()
		 * @generated
		 */
		EClass FOOTBALL_TOURNAMENTS = eINSTANCE.getFootballTournaments();

		/**
		 * The meta object literal for the '<em><b>Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTBALL_TOURNAMENTS__HOSTS = eINSTANCE.getFootballTournaments_Hosts();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTBALL_TOURNAMENTS__REGIONS = eINSTANCE.getFootballTournaments_Regions();

		/**
		 * The meta object literal for the '{@link ft.impl.AbstractHostImpl <em>Abstract Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.AbstractHostImpl
		 * @see ft.impl.FtPackageImpl#getAbstractHost()
		 * @generated
		 */
		EClass ABSTRACT_HOST = eINSTANCE.getAbstractHost();

		/**
		 * The meta object literal for the '<em><b>Tournaments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_HOST__TOURNAMENTS = eINSTANCE.getAbstractHost_Tournaments();

		/**
		 * The meta object literal for the '{@link ft.impl.AssociationHostImpl <em>Association Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.AssociationHostImpl
		 * @see ft.impl.FtPackageImpl#getAssociationHost()
		 * @generated
		 */
		EClass ASSOCIATION_HOST = eINSTANCE.getAssociationHost();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_HOST__NAME = eINSTANCE.getAssociationHost_Name();

		/**
		 * The meta object literal for the '{@link ft.impl.RegionalHostImpl <em>Regional Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.RegionalHostImpl
		 * @see ft.impl.FtPackageImpl#getRegionalHost()
		 * @generated
		 */
		EClass REGIONAL_HOST = eINSTANCE.getRegionalHost();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_HOST__REGION = eINSTANCE.getRegionalHost_Region();

		/**
		 * The meta object literal for the '{@link ft.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.RegionImpl
		 * @see ft.impl.FtPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Clubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__CLUBS = eINSTANCE.getRegion_Clubs();

		/**
		 * The meta object literal for the '{@link ft.impl.TournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.TournamentImpl
		 * @see ft.impl.FtPackageImpl#getTournament()
		 * @generated
		 */
		EClass TOURNAMENT = eINSTANCE.getTournament();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__NAME = eINSTANCE.getTournament_Name();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURNAMENT__GENDER = eINSTANCE.getTournament_Gender();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__HOST = eINSTANCE.getTournament_Host();

		/**
		 * The meta object literal for the '<em><b>Seasons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__SEASONS = eINSTANCE.getTournament_Seasons();

		/**
		 * The meta object literal for the '{@link ft.impl.ClubImpl <em>Club</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.ClubImpl
		 * @see ft.impl.FtPackageImpl#getClub()
		 * @generated
		 */
		EClass CLUB = eINSTANCE.getClub();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUB__NAME = eINSTANCE.getClub_Name();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUB__GENDER = eINSTANCE.getClub_Gender();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUB__REGION = eINSTANCE.getClub_Region();

		/**
		 * The meta object literal for the '{@link ft.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.SeasonImpl
		 * @see ft.impl.FtPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__START_DATE = eINSTANCE.getSeason_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__END_DATE = eINSTANCE.getSeason_EndDate();

		/**
		 * The meta object literal for the '<em><b>Year Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__YEAR_IDENTIFIER = eINSTANCE.getSeason_YearIdentifier();

		/**
		 * The meta object literal for the '<em><b>Tournament</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__TOURNAMENT = eINSTANCE.getSeason_Tournament();

		/**
		 * The meta object literal for the '<em><b>Clubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__CLUBS = eINSTANCE.getSeason_Clubs();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__STAGES = eINSTANCE.getSeason_Stages();

		/**
		 * The meta object literal for the '{@link ft.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.StageImpl
		 * @see ft.impl.FtPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__SEASON = eINSTANCE.getStage_Season();

		/**
		 * The meta object literal for the '<em><b>Rounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ROUNDS = eINSTANCE.getStage_Rounds();

		/**
		 * The meta object literal for the '<em><b>Clubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__CLUBS = eINSTANCE.getStage_Clubs();

		/**
		 * The meta object literal for the '{@link ft.impl.DoubleRoundRobinImpl <em>Double Round Robin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.DoubleRoundRobinImpl
		 * @see ft.impl.FtPackageImpl#getDoubleRoundRobin()
		 * @generated
		 */
		EClass DOUBLE_ROUND_ROBIN = eINSTANCE.getDoubleRoundRobin();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUBLE_ROUND_ROBIN__TABLE = eINSTANCE.getDoubleRoundRobin_Table();

		/**
		 * The meta object literal for the '{@link ft.impl.SingleEliminationImpl <em>Single Elimination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.SingleEliminationImpl
		 * @see ft.impl.FtPackageImpl#getSingleElimination()
		 * @generated
		 */
		EClass SINGLE_ELIMINATION = eINSTANCE.getSingleElimination();

		/**
		 * The meta object literal for the '{@link ft.impl.RoundImpl <em>Round</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.RoundImpl
		 * @see ft.impl.FtPackageImpl#getRound()
		 * @generated
		 */
		EClass ROUND = eINSTANCE.getRound();

		/**
		 * The meta object literal for the '<em><b>Round Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND__ROUND_NUMBER = eINSTANCE.getRound_RoundNumber();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUND__MATCHES = eINSTANCE.getRound_Matches();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUND__STAGE = eINSTANCE.getRound_Stage();

		/**
		 * The meta object literal for the '{@link ft.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.MatchImpl
		 * @see ft.impl.FtPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Round</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__ROUND = eINSTANCE.getMatch_Round();

		/**
		 * The meta object literal for the '<em><b>Home Club</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME_CLUB = eINSTANCE.getMatch_HomeClub();

		/**
		 * The meta object literal for the '<em><b>Away Club</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY_CLUB = eINSTANCE.getMatch_AwayClub();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__RESULT = eINSTANCE.getMatch_Result();

		/**
		 * The meta object literal for the '{@link ft.impl.AbstractResultImpl <em>Abstract Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.AbstractResultImpl
		 * @see ft.impl.FtPackageImpl#getAbstractResult()
		 * @generated
		 */
		EClass ABSTRACT_RESULT = eINSTANCE.getAbstractResult();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RESULT__WINNER = eINSTANCE.getAbstractResult_Winner();

		/**
		 * The meta object literal for the '<em><b>Home Goals Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RESULT__HOME_GOALS_FINAL = eINSTANCE.getAbstractResult_HomeGoalsFinal();

		/**
		 * The meta object literal for the '<em><b>Away Goals Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RESULT__AWAY_GOALS_FINAL = eINSTANCE.getAbstractResult_AwayGoalsFinal();

		/**
		 * The meta object literal for the '{@link ft.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.ResultImpl
		 * @see ft.impl.FtPackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '<em><b>Home Goals Full Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__HOME_GOALS_FULL_TIME = eINSTANCE.getResult_HomeGoalsFullTime();

		/**
		 * The meta object literal for the '<em><b>Away Goals Full Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT__AWAY_GOALS_FULL_TIME = eINSTANCE.getResult_AwayGoalsFullTime();

		/**
		 * The meta object literal for the '{@link ft.impl.ExtendedTimeResultImpl <em>Extended Time Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.ExtendedTimeResultImpl
		 * @see ft.impl.FtPackageImpl#getExtendedTimeResult()
		 * @generated
		 */
		EClass EXTENDED_TIME_RESULT = eINSTANCE.getExtendedTimeResult();

		/**
		 * The meta object literal for the '<em><b>Home Goals Extended Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME = eINSTANCE.getExtendedTimeResult_HomeGoalsExtendedTime();

		/**
		 * The meta object literal for the '<em><b>Away Goals Extended Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME = eINSTANCE.getExtendedTimeResult_AwayGoalsExtendedTime();

		/**
		 * The meta object literal for the '{@link ft.impl.PenaltyShootoutResultImpl <em>Penalty Shootout Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.PenaltyShootoutResultImpl
		 * @see ft.impl.FtPackageImpl#getPenaltyShootoutResult()
		 * @generated
		 */
		EClass PENALTY_SHOOTOUT_RESULT = eINSTANCE.getPenaltyShootoutResult();

		/**
		 * The meta object literal for the '<em><b>Home Goals Penalty Shootout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT = eINSTANCE.getPenaltyShootoutResult_HomeGoalsPenaltyShootout();

		/**
		 * The meta object literal for the '<em><b>Away Goals Penalty Shootout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT = eINSTANCE.getPenaltyShootoutResult_AwayGoalsPenaltyShootout();

		/**
		 * The meta object literal for the '{@link ft.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.TableImpl
		 * @see ft.impl.FtPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__STATISTICS = eINSTANCE.getTable_Statistics();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__STAGE = eINSTANCE.getTable_Stage();

		/**
		 * The meta object literal for the '{@link ft.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.impl.StatisticImpl
		 * @see ft.impl.FtPackageImpl#getStatistic()
		 * @generated
		 */
		EClass STATISTIC = eINSTANCE.getStatistic();

		/**
		 * The meta object literal for the '<em><b>Club</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC__CLUB = eINSTANCE.getStatistic_Club();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__POSITION = eINSTANCE.getStatistic_Position();

		/**
		 * The meta object literal for the '<em><b>Played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__PLAYED = eINSTANCE.getStatistic_Played();

		/**
		 * The meta object literal for the '<em><b>Won</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__WON = eINSTANCE.getStatistic_Won();

		/**
		 * The meta object literal for the '<em><b>Drawn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__DRAWN = eINSTANCE.getStatistic_Drawn();

		/**
		 * The meta object literal for the '<em><b>Lost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__LOST = eINSTANCE.getStatistic_Lost();

		/**
		 * The meta object literal for the '<em><b>Goals For</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__GOALS_FOR = eINSTANCE.getStatistic_GoalsFor();

		/**
		 * The meta object literal for the '<em><b>Goals Against</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__GOALS_AGAINST = eINSTANCE.getStatistic_GoalsAgainst();

		/**
		 * The meta object literal for the '<em><b>Goal Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__GOAL_DIFFERENCE = eINSTANCE.getStatistic_GoalDifference();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__POINTS = eINSTANCE.getStatistic_Points();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__FORM = eINSTANCE.getStatistic_Form();

		/**
		 * The meta object literal for the '{@link ft.ResultKind <em>Result Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.ResultKind
		 * @see ft.impl.FtPackageImpl#getResultKind()
		 * @generated
		 */
		EEnum RESULT_KIND = eINSTANCE.getResultKind();

		/**
		 * The meta object literal for the '{@link ft.WinnerKind <em>Winner Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.WinnerKind
		 * @see ft.impl.FtPackageImpl#getWinnerKind()
		 * @generated
		 */
		EEnum WINNER_KIND = eINSTANCE.getWinnerKind();

		/**
		 * The meta object literal for the '{@link ft.GenderKind <em>Gender Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ft.GenderKind
		 * @see ft.impl.FtPackageImpl#getGenderKind()
		 * @generated
		 */
		EEnum GENDER_KIND = eINSTANCE.getGenderKind();

		/**
		 * The meta object literal for the '<em>ELocal Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see ft.impl.FtPackageImpl#getELocalDate()
		 * @generated
		 */
		EDataType ELOCAL_DATE = eINSTANCE.getELocalDate();

		/**
		 * The meta object literal for the '<em>ELocal Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDateTime
		 * @see ft.impl.FtPackageImpl#getELocalDateTime()
		 * @generated
		 */
		EDataType ELOCAL_DATE_TIME = eINSTANCE.getELocalDateTime();

		/**
		 * The meta object literal for the '<em>Score</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see ft.impl.FtPackageImpl#getScore()
		 * @generated
		 */
		EDataType SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '<em>Round Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see ft.impl.FtPackageImpl#getRoundNumber()
		 * @generated
		 */
		EDataType ROUND_NUMBER = eINSTANCE.getRoundNumber();

	}

} //FtPackage
