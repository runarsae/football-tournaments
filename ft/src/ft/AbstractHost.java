/**
 */
package ft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ft.AbstractHost#getTournaments <em>Tournaments</em>}</li>
 * </ul>
 *
 * @see ft.FtPackage#getAbstractHost()
 * @model abstract="true"
 * @generated
 */
public interface AbstractHost extends EObject {
	/**
	 * Returns the value of the '<em><b>Tournaments</b></em>' containment reference list.
	 * The list contents are of type {@link ft.Tournament}.
	 * It is bidirectional and its opposite is '{@link ft.Tournament#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tournaments</em>' containment reference list.
	 * @see ft.FtPackage#getAbstractHost_Tournaments()
	 * @see ft.Tournament#getHost
	 * @model opposite="host" containment="true"
	 * @generated
	 */
	EList<Tournament> getTournaments();

} // AbstractHost
