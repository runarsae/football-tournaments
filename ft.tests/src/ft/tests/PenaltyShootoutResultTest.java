/**
 */
package ft.tests;

import ft.FtFactory;
import ft.PenaltyShootoutResult;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Penalty Shootout Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PenaltyShootoutResultTest extends AbstractResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PenaltyShootoutResultTest.class);
	}

	/**
	 * Constructs a new Penalty Shootout Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenaltyShootoutResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Penalty Shootout Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PenaltyShootoutResult getFixture() {
		return (PenaltyShootoutResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtFactory.eINSTANCE.createPenaltyShootoutResult());
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

} //PenaltyShootoutResultTest
