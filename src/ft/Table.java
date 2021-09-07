/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Table#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link ft.Table#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='numberOfStatisticsMustEqualNumberOfClubsInStage'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 numberOfStatisticsMustEqualNumberOfClubsInStage='self.statistics-&gt;size() = self.stage.clubs-&gt;size()'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see #setStage(DoubleRoundRobin)
	 * @see ft.FtPackage#getTable_Stage()
	 * @model required="true"
	 * @generated
	 */
	DoubleRoundRobin getStage();

	/**
	 * Sets the value of the '{@link ft.Table#getStage <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(DoubleRoundRobin value);

	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Statistic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' containment reference list.
	 * @see ft.FtPackage#getTable_Statistics()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Statistic> getStatistics();

} // Table
