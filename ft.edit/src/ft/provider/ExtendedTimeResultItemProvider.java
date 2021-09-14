/**
 */
package ft.provider;


import ft.ExtendedTimeResult;
import ft.FtPackage;
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
 * This is the item provider adapter for a {@link ft.ExtendedTimeResult} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedTimeResultItemProvider extends AbstractResultItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedTimeResultItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ExtendedTimeResult.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedTimeResult"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		WinnerKind labelValue = ((ExtendedTimeResult)object).getWinner();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ExtendedTimeResult_type") :
			getString("_UI_ExtendedTimeResult_type") + " " + label;
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

		switch (notification.getFeatureID(ExtendedTimeResult.class)) {
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_FULL_TIME:
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_FULL_TIME:
			case FtPackage.EXTENDED_TIME_RESULT__HOME_GOALS_EXTENDED_TIME:
			case FtPackage.EXTENDED_TIME_RESULT__AWAY_GOALS_EXTENDED_TIME:
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
