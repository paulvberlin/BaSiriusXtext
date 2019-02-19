/**
 */
package de.htw.activity.emf.activity.impl;

import de.htw.activity.emf.activity.ActivityPackage;
import de.htw.activity.emf.activity.ActivityPartition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityPartitionImpl#getActivityPartions <em>Activity Partions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
	/**
	 * The cached value of the '{@link #getActivityPartions() <em>Activity Partions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityPartions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> activityPartions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getActivityPartions() {
		if (activityPartions == null) {
			activityPartions = new EObjectContainmentEList<ActivityPartition>(ActivityPartition.class, this,
					ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS);
		}
		return activityPartions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS:
			return ((InternalEList<?>) getActivityPartions()).basicRemove(otherEnd, msgs);
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
		case ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS:
			return getActivityPartions();
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
		case ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS:
			getActivityPartions().clear();
			getActivityPartions().addAll((Collection<? extends ActivityPartition>) newValue);
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
		case ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS:
			getActivityPartions().clear();
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
		case ActivityPackage.ACTIVITY_PARTITION__ACTIVITY_PARTIONS:
			return activityPartions != null && !activityPartions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityPartitionImpl
