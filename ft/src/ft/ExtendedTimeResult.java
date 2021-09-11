/**
 */
package ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Time Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.ExtendedTimeResult#getHomeGoalsExtendedTime <em>Home Goals Extended Time</em>}</li>
 *   <li>{@link ft.ExtendedTimeResult#getAwayGoalsExtendedTime <em>Away Goals Extended Time</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getExtendedTimeResult()
 * @model
 * @generated
 */
public interface ExtendedTimeResult extends AbstractResult, Result {
	/**
	 * Returns the value of the '<em><b>Home Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Goals Extended Time</em>' attribute.
	 * @see #setHomeGoalsExtendedTime(Integer)
	 * @see ft.FtPackage#getExtendedTimeResult_HomeGoalsExtendedTime()
	 * @model dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getHomeGoalsExtendedTime();

	/**
	 * Sets the value of the '{@link ft.ExtendedTimeResult#getHomeGoalsExtendedTime <em>Home Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Goals Extended Time</em>' attribute.
	 * @see #getHomeGoalsExtendedTime()
	 * @generated
	 */
	void setHomeGoalsExtendedTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Away Goals Extended Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goals Extended Time</em>' attribute.
	 * @see #setAwayGoalsExtendedTime(Integer)
	 * @see ft.FtPackage#getExtendedTimeResult_AwayGoalsExtendedTime()
	 * @model dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getAwayGoalsExtendedTime();

	/**
	 * Sets the value of the '{@link ft.ExtendedTimeResult#getAwayGoalsExtendedTime <em>Away Goals Extended Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Goals Extended Time</em>' attribute.
	 * @see #getAwayGoalsExtendedTime()
	 * @generated
	 */
	void setAwayGoalsExtendedTime(Integer value);

} // ExtendedTimeResult
