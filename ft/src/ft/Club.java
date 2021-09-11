/**
 */
package ft;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Club</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.Club#getName <em>Name</em>}</li>
 *   <li>{@link ft.Club#getGender <em>Gender</em>}</li>
 *   <li>{@link ft.Club#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getClub()
 * @model
 * @generated
 */
public interface Club extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ft.FtPackage#getClub_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ft.Club#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link ft.GenderKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see ft.GenderKind
	 * @see #setGender(GenderKind)
	 * @see ft.FtPackage#getClub_Gender()
	 * @model required="true"
	 * @generated
	 */
	GenderKind getGender();

	/**
	 * Sets the value of the '{@link ft.Club#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see ft.GenderKind
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderKind value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ft.Region#getClubs <em>Clubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' container reference.
	 * @see #setRegion(Region)
	 * @see ft.FtPackage#getClub_Region()
	 * @see ft.Region#getClubs
	 * @model opposite="clubs" required="true" transient="false"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link ft.Club#getRegion <em>Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' container reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // Club
