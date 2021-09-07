/**
 */
package ft.impl;

import ft.Club;
import ft.DoubleRoundRobin;
import ft.FtFactory;
import ft.FtPackage;
import ft.Statistic;
import ft.Table;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Round Robin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.DoubleRoundRobinImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleRoundRobinImpl extends StageImpl implements DoubleRoundRobin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleRoundRobinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.DOUBLE_ROUND_ROBIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		Table table = basicGetTable();
		return table != null && table.eIsProxy() ? (Table)eResolveProxy((InternalEObject)table) : table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Table basicGetTable() {
		FtFactory factory = FtFactory.eINSTANCE;
		
		Table table = factory.createTable();
		
		// Generate a statistic for each club in the stage
		for (Club club : this.getClubs()) {
			Statistic statistic = factory.createStatistic();
			statistic.setClub(club);
			table.setStage(this);
			table.getStatistics().add(statistic);
		}
		
		// TODO: Sort statistics on position
		
		return table;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.DOUBLE_ROUND_ROBIN__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtPackage.DOUBLE_ROUND_ROBIN__TABLE:
				return basicGetTable() != null;
		}
		return super.eIsSet(featureID);
	}

} //DoubleRoundRobinImpl
