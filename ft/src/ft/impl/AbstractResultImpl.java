/**
 */
package ft.impl;

import ft.AbstractResult;
import ft.ExtendedTimeResult;
import ft.FtPackage;
import ft.PenaltyShootoutResult;
import ft.Result;
import ft.WinnerKind;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.AbstractResultImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link ft.impl.AbstractResultImpl#getHomeGoalsFinal <em>Home Goals Final</em>}</li>
 *   <li>{@link ft.impl.AbstractResultImpl#getAwayGoalsFinal <em>Away Goals Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractResultImpl extends MinimalEObjectImpl.Container implements AbstractResult {
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
	 * The default value of the '{@link #getHomeGoalsFinal() <em>Home Goals Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeGoalsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOME_GOALS_FINAL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAwayGoalsFinal() <em>Away Goals Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayGoalsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AWAY_GOALS_FINAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.ABSTRACT_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WinnerKind getWinner() {
		// Get the winner based on what type of result this is (full time, extended time or penalty shoot-out)
		String resultType = this.eClass().getName();
		
		if (resultType == "Result") {
			// If it is a normal result, calculate winner based on goals at full time
			Result result = (Result) this;
			
			if (result.getHomeGoalsFullTime() > result.getAwayGoalsFullTime()) {
				return WinnerKind.HOME;
			} else if (result.getHomeGoalsFullTime() < result.getAwayGoalsFullTime()) {
				return WinnerKind.AWAY;
			} else {
				return WinnerKind.DRAW;
			}
			
		} else if (resultType == "ExtendedTimeResult") {
			// If this is a result for a match with extended time, 
			// calculate winner based on goals at full time plus goals at extended time
			ExtendedTimeResult result = (ExtendedTimeResult) this;
			
			if (result.getHomeGoalsFinal() > result.getAwayGoalsFinal()) {
				return WinnerKind.HOME;
			} else if (result.getHomeGoalsFinal() < result.getAwayGoalsFinal()) {
				return WinnerKind.AWAY;
			} else {
				throw new IllegalStateException("The result of a match with extended time cannot be DRAW. Consider using a penalty shoout-out result instead.");
			}	
			
		} else {
			// If this is a result for a match with penalty shoot-out,
			// calculate winner based on goals at penalty shoot-out
			PenaltyShootoutResult result = (PenaltyShootoutResult) this;
			
			if (result.getHomeGoalsPenaltyShootout() > result.getAwayGoalsPenaltyShootout()) {
				return WinnerKind.HOME;
			} else if (result.getHomeGoalsPenaltyShootout() < result.getAwayGoalsPenaltyShootout()) {
				return WinnerKind.AWAY;
			} else {
				throw new IllegalStateException("The result of a penalty shoot-out cannot be DRAW.");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getHomeGoalsFinal() {
		// Sum goals at full time and goals at extended time (if present)
		
		String resultType = this.eClass().getName();

		if (resultType == "Result") {
			// No extended time
			Result result = (Result) this;
			
			return result.getHomeGoalsFullTime();
		} else {
			// Extended time or penalty shoot-out
			ExtendedTimeResult result = (ExtendedTimeResult) this;
			
			return result.getHomeGoalsFullTime() + result.getHomeGoalsExtendedTime();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer getAwayGoalsFinal() {
		// Sum goals at full time and goals at extended time (if present)
		
		String resultType = this.eClass().getName();

		if (resultType == "Result") {
			// No extended time
			Result result = (Result) this;
			
			return result.getAwayGoalsFullTime();
		} else {
			// Extended time or penalty shoot-out
			ExtendedTimeResult result = (ExtendedTimeResult) this;
			
			return result.getAwayGoalsFullTime() + result.getAwayGoalsExtendedTime();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.ABSTRACT_RESULT__WINNER:
				return getWinner();
			case FtPackage.ABSTRACT_RESULT__HOME_GOALS_FINAL:
				return getHomeGoalsFinal();
			case FtPackage.ABSTRACT_RESULT__AWAY_GOALS_FINAL:
				return getAwayGoalsFinal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtPackage.ABSTRACT_RESULT__WINNER:
				return getWinner() != WINNER_EDEFAULT;
			case FtPackage.ABSTRACT_RESULT__HOME_GOALS_FINAL:
				return HOME_GOALS_FINAL_EDEFAULT == null ? getHomeGoalsFinal() != null : !HOME_GOALS_FINAL_EDEFAULT.equals(getHomeGoalsFinal());
			case FtPackage.ABSTRACT_RESULT__AWAY_GOALS_FINAL:
				return AWAY_GOALS_FINAL_EDEFAULT == null ? getAwayGoalsFinal() != null : !AWAY_GOALS_FINAL_EDEFAULT.equals(getAwayGoalsFinal());
		}
		return super.eIsSet(featureID);
	}

} //AbstractResultImpl
