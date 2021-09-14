/**
 */
package ft.provider;


import ft.FtPackage;
import ft.PenaltyShootoutResult;
import ft.WinnerKind;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ft.PenaltyShootoutResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PenaltyShootoutResultItemProvider extends AbstractResultItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenaltyShootoutResultItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHomeGoalsFullTimePropertyDescriptor(object);
			addAwayGoalsFullTimePropertyDescriptor(object);
			addHomeGoalsExtendedTimePropertyDescriptor(object);
			addAwayGoalsExtendedTimePropertyDescriptor(object);
			addHomeGoalsPenaltyShootoutPropertyDescriptor(object);
			addAwayGoalsPenaltyShootoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Home Goals Full Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomeGoalsFullTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Result_homeGoalsFullTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Result_homeGoalsFullTime_feature", "_UI_Result_type"),
				 FtPackage.Literals.RESULT__HOME_GOALS_FULL_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Away Goals Full Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwayGoalsFullTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Result_awayGoalsFullTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Result_awayGoalsFullTime_feature", "_UI_Result_type"),
				 FtPackage.Literals.RESULT__AWAY_GOALS_FULL_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Home Goals Extended Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomeGoalsExtendedTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedTimeResult_homeGoalsExtendedTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedTimeResult_homeGoalsExtendedTime_feature", "_UI_ExtendedTimeResult_type"),
				 FtPackage.Literals.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Away Goals Extended Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwayGoalsExtendedTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedTimeResult_awayGoalsExtendedTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedTimeResult_awayGoalsExtendedTime_feature", "_UI_ExtendedTimeResult_type"),
				 FtPackage.Literals.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Home Goals Penalty Shootout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHomeGoalsPenaltyShootoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PenaltyShootoutResult_homeGoalsPenaltyShootout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PenaltyShootoutResult_homeGoalsPenaltyShootout_feature", "_UI_PenaltyShootoutResult_type"),
				 FtPackage.Literals.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Away Goals Penalty Shootout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAwayGoalsPenaltyShootoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PenaltyShootoutResult_awayGoalsPenaltyShootout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PenaltyShootoutResult_awayGoalsPenaltyShootout_feature", "_UI_PenaltyShootoutResult_type"),
				 FtPackage.Literals.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PenaltyShootoutResult.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PenaltyShootoutResult"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		WinnerKind labelValue = ((PenaltyShootoutResult)object).getWinner();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PenaltyShootoutResult_type") :
			getString("_UI_PenaltyShootoutResult_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PenaltyShootoutResult.class)) {
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_FULL_TIME:
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_FULL_TIME:
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_EXTENDED_TIME:
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_EXTENDED_TIME:
			case FtPackage.PENALTY_SHOOTOUT_RESULT__HOME_GOALS_PENALTY_SHOOTOUT:
			case FtPackage.PENALTY_SHOOTOUT_RESULT__AWAY_GOALS_PENALTY_SHOOTOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
