/**
 */
package ft.impl;

import ft.ExtendedTimeResult;
import ft.FtPackage;
import ft.PenaltyShootoutResult;

import ft.Result;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Penalty Shootout Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getHomeGoalsFullTime <em>Home Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getAwayGoalsFullTime <em>Away Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getHomeGoalsExtendedTime <em>Home Goals Extended Time</em>}</li>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getAwayGoalsExtendedTime <em>Away Goals Extended Time</em>}</li>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getHomeGoalsPenaltyShootout <em>Home Goals Penalty Shootout</em>}</li>
 *   <li>{@link ft.impl.PenaltyShootoutResultImpl#getAwayGoalsPenaltyShootout <em>Away Goals Penalty Shootout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PenaltyShootoutResultImpl extends AbstractResultImpl implements PenaltyShootoutResult {
	/**
	 * The default value of the '{@link #getHomeGoalsFullTime() <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOME_GOALS_FULL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeGoalsFullTime() <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected Integer homeGoalsFullTime = HOME_GOALS_FULL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayGoalsFullTime() <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AWAY_GOALS_FULL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwayGoalsFullTime() <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected Integer awayGoalsFullTime = AWAY_GOALS_FULL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeGoalsExtendedTime() <em>Home Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsExtendedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOME_GOALS_EXTENDED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeGoalsExtendedTime() <em>Home Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsExtendedTime()
	 * @generated
	 * @ordered
	 */
	protected Integer homeGoalsExtendedTime = HOME_GOALS_EXTENDED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayGoalsExtendedTime() <em>Away Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsExtendedTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AWAY_GOALS_EXTENDED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwayGoalsExtendedTime() <em>Away Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsExtendedTime()
	 * @generated
	 * @ordered
	 */
	protected Integer awayGoalsExtendedTime = AWAY_GOALS_EXTENDED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomeGoalsPenaltyShootout() <em>Home Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsPenaltyShootout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOME_GOALS_PENALTY_SHOOTOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeGoalsPenaltyShootout() <em>Home Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsPenaltyShootout()
	 * @generated
	 * @ordered
	 */
	protected Integer homeGoalsPenaltyShootout = HOME_GOALS_PENALTY_SHOOTOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayGoalsPenaltyShootout() <em>Away Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsPenaltyShootout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AWAY_GOALS_PENALTY_SHOOTOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAwayGoalsPenaltyShootout() <em>Away Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsPenaltyShootout()
	 * @generated
	 * @ordered
	 */
	protected Integer awayGoalsPenaltyShootout = AWAY_GOALS_PENALTY_SHOOTOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenaltyShootoutResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.PENALTY_SHOOTOUT_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHomeGoalsFullTime() {
		return homeGoalsFullTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeGoalsFullTime(Integer newHomeGoalsFullTime) {
		Integer oldHomeGoalsFullTime = homeGoalsFullTime;
		homeGoalsFullTime = newHomeGoalsFullTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME, oldHomeGoalsFullTime, homeGoalsFullTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAwayGoalsFullTime() {
		return awayGoalsFullTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayGoalsFullTime(Integer newAwayGoalsFullTime) {
		Integer oldAwayGoalsFullTime = awayGoalsFullTime;
		awayGoalsFullTime = newAwayGoalsFullTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME, oldAwayGoalsFullTime, awayGoalsFullTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHomeGoalsExtendedTime() {
		return homeGoalsExtendedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeGoalsExtendedTime(Integer newHomeGoalsExtendedTime) {
		Integer oldHomeGoalsExtendedTime = homeGoalsExtendedTime;
		homeGoalsExtendedTime = newHomeGoalsExtendedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME, oldHomeGoalsExtendedTime, homeGoalsExtendedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAwayGoalsExtendedTime() {
		return awayGoalsExtendedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayGoalsExtendedTime(Integer newAwayGoalsExtendedTime) {
		Integer oldAwayGoalsExtendedTime = awayGoalsExtendedTime;
		awayGoalsExtendedTime = newAwayGoalsExtendedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME, oldAwayGoalsExtendedTime, awayGoalsExtendedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHomeGoalsPenaltyShootout() {
		return homeGoalsPenaltyShootout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeGoalsPenaltyShootout(Integer newHomeGoalsPenaltyShootout) {
		Integer oldHomeGoalsPenaltyShootout = homeGoalsPenaltyShootout;
		homeGoalsPenaltyShootout = newHomeGoalsPenaltyShootout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT, oldHomeGoalsPenaltyShootout, homeGoalsPenaltyShootout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAwayGoalsPenaltyShootout() {
		return awayGoalsPenaltyShootout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayGoalsPenaltyShootout(Integer newAwayGoalsPenaltyShootout) {
		Integer oldAwayGoalsPenaltyShootout = awayGoalsPenaltyShootout;
		awayGoalsPenaltyShootout = newAwayGoalsPenaltyShootout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT, oldAwayGoalsPenaltyShootout, awayGoalsPenaltyShootout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME:
				return getHomeGoalsFullTime();
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME:
				return getAwayGoalsFullTime();
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME:
				return getHomeGoalsExtendedTime();
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME:
				return getAwayGoalsExtendedTime();
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT:
				return getHomeGoalsPenaltyShootout();
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT:
				return getAwayGoalsPenaltyShootout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime((Integer)newValue);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime((Integer)newValue);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME:
				setHomeGoalsExtendedTime((Integer)newValue);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME:
				setAwayGoalsExtendedTime((Integer)newValue);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT:
				setHomeGoalsPenaltyShootout((Integer)newValue);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT:
				setAwayGoalsPenaltyShootout((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime(HOME_GOALS_FULL_TIME_EDEFAULT);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime(AWAY_GOALS_FULL_TIME_EDEFAULT);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME:
				setHomeGoalsExtendedTime(HOME_GOALS_EXTENDED_TIME_EDEFAULT);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME:
				setAwayGoalsExtendedTime(AWAY_GOALS_EXTENDED_TIME_EDEFAULT);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT:
				setHomeGoalsPenaltyShootout(HOME_GOALS_PENALTY_SHOOTOUT_EDEFAULT);
				return;
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT:
				setAwayGoalsPenaltyShootout(AWAY_GOALS_PENALTY_SHOOTOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME:
				return HOME_GOALS_FULL_TIME_EDEFAULT == null ? homeGoalsFullTime != null : !HOME_GOALS_FULL_TIME_EDEFAULT.equals(homeGoalsFullTime);
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME:
				return AWAY_GOALS_FULL_TIME_EDEFAULT == null ? awayGoalsFullTime != null : !AWAY_GOALS_FULL_TIME_EDEFAULT.equals(awayGoalsFullTime);
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME:
				return HOME_GOALS_EXTENDED_TIME_EDEFAULT == null ? homeGoalsExtendedTime != null : !HOME_GOALS_EXTENDED_TIME_EDEFAULT.equals(homeGoalsExtendedTime);
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME:
				return AWAY_GOALS_EXTENDED_TIME_EDEFAULT == null ? awayGoalsExtendedTime != null : !AWAY_GOALS_EXTENDED_TIME_EDEFAULT.equals(awayGoalsExtendedTime);
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT:
				return HOME_GOALS_PENALTY_SHOOTOUT_EDEFAULT == null ? homeGoalsPenaltyShootout != null : !HOME_GOALS_PENALTY_SHOOTOUT_EDEFAULT.equals(homeGoalsPenaltyShootout);
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT:
				return AWAY_GOALS_PENALTY_SHOOTOUT_EDEFAULT == null ? awayGoalsPenaltyShootout != null : !AWAY_GOALS_PENALTY_SHOOTOUT_EDEFAULT.equals(awayGoalsPenaltyShootout);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Result.class) {
			switch (derivedFeatureID) {
				case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME: return FtPackage.RESULT__HOME_GOALS_FULL_TIME;
				case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME: return FtPackage.RESULT__AWAY_GOALS_FULL_TIME;
				default: return -1;
			}
		}
		if (baseClass == ExtendedTimeResult.class) {
			switch (derivedFeatureID) {
				case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME: return FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME;
				case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME: return FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Result.class) {
			switch (baseFeatureID) {
				case FtPackage.RESULT__HOME_GOALS_FULL_TIME: return FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME;
				case FtPackage.RESULT__AWAY_GOALS_FULL_TIME: return FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME;
				default: return -1;
			}
		}
		if (baseClass == ExtendedTimeResult.class) {
			switch (baseFeatureID) {
				case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME: return FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME;
				case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME: return FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (homeGoalsFullTime: ");
		result.append(homeGoalsFullTime);
		result.append(", awayGoalsFullTime: ");
		result.append(awayGoalsFullTime);
		result.append(", homeGoalsExtendedTime: ");
		result.append(homeGoalsExtendedTime);
		result.append(", awayGoalsExtendedTime: ");
		result.append(awayGoalsExtendedTime);
		result.append(", homeGoalsPenaltyShootout: ");
		result.append(homeGoalsPenaltyShootout);
		result.append(", awayGoalsPenaltyShootout: ");
		result.append(awayGoalsPenaltyShootout);
		result.append(')');
		return result.toString();
	}

} //PenaltyShootoutResultImpl
