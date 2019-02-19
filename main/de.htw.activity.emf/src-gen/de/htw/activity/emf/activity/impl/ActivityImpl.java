/**
 */
package de.htw.activity.emf.activity.impl;

import de.htw.activity.emf.activity.Activity;
import de.htw.activity.emf.activity.ActivityEdge;
import de.htw.activity.emf.activity.ActivityGroup;
import de.htw.activity.emf.activity.ActivityNode;
import de.htw.activity.emf.activity.ActivityPackage;
import de.htw.activity.emf.activity.ActivityParameterNode;
import de.htw.activity.emf.activity.ActivityPartition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityImpl#getActivityparameternode <em>Activityparameternode</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityImpl#getActivityPartion <em>Activity Partion</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.impl.ActivityImpl#getActivityGroups <em>Activity Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edges;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * The cached value of the '{@link #getActivityparameternode() <em>Activityparameternode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityparameternode()
	 * @generated
	 * @ordered
	 */
	protected ActivityParameterNode activityparameternode;

	/**
	 * The cached value of the '{@link #getActivityPartion() <em>Activity Partion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityPartion()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> activityPartion;

	/**
	 * The cached value of the '{@link #getActivityGroups() <em>Activity Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> activityGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this,
					ActivityPackage.ACTIVITY__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this,
					ActivityPackage.ACTIVITY__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode getActivityparameternode() {
		return activityparameternode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityparameternode(ActivityParameterNode newActivityparameternode,
			NotificationChain msgs) {
		ActivityParameterNode oldActivityparameternode = activityparameternode;
		activityparameternode = newActivityparameternode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE, oldActivityparameternode,
					newActivityparameternode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityparameternode(ActivityParameterNode newActivityparameternode) {
		if (newActivityparameternode != activityparameternode) {
			NotificationChain msgs = null;
			if (activityparameternode != null)
				msgs = ((InternalEObject) activityparameternode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE, null, msgs);
			if (newActivityparameternode != null)
				msgs = ((InternalEObject) newActivityparameternode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE, null, msgs);
			msgs = basicSetActivityparameternode(newActivityparameternode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE,
					newActivityparameternode, newActivityparameternode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getActivityPartion() {
		if (activityPartion == null) {
			activityPartion = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this,
					ActivityPackage.ACTIVITY__ACTIVITY_PARTION);
		}
		return activityPartion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getActivityGroups() {
		if (activityGroups == null) {
			activityGroups = new EObjectContainmentEList<ActivityGroup>(ActivityGroup.class, this,
					ActivityPackage.ACTIVITY__ACTIVITY_GROUPS);
		}
		return activityGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivityPackage.ACTIVITY__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
		case ActivityPackage.ACTIVITY__NODES:
			return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
		case ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE:
			return basicSetActivityparameternode(null, msgs);
		case ActivityPackage.ACTIVITY__ACTIVITY_GROUPS:
			return ((InternalEList<?>) getActivityGroups()).basicRemove(otherEnd, msgs);
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
		case ActivityPackage.ACTIVITY__EDGES:
			return getEdges();
		case ActivityPackage.ACTIVITY__NODES:
			return getNodes();
		case ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE:
			return getActivityparameternode();
		case ActivityPackage.ACTIVITY__ACTIVITY_PARTION:
			return getActivityPartion();
		case ActivityPackage.ACTIVITY__ACTIVITY_GROUPS:
			return getActivityGroups();
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
		case ActivityPackage.ACTIVITY__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends ActivityEdge>) newValue);
			return;
		case ActivityPackage.ACTIVITY__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends ActivityNode>) newValue);
			return;
		case ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE:
			setActivityparameternode((ActivityParameterNode) newValue);
			return;
		case ActivityPackage.ACTIVITY__ACTIVITY_PARTION:
			getActivityPartion().clear();
			getActivityPartion().addAll((Collection<? extends ActivityPartition>) newValue);
			return;
		case ActivityPackage.ACTIVITY__ACTIVITY_GROUPS:
			getActivityGroups().clear();
			getActivityGroups().addAll((Collection<? extends ActivityGroup>) newValue);
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
		case ActivityPackage.ACTIVITY__EDGES:
			getEdges().clear();
			return;
		case ActivityPackage.ACTIVITY__NODES:
			getNodes().clear();
			return;
		case ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE:
			setActivityparameternode((ActivityParameterNode) null);
			return;
		case ActivityPackage.ACTIVITY__ACTIVITY_PARTION:
			getActivityPartion().clear();
			return;
		case ActivityPackage.ACTIVITY__ACTIVITY_GROUPS:
			getActivityGroups().clear();
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
		case ActivityPackage.ACTIVITY__EDGES:
			return edges != null && !edges.isEmpty();
		case ActivityPackage.ACTIVITY__NODES:
			return nodes != null && !nodes.isEmpty();
		case ActivityPackage.ACTIVITY__ACTIVITYPARAMETERNODE:
			return activityparameternode != null;
		case ActivityPackage.ACTIVITY__ACTIVITY_PARTION:
			return activityPartion != null && !activityPartion.isEmpty();
		case ActivityPackage.ACTIVITY__ACTIVITY_GROUPS:
			return activityGroups != null && !activityGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
