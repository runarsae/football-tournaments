/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Region#getName <em>Name</em>}</li>
 *   <li>{@link ft.Region#getClubs <em>Clubs</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getRegion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='clubsMustBeUnique'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 clubsMustBeUnique='self.clubs-&gt;isUnique(club | club.name + club.gender)'"
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ft.FtPackage#getRegion_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ft.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Clubs</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Club}.
	 * It is bidirectional and its opposite is '{@link ft.Club#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clubs</em>' containment reference list.
	 * @see ft.FtPackage#getRegion_Clubs()
	 * @see ft.Club#getRegion
	 * @model opposite="region" containment="true"
	 * @generated
	 */
	EList<Club> getClubs();

} // Region
