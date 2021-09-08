/**
 */
package ft;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link ft.Result#getWinner <em>Winner</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getResult()
 * @model
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Home Goals Full Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Goals Full Time</em>' attribute.
	 * @see #setHomeGoalsFullTime(int)
	 * @see ft.FtPackage#getResult_HomeGoalsFullTime()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	int getHomeGoalsFullTime();

	/**
	 * Sets the value of the '{@link ft.Result#getHomeGoalsFullTime <em>Home Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Goals Full Time</em>' attribute.
	 * @see #getHomeGoalsFullTime()
	 * @generated
	 */
	void setHomeGoalsFullTime(int value);

	/**
	 * Returns the value of the '<em><b>Away Goals Full Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goals Full Time</em>' attribute.
	 * @see #setAwayGoalsFullTime(int)
	 * @see ft.FtPackage#getResult_AwayGoalsFullTime()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	int getAwayGoalsFullTime();

	/**
	 * Sets the value of the '{@link ft.Result#getAwayGoalsFullTime <em>Away Goals Full Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away Goals Full Time</em>' attribute.
	 * @see #getAwayGoalsFullTime()
	 * @generated
	 */
	void setAwayGoalsFullTime(int value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link ft.WinnerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see ft.WinnerKind
	 * @see ft.FtPackage#getResult_Winner()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	WinnerKind getWinner();

} // Result
