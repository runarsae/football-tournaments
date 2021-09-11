/**
 */
package ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.AssociationHost#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getAssociationHost()
 * @model
 * @generated
 */
public interface AssociationHost extends AbstractHost {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ft.FtPackage#getAssociationHost_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ft.AssociationHost#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AssociationHost
