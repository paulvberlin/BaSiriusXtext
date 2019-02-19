/**
 */
package de.htw.activity.emf.activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.ActivityPartition#getActivityPartions <em>Activity Partions</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityPartition()
 * @model
 * @generated
 */
public interface ActivityPartition extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Activity Partions</b></em>' containment reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Partions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Partions</em>' containment reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityPartition_ActivityPartions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPartition> getActivityPartions();

} // ActivityPartition
