/**
 */
package de.htw.activity.emf.activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link de.htw.activity.emf.activity.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityNode_Incoming()
	 * @see de.htw.activity.emf.activity.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link de.htw.activity.emf.activity.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityNode_Outgoing()
	 * @see de.htw.activity.emf.activity.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

} // ActivityNode
