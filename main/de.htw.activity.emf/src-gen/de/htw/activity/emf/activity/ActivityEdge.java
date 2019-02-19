/**
 */
package de.htw.activity.emf.activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.ActivityEdge#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityEdge()
 * @model abstract="true"
 * @generated
 */
public interface ActivityEdge extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.htw.activity.emf.activity.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityEdge_Target()
	 * @see de.htw.activity.emf.activity.ActivityNode#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link de.htw.activity.emf.activity.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.htw.activity.emf.activity.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityEdge_Source()
	 * @see de.htw.activity.emf.activity.ActivityNode#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link de.htw.activity.emf.activity.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

} // ActivityEdge
