/**
 */
package ft.impl;

import ft.*;
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
import ft.Statistic;
import ft.Table;
import ft.Tournament;
import ft.WinnerKind;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtFactoryImpl extends EFactoryImpl implements FtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FtFactory init() {
		try {
			FtFactory theFtFactory = (FtFactory)EPackage.Registry.INSTANCE.getEFactory(FtPackage.eNS_URI);
			if (theFtFactory != null) {
				return theFtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FtPackage.FOOTBALL_TOURNAMENTS: return createFootballTournaments();
			case FtPackage.REGION: return createRegion();
			case FtPackage.CLUB: return createClub();
			case FtPackage.TOURNAMENT: return createTournament();
			case FtPackage.SEASON: return createSeason();
			case FtPackage.STAGE: return createStage();
			case FtPackage.DOUBLE_ROUND_ROBIN: return createDoubleRoundRobin();
			case FtPackage.SINGLE_ELIMINATION: return createSingleElimination();
			case FtPackage.TABLE: return createTable();
			case FtPackage.STATISTIC: return createStatistic();
			case FtPackage.ROUND: return createRound();
			case FtPackage.MATCH: return createMatch();
			case FtPackage.RESULT: return createResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FtPackage.GENDER_KIND:
				return createGenderKindFromString(eDataType, initialValue);
			case FtPackage.RESULT_KIND:
				return createResultKindFromString(eDataType, initialValue);
			case FtPackage.WINNER_KIND:
				return createWinnerKindFromString(eDataType, initialValue);
			case FtPackage.ELOCAL_DATE:
				return createELocalDateFromString(eDataType, initialValue);
			case FtPackage.ELOCAL_DATE_TIME:
				return createELocalDateTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FtPackage.GENDER_KIND:
				return convertGenderKindToString(eDataType, instanceValue);
			case FtPackage.RESULT_KIND:
				return convertResultKindToString(eDataType, instanceValue);
			case FtPackage.WINNER_KIND:
				return convertWinnerKindToString(eDataType, instanceValue);
			case FtPackage.ELOCAL_DATE:
				return convertELocalDateToString(eDataType, instanceValue);
			case FtPackage.ELOCAL_DATE_TIME:
				return convertELocalDateTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootballTournaments createFootballTournaments() {
		FootballTournamentsImpl footballTournaments = new FootballTournamentsImpl();
		return footballTournaments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament createTournament() {
		TournamentImpl tournament = new TournamentImpl();
		return tournament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Club createClub() {
		ClubImpl club = new ClubImpl();
		return club;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRoundRobin createDoubleRoundRobin() {
		DoubleRoundRobinImpl doubleRoundRobin = new DoubleRoundRobinImpl();
		return doubleRoundRobin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElimination createSingleElimination() {
		SingleEliminationImpl singleElimination = new SingleEliminationImpl();
		return singleElimination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Round createRound() {
		RoundImpl round = new RoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistic createStatistic() {
		StatisticImpl statistic = new StatisticImpl();
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultKind createResultKindFromString(EDataType eDataType, String initialValue) {
		ResultKind result = ResultKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WinnerKind createWinnerKindFromString(EDataType eDataType, String initialValue) {
		WinnerKind result = WinnerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWinnerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderKind createGenderKindFromString(EDataType eDataType, String initialValue) {
		GenderKind result = GenderKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LocalDate createELocalDateFromString(EDataType eDataType, String initialValue) {
		return LocalDate.parse(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertELocalDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LocalDateTime createELocalDateTimeFromString(EDataType eDataType, String initialValue) {
		return LocalDateTime.parse(initialValue);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertELocalDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtPackage getFtPackage() {
		return (FtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FtPackage getPackage() {
		return FtPackage.eINSTANCE;
	}

} //FtFactoryImpl
