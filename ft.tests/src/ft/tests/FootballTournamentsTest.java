/**
 */
package ft.tests;

import ft.FootballTournaments;
import ft.FtFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Football Tournaments</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FootballTournamentsTest extends TestCase {

	/**
	 * The fixture for this Football Tournaments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FootballTournaments fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FootballTournamentsTest.class);
	}

	/**
	 * Constructs a new Football Tournaments test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootballTournamentsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Football Tournaments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FootballTournaments fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Football Tournaments test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FootballTournaments getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtFactory.eINSTANCE.createFootballTournaments());
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

} //FootballTournamentsTest
