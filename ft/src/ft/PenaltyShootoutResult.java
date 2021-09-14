/**
 */
package ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Penalty Shootout Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.PenaltyShootoutResult#getHomeGoalsPenaltyShootout <em>Home Goals Penalty Shootout</em>}</li>
 *   <li>{@link ft.PenaltyShootoutResult#getAwayGoalsPenaltyShootout <em>Away Goals Penalty Shootout</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getPenaltyShootoutResult()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='extendedTimeResultMustBeDraw'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 extendedTimeResultMustBeDraw='self.homeGoalsExtendedTime = self.awayGoalsExtendedTime'"
 * @generated
 */
public interface PenaltyShootoutResult extends AbstractResult, ExtendedTimeResult {
	/**
	 * Returns the value of the '<em><b>Home Goals Penalty Shootout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Goals Penalty Shootout</em>' attribute.
	 * @see #setHomeGoalsPenaltyShootout(Integer)
	 * @see ft.FtPackage#getPenaltyShootoutResult_HomeGoalsPenaltyShootout()
	 * @model dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getHomeGoalsPenaltyShootout();

	/**
	 * Sets the value of the '{@link ft.PenaltyShootoutResult#getHomeGoalsPenaltyShootout <em>Home Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Goals Penalty Shootout</em>' attribute.
	 * @see #getHomeGoalsPenaltyShootout()
	 * @generated
	 */
	void setHomeGoalsPenaltyShootout(Integer value);

	/**
	 * Returns the value of the '<em><b>Away Goals Penalty Shootout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goals Penalty Shootout</em>' attribute.
	 * @see #setAwayGoalsPenaltyShootout(Integer)
	 * @see ft.FtPackage#getPenaltyShootoutResult_AwayGoalsPenaltyShootout()
	 * @model dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getAwayGoalsPenaltyShootout();

	/**
	 * Sets the value of the '{@link ft.PenaltyShootoutResult#getAwayGoalsPenaltyShootout <em>Away Goals Penalty Shootout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Goals Penalty Shootout</em>' attribute.
	 * @see #getAwayGoalsPenaltyShootout()
	 * @generated
	 */
	void setAwayGoalsPenaltyShootout(Integer value);

} // PenaltyShootoutResult
