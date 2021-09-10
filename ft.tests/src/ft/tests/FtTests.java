/**
 */
package ft.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ft</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new FtTests("ft Tests");
		suite.addTestSuite(SeasonTest.class);
		suite.addTestSuite(DoubleRoundRobinTest.class);
		suite.addTestSuite(StatisticTest.class);
		suite.addTestSuite(ResultTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtTests(String name) {
		super(name);
	}

} //FtTests
