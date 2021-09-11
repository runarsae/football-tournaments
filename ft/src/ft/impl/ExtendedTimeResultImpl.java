/**
 */
package ft.impl;

import ft.ExtendedTimeResult;
import ft.FtPackage;

import ft.Result;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Time Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.ExtendedTimeResultImpl#getHomeGoalsFullTime <em>Home Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.ExtendedTimeResultImpl#getAwayGoalsFullTime <em>Away Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.ExtendedTimeResultImpl#getHomeGoalsExtendedTime <em>Home Goals Extended Time</em>}</li>
 *   <li>{@link ft.impl.ExtendedTimeResultImpl#getAwayGoalsExtendedTime <em>Away Goals Extended Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedTimeResultImpl extends AbstractResultImpl implements ExtendedTimeResult {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedTimeResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.EXTENDED_TIME_RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME, oldHomeGoalsFullTime, homeGoalsFullTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME, oldAwayGoalsFullTime, awayGoalsFullTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME, oldHomeGoalsExtendedTime, homeGoalsExtendedTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME, oldAwayGoalsExtendedTime, awayGoalsExtendedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME:
				return getHomeGoalsFullTime();
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME:
				return getAwayGoalsFullTime();
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME:
				return getHomeGoalsExtendedTime();
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME:
				return getAwayGoalsExtendedTime();
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
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime((Integer)newValue);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime((Integer)newValue);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME:
				setHomeGoalsExtendedTime((Integer)newValue);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME:
				setAwayGoalsExtendedTime((Integer)newValue);
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
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime(HOME_GOALS_FULL_TIME_EDEFAULT);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime(AWAY_GOALS_FULL_TIME_EDEFAULT);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME:
				setHomeGoalsExtendedTime(HOME_GOALS_EXTENDED_TIME_EDEFAULT);
				return;
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME:
				setAwayGoalsExtendedTime(AWAY_GOALS_EXTENDED_TIME_EDEFAULT);
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
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME:
				return HOME_GOALS_FULL_TIME_EDEFAULT == null ? homeGoalsFullTime != null : !HOME_GOALS_FULL_TIME_EDEFAULT.equals(homeGoalsFullTime);
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME:
				return AWAY_GOALS_FULL_TIME_EDEFAULT == null ? awayGoalsFullTime != null : !AWAY_GOALS_FULL_TIME_EDEFAULT.equals(awayGoalsFullTime);
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME:
				return HOME_GOALS_EXTENDED_TIME_EDEFAULT == null ? homeGoalsExtendedTime != null : !HOME_GOALS_EXTENDED_TIME_EDEFAULT.equals(homeGoalsExtendedTime);
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME:
				return AWAY_GOALS_EXTENDED_TIME_EDEFAULT == null ? awayGoalsExtendedTime != null : !AWAY_GOALS_EXTENDED_TIME_EDEFAULT.equals(awayGoalsExtendedTime);
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
				case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME: return FtPackage.RESULT__HOME_GOALS_FULL_TIME;
				case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME: return FtPackage.RESULT__AWAY_GOALS_FULL_TIME;
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
				case FtPackage.RESULT__HOME_GOALS_FULL_TIME: return FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME;
				case FtPackage.RESULT__AWAY_GOALS_FULL_TIME: return FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME;
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
		result.append(')');
		return result.toString();
	}

} //ExtendedTimeResultImpl
