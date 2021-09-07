/**
 */
package ft.impl;

import ft.DoubleRoundRobin;
import ft.FtPackage;
import ft.Statistic;
import ft.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.TableImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link ft.impl.TableImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getStatistics() <em>Statistics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatistics()
	 * @generated
	 * @ordered
	 */
	protected EList<Statistic> statistics;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected DoubleRoundRobin stage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRoundRobin getStage() {
		if (stage != null && stage.eIsProxy()) {
			InternalEObject oldStage = (InternalEObject)stage;
			stage = (DoubleRoundRobin)eResolveProxy(oldStage);
			if (stage != oldStage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtPackage.TABLE__STAGE, oldStage, stage));
			}
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleRoundRobin basicGetStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(DoubleRoundRobin newStage) {
		DoubleRoundRobin oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.TABLE__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statistic> getStatistics() {
		if (statistics == null) {
			statistics = new EObjectContainmentEList<Statistic>(Statistic.class, this, FtPackage.TABLE__STATISTICS);
		}
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtPackage.TABLE__STATISTICS:
				return ((InternalEList<?>)getStatistics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.TABLE__STATISTICS:
				return getStatistics();
			case FtPackage.TABLE__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtPackage.TABLE__STATISTICS:
				getStatistics().clear();
				getStatistics().addAll((Collection<? extends Statistic>)newValue);
				return;
			case FtPackage.TABLE__STAGE:
				setStage((DoubleRoundRobin)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FtPackage.TABLE__STATISTICS:
				getStatistics().clear();
				return;
			case FtPackage.TABLE__STAGE:
				setStage((DoubleRoundRobin)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtPackage.TABLE__STATISTICS:
				return statistics != null && !statistics.isEmpty();
			case FtPackage.TABLE__STAGE:
				return stage != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
