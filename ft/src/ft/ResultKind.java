/**
 */
package ft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Result Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ft.FtPackage#getResultKind()
 * @model
 * @generated
 */
public enum ResultKind implements Enumerator {
	/**
	 * The '<em><b>DRAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW_VALUE
	 * @generated
	 * @ordered
	 */
	DRAW(0, "DRAW", "DRAW"),

	/**
	 * The '<em><b>WIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_VALUE
	 * @generated
	 * @ordered
	 */
	WIN(1, "WIN", "WIN"),

	/**
	 * The '<em><b>LOSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS(2, "LOSS", "LOSS");

	/**
	 * The '<em><b>DRAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAW_VALUE = 0;

	/**
	 * The '<em><b>WIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIN_VALUE = 1;

	/**
	 * The '<em><b>LOSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Result Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResultKind[] VALUES_ARRAY =
		new ResultKind[] {
			DRAW,
			WIN,
			LOSS,
		};

	/**
	 * A public read-only list of all the '<em><b>Result Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResultKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Result Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResultKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Result Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResultKind get(int value) {
		switch (value) {
			case DRAW_VALUE: return DRAW;
			case WIN_VALUE: return WIN;
			case LOSS_VALUE: return LOSS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResultKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ResultKind
