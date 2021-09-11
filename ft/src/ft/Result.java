/**
 */
package ft;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Result#getHomeGoalsFullTime <em>Home Goals Full Time</em>}</li>
 *   <li>{@link ft.Result#getAwayGoalsFullTime <em>Away Goals Full Time</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends AbstractResult {
	/**
	 * Returns the value of the '<em><b>Home Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Goals Full Time</em>' attribute.
	 * @see #setHomeGoalsFullTime(Integer)
	 * @see ft.FtPackage#getResult_HomeGoalsFullTime()
	 * @model unique="false" dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getHomeGoalsFullTime();

	/**
	 * Sets the value of the '{@link ft.Result#getHomeGoalsFullTime <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Goals Full Time</em>' attribute.
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 */
	void setHomeGoalsFullTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Away Goals Full Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goals Full Time</em>' attribute.
	 * @see #setAwayGoalsFullTime(Integer)
	 * @see ft.FtPackage#getResult_AwayGoalsFullTime()
	 * @model unique="false" dataType="ft.Score" required="true"
	 * @generated
	 */
	Integer getAwayGoalsFullTime();

	/**
	 * Sets the value of the '{@link ft.Result#getAwayGoalsFullTime <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Goals Full Time</em>' attribute.
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 */
	void setAwayGoalsFullTime(Integer value);

} // Result
