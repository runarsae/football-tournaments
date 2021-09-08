/**
 */
package ft.impl;

import ft.Club;
import ft.DoubleRoundRobin;
import ft.FootballTournaments;
import ft.FtFactory;
import ft.FtPackage;
import ft.GenderKind;
import ft.Match;
import ft.Region;
import ft.Result;
import ft.ResultKind;
import ft.Round;
import ft.Season;
import ft.SingleElimination;
import ft.Stage;
import ft.Statistic;
import ft.Table;
import ft.Tournament;
import ft.WinnerKind;
import ft.util.FtValidator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtPackageImpl extends EPackageImpl implements FtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footballTournamentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tournamentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleRoundRobinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleEliminationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum winnerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLocalDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLocalDateTimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ft.FtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FtPackageImpl() {
		super(eNS_URI, FtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FtPackage init() {
		if (isInited) return (FtPackage)EPackage.Registry.INSTANCE.getEPackage(FtPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFtPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FtPackageImpl theFtPackage = registeredFtPackage instanceof FtPackageImpl ? (FtPackageImpl)registeredFtPackage : new FtPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFtPackage.createPackageContents();

		// Initialize created meta-data
		theFtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFtPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFtPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FtPackage.eNS_URI, theFtPackage);
		return theFtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFootballTournaments() {
		return footballTournamentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFootballTournaments_Regions() {
		return (EReference)footballTournamentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegion_Name() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Clubs() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Tournaments() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTournament() {
		return tournamentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_Name() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTournament_Gender() {
		return (EAttribute)tournamentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_Region() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTournament_Seasons() {
		return (EReference)tournamentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClub() {
		return clubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClub_Name() {
		return (EAttribute)clubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClub_Gender() {
		return (EAttribute)clubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClub_Region() {
		return (EReference)clubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClub_Seasons() {
		return (EReference)clubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeason() {
		return seasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_StartDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_EndDate() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_YearIdentifier() {
		return (EAttribute)seasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeason_Tournament() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeason_Clubs() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeason_Stage() {
		return (EReference)seasonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Season() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Rounds() {
		return (EReference)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleRoundRobin() {
		return doubleRoundRobinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoubleRoundRobin_Table() {
		return (EReference)doubleRoundRobinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElimination() {
		return singleEliminationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRound() {
		return roundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRound_RoundNumber() {
		return (EAttribute)roundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRound_Matches() {
		return (EReference)roundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRound_Stage() {
		return (EReference)roundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Round() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_HomeClub() {
		return (EReference)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_AwayClub() {
		return (EReference)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Date() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatch_Result() {
		return (EReference)matchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_HomeGoalsFullTime() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_AwayGoalsFullTime() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResult_Winner() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Statistics() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Stage() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatistic() {
		return statisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatistic_Club() {
		return (EReference)statisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Position() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Played() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Won() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Drawn() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Lost() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_GoalsFor() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_GoalsAgainst() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_GoalDifference() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Points() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistic_Form() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultKind() {
		return resultKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWinnerKind() {
		return winnerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderKind() {
		return genderKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELocalDate() {
		return eLocalDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELocalDateTime() {
		return eLocalDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtFactory getFtFactory() {
		return (FtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		footballTournamentsEClass = createEClass(FOOTBALL_TOURNAMENTS);
		createEReference(footballTournamentsEClass, FOOTBALL_TOURNAMENTS__REGIONS);

		regionEClass = createEClass(REGION);
		createEAttribute(regionEClass, REGION__NAME);
		createEReference(regionEClass, REGION__CLUBS);
		createEReference(regionEClass, REGION__TOURNAMENTS);

		clubEClass = createEClass(CLUB);
		createEAttribute(clubEClass, CLUB__NAME);
		createEAttribute(clubEClass, CLUB__GENDER);
		createEReference(clubEClass, CLUB__REGION);
		createEReference(clubEClass, CLUB__SEASONS);

		tournamentEClass = createEClass(TOURNAMENT);
		createEAttribute(tournamentEClass, TOURNAMENT__NAME);
		createEAttribute(tournamentEClass, TOURNAMENT__GENDER);
		createEReference(tournamentEClass, TOURNAMENT__REGION);
		createEReference(tournamentEClass, TOURNAMENT__SEASONS);

		seasonEClass = createEClass(SEASON);
		createEAttribute(seasonEClass, SEASON__START_DATE);
		createEAttribute(seasonEClass, SEASON__END_DATE);
		createEAttribute(seasonEClass, SEASON__YEAR_IDENTIFIER);
		createEReference(seasonEClass, SEASON__TOURNAMENT);
		createEReference(seasonEClass, SEASON__CLUBS);
		createEReference(seasonEClass, SEASON__STAGE);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__SEASON);
		createEReference(stageEClass, STAGE__ROUNDS);

		doubleRoundRobinEClass = createEClass(DOUBLE_ROUND_ROBIN);
		createEReference(doubleRoundRobinEClass, DOUBLE_ROUND_ROBIN__TABLE);

		singleEliminationEClass = createEClass(SINGLE_ELIMINATION);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__STATISTICS);
		createEReference(tableEClass, TABLE__STAGE);

		statisticEClass = createEClass(STATISTIC);
		createEReference(statisticEClass, STATISTIC__CLUB);
		createEAttribute(statisticEClass, STATISTIC__POSITION);
		createEAttribute(statisticEClass, STATISTIC__PLAYED);
		createEAttribute(statisticEClass, STATISTIC__WON);
		createEAttribute(statisticEClass, STATISTIC__DRAWN);
		createEAttribute(statisticEClass, STATISTIC__LOST);
		createEAttribute(statisticEClass, STATISTIC__GOALS_FOR);
		createEAttribute(statisticEClass, STATISTIC__GOALS_AGAINST);
		createEAttribute(statisticEClass, STATISTIC__GOAL_DIFFERENCE);
		createEAttribute(statisticEClass, STATISTIC__POINTS);
		createEAttribute(statisticEClass, STATISTIC__FORM);

		roundEClass = createEClass(ROUND);
		createEAttribute(roundEClass, ROUND__ROUND_NUMBER);
		createEReference(roundEClass, ROUND__MATCHES);
		createEReference(roundEClass, ROUND__STAGE);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__ROUND);
		createEReference(matchEClass, MATCH__HOME_CLUB);
		createEReference(matchEClass, MATCH__AWAY_CLUB);
		createEAttribute(matchEClass, MATCH__DATE);
		createEReference(matchEClass, MATCH__RESULT);

		resultEClass = createEClass(RESULT);
		createEAttribute(resultEClass, RESULT__HOME_GOALS_FULL_TIME);
		createEAttribute(resultEClass, RESULT__AWAY_GOALS_FULL_TIME);
		createEAttribute(resultEClass, RESULT__WINNER);

		// Create enums
		genderKindEEnum = createEEnum(GENDER_KIND);
		resultKindEEnum = createEEnum(RESULT_KIND);
		winnerKindEEnum = createEEnum(WINNER_KIND);

		// Create data types
		eLocalDateEDataType = createEDataType(ELOCAL_DATE);
		eLocalDateTimeEDataType = createEDataType(ELOCAL_DATE_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doubleRoundRobinEClass.getESuperTypes().add(this.getStage());
		singleEliminationEClass.getESuperTypes().add(this.getStage());

		// Initialize classes, features, and operations; add parameters
		initEClass(footballTournamentsEClass, FootballTournaments.class, "FootballTournaments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFootballTournaments_Regions(), this.getRegion(), null, "regions", null, 0, -1, FootballTournaments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegion_Name(), ecorePackage.getEString(), "name", null, 1, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Clubs(), this.getClub(), this.getClub_Region(), "clubs", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Tournaments(), this.getTournament(), this.getTournament_Region(), "tournaments", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clubEClass, Club.class, "Club", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClub_Name(), ecorePackage.getEString(), "name", null, 1, 1, Club.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClub_Gender(), this.getGenderKind(), "gender", null, 1, 1, Club.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClub_Region(), this.getRegion(), this.getRegion_Clubs(), "region", null, 1, 1, Club.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClub_Seasons(), this.getSeason(), this.getSeason_Clubs(), "seasons", null, 0, -1, Club.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tournamentEClass, Tournament.class, "Tournament", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTournament_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTournament_Gender(), this.getGenderKind(), "gender", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Region(), this.getRegion(), this.getRegion_Tournaments(), "region", null, 1, 1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTournament_Seasons(), this.getSeason(), this.getSeason_Tournament(), "seasons", null, 0, -1, Tournament.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonEClass, Season.class, "Season", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeason_StartDate(), this.getELocalDate(), "startDate", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_EndDate(), this.getELocalDate(), "endDate", null, 0, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_YearIdentifier(), ecorePackage.getEString(), "yearIdentifier", null, 0, 1, Season.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Tournament(), this.getTournament(), this.getTournament_Seasons(), "tournament", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Clubs(), this.getClub(), this.getClub_Seasons(), "clubs", null, 0, -1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeason_Stage(), this.getStage(), this.getStage_Season(), "stage", null, 1, 1, Season.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Season(), this.getSeason(), this.getSeason_Stage(), "season", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_Rounds(), this.getRound(), this.getRound_Stage(), "rounds", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleRoundRobinEClass, DoubleRoundRobin.class, "DoubleRoundRobin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoubleRoundRobin_Table(), this.getTable(), null, "table", null, 0, 1, DoubleRoundRobin.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(singleEliminationEClass, SingleElimination.class, "SingleElimination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Statistics(), this.getStatistic(), null, "statistics", null, 0, -1, Table.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Stage(), this.getStage(), null, "stage", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticEClass, Statistic.class, "Statistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatistic_Club(), this.getClub(), null, "club", null, 1, 1, Statistic.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Position(), ecorePackage.getEInt(), "position", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Played(), ecorePackage.getEInt(), "played", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Won(), ecorePackage.getEInt(), "won", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Drawn(), ecorePackage.getEInt(), "drawn", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Lost(), ecorePackage.getEInt(), "lost", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_GoalsFor(), ecorePackage.getEInt(), "goalsFor", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_GoalsAgainst(), ecorePackage.getEInt(), "goalsAgainst", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_GoalDifference(), ecorePackage.getEInt(), "goalDifference", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistic_Form(), this.getResultKind(), "form", null, 0, 6, Statistic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roundEClass, Round.class, "Round", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRound_RoundNumber(), ecorePackage.getEInt(), "roundNumber", null, 1, 1, Round.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRound_Matches(), this.getMatch(), this.getMatch_Round(), "matches", null, 0, -1, Round.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRound_Stage(), this.getStage(), this.getStage_Rounds(), "stage", null, 1, 1, Round.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_Round(), this.getRound(), this.getRound_Matches(), "round", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_HomeClub(), this.getClub(), null, "homeClub", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_AwayClub(), this.getClub(), null, "awayClub", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Date(), this.getELocalDateTime(), "date", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Result(), this.getResult(), null, "result", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResult_HomeGoalsFullTime(), ecorePackage.getEInt(), "homeGoalsFullTime", "0", 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_AwayGoalsFullTime(), ecorePackage.getEInt(), "awayGoalsFullTime", "0", 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Winner(), this.getWinnerKind(), "winner", null, 0, 1, Result.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderKindEEnum, GenderKind.class, "GenderKind");
		addEEnumLiteral(genderKindEEnum, GenderKind.MALE);
		addEEnumLiteral(genderKindEEnum, GenderKind.FEMALE);

		initEEnum(resultKindEEnum, ResultKind.class, "ResultKind");
		addEEnumLiteral(resultKindEEnum, ResultKind.DRAW);
		addEEnumLiteral(resultKindEEnum, ResultKind.WIN);
		addEEnumLiteral(resultKindEEnum, ResultKind.LOSS);

		initEEnum(winnerKindEEnum, WinnerKind.class, "WinnerKind");
		addEEnumLiteral(winnerKindEEnum, WinnerKind.DRAW);
		addEEnumLiteral(winnerKindEEnum, WinnerKind.HOME);
		addEEnumLiteral(winnerKindEEnum, WinnerKind.AWAY);

		// Initialize data types
		initEDataType(eLocalDateEDataType, LocalDate.class, "ELocalDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLocalDateTimeEDataType, LocalDateTime.class, "ELocalDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (seasonEClass,
		   source,
		   new String[] {
			   "constraints", "startDateMustBeBeforeEndDate clubsGenderMustBeEqualToTournamentGender"
		   });
		addAnnotation
		  (stageEClass,
		   source,
		   new String[] {
			   "constraints", "roundNumbersMustBeUnique"
		   });
		addAnnotation
		  (doubleRoundRobinEClass,
		   source,
		   new String[] {
			   "constraints", "numberOfRoundsIsCorrect roundNumbersMustBeInValidRange everyClubMustMeetEveryOtherClubHomeAndAway numberOfMatchesInEachRoundIsCorrect"
		   });
		addAnnotation
		  (singleEliminationEClass,
		   source,
		   new String[] {
			   "constraints", "numberOfRoundsIsCorrect roundNumbersMustBeInValidRange numberOfMatchesInEachRoundIsCorrect everyClubMustHaveWonInPreviousRound"
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "constraints", "numberOfStatisticsMustEqualNumberOfClubsInSeason"
		   });
		addAnnotation
		  (statisticEClass,
		   source,
		   new String[] {
			   "constraints", "clubMustBeInSeason clubMustBeInOnlyOneStatisticPerTable"
		   });
		addAnnotation
		  (matchEClass,
		   source,
		   new String[] {
			   "constraints", "homeClubAndAwayClubCannotBeTheSame homeClubMustBeInSeason awayClubMustBeInSeason homeClubMustBeInOnlyOneMatchPerRound awayClubMustBeInOnlyOneMatchPerRound dateMustBeWithinSeasonStartAndEnd"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (seasonEClass,
		   source,
		   new String[] {
			   "clubsGenderMustBeEqualToTournamentGender", "self.clubs.gender->forAll(g | g = self.tournament.gender)"
		   });
		addAnnotation
		  (stageEClass,
		   source,
		   new String[] {
			   "roundNumbersMustBeUnique", "self.rounds->isUnique(r | r.roundNumber)"
		   });
		addAnnotation
		  (doubleRoundRobinEClass,
		   source,
		   new String[] {
			   "numberOfRoundsIsCorrect", "self.rounds->size() = (self.season.clubs->size() - 1) * 2",
			   "roundNumbersMustBeInValidRange", "self.rounds.roundNumber->forAll(roundNumber | roundNumber >= 1 and roundNumber <=  ((self.season.clubs->size() - 1) * 2))",
			   "everyClubMustMeetEveryOtherClubHomeAndAway", "self.season.clubs->collect(club1 | self.season.clubs->select(club2 | club1 <> club2)->collect(club2  | self.rounds->collect(round | round.matches)->exists(match | match.homeClub = club1 and match.awayClub = club2)))->forAll(v | v)",
			   "numberOfMatchesInEachRoundIsCorrect", "self.rounds->forAll(round | round.matches->size() = (self.season.clubs->size() /2))"
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "numberOfStatisticsMustEqualNumberOfClubsInSeason", "self.statistics->size() = self.stage.season.clubs->size()"
		   });
		addAnnotation
		  (statisticEClass,
		   source,
		   new String[] {
			   "clubMustBeInSeason", "self.eContainer().stage.season.clubs->includes(self.club)",
			   "clubMustBeInOnlyOneStatisticPerTable", "self.eContainer().statistics.club->count(self.club) = 1"
		   });
		addAnnotation
		  (matchEClass,
		   source,
		   new String[] {
			   "homeClubAndAwayClubCannotBeTheSame", "self.homeClub <> self.awayClub",
			   "homeClubMustBeInSeason", "self.round.stage.season.clubs->includes(self.homeClub)",
			   "awayClubMustBeInSeason", "self.round.stage.season.clubs->includes(self.awayClub)",
			   "homeClubMustBeInOnlyOneMatchPerRound", "self.round.matches.homeClub->count(self.homeClub) = 1 and self.round.matches.awayClub->count(self.homeClub) = 0",
			   "awayClubMustBeInOnlyOneMatchPerRound", "self.round.matches.homeClub->count(self.awayClub) = 0 and self.round.matches.awayClub->count(self.awayClub) = 1"
		   });
	}

} //FtPackageImpl
