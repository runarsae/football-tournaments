/**
 */
package ft.tests;

import ft.ExtendedTimeResult;
import ft.FtFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extended Time Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedTimeResultTest extends AbstractResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExtendedTimeResultTest.class);
	}

	/**
	 * Constructs a new Extended Time Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedTimeResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Extended Time Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExtendedTimeResult getFixture() {
		return (ExtendedTimeResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtFactory.eINSTANCE.createExtendedTimeResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ExtendedTimeResultTest
