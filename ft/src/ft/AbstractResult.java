/**
 */
package ft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.AbstractResult#getWinner <em>Winner</em>}</li>
 *   <li>{@link ft.AbstractResult#getHomeGoalsFinal <em>Home Goals Final</em>}</li>
 *   <li>{@link ft.AbstractResult#getAwayGoalsFinal <em>Away Goals Final</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getAbstractResult()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResult extends EObject {

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The literals are from the enumeration {@link ft.WinnerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see ft.WinnerKind
	 * @see ft.FtPackage#getAbstractResult_Winner()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	WinnerKind getWinner();

	/**
	 * Returns the value of the '<em><b>Home Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Goals Final</em>' attribute.
	 * @see ft.FtPackage#getAbstractResult_HomeGoalsFinal()
	 * @model dataType="ft.Score" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Integer getHomeGoalsFinal();

	/**
	 * Returns the value of the '<em><b>Away Goals Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away Goals Final</em>' attribute.
	 * @see ft.FtPackage#getAbstractResult_AwayGoalsFinal()
	 * @model dataType="ft.Score" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Integer getAwayGoalsFinal();
} // AbstractResult
