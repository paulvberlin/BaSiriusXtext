/**
 */
package de.htw.activity.emf.activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.Activity#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.Activity#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.Activity#getActivityparameternode <em>Activityparameternode</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.Activity#getActivityPartion <em>Activity Partion</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.Activity#getActivityGroups <em>Activity Groups</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Activityparameternode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activityparameternode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityparameternode</em>' containment reference.
	 * @see #setActivityparameternode(ActivityParameterNode)
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity_Activityparameternode()
	 * @model containment="true"
	 * @generated
	 */
	ActivityParameterNode getActivityparameternode();

	/**
	 * Sets the value of the '{@link de.htw.activity.emf.activity.Activity#getActivityparameternode <em>Activityparameternode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activityparameternode</em>' containment reference.
	 * @see #getActivityparameternode()
	 * @generated
	 */
	void setActivityparameternode(ActivityParameterNode value);

	/**
	 * Returns the value of the '<em><b>Activity Partion</b></em>' reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Partion</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Partion</em>' reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity_ActivityPartion()
	 * @model
	 * @generated
	 */
	EList<ActivityPartition> getActivityPartion();

	/**
	 * Returns the value of the '<em><b>Activity Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Groups</em>' containment reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivity_ActivityGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getActivityGroups();

} // Activity
