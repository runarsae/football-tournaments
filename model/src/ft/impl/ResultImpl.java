/**
 */
package ft.impl;

import ft.FtPackage;
import ft.Result;
import ft.WinnerKind;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.ResultImpl#getHomeGoalsFullTime <em>Home Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.ResultImpl#getAwayGoalsFullTime <em>Away Goals Full Time</em>}</li>
 *   <li>{@link ft.impl.ResultImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The default value of the '{@link #getHomeGoalsFullTime() <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_GOALS_FULL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHomeGoalsFullTime() <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected int homeGoalsFullTime = HOME_GOALS_FULL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAwayGoalsFullTime() <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_GOALS_FULL_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAwayGoalsFullTime() <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 * @ordered
	 */
	protected int awayGoalsFullTime = AWAY_GOALS_FULL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final WinnerKind WINNER_EDEFAULT = WinnerKind.DRAW;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHomeGoalsFullTime() {
		return homeGoalsFullTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeGoalsFullTime(int newHomeGoalsFullTime) {
		int oldHomeGoalsFullTime = homeGoalsFullTime;
		homeGoalsFullTime = newHomeGoalsFullTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.RESULT__HOME_GOALS_FULL_TIME, oldHomeGoalsFullTime, homeGoalsFullTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAwayGoalsFullTime() {
		return awayGoalsFullTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwayGoalsFullTime(int newAwayGoalsFullTime) {
		int oldAwayGoalsFullTime = awayGoalsFullTime;
		awayGoalsFullTime = newAwayGoalsFullTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.RESULT__AWAY_GOALS_FULL_TIME, oldAwayGoalsFullTime, awayGoalsFullTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WinnerKind getWinner() {
		if (this.homeGoalsFullTime > this.awayGoalsFullTime) {
			return WinnerKind.HOME;
		} else if (this.homeGoalsFullTime < this.awayGoalsFullTime) {
			return WinnerKind.AWAY;
		}
		
		return WinnerKind.DRAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.RESULT__HOME_GOALS_FULL_TIME:
				return getHomeGoalsFullTime();
			case FtPackage.RESULT__AWAY_GOALS_FULL_TIME:
				return getAwayGoalsFullTime();
			case FtPackage.RESULT__WINNER:
				return getWinner();
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
			case FtPackage.RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime((Integer)newValue);
				return;
			case FtPackage.RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime((Integer)newValue);
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
			case FtPackage.RESULT__HOME_GOALS_FULL_TIME:
				setHomeGoalsFullTime(HOME_GOALS_FULL_TIME_EDEFAULT);
				return;
			case FtPackage.RESULT__AWAY_GOALS_FULL_TIME:
				setAwayGoalsFullTime(AWAY_GOALS_FULL_TIME_EDEFAULT);
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
			case FtPackage.RESULT__HOME_GOALS_FULL_TIME:
				return homeGoalsFullTime != HOME_GOALS_FULL_TIME_EDEFAULT;
			case FtPackage.RESULT__AWAY_GOALS_FULL_TIME:
				return awayGoalsFullTime != AWAY_GOALS_FULL_TIME_EDEFAULT;
			case FtPackage.RESULT__WINNER:
				return getWinner() != WINNER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //ResultImpl
