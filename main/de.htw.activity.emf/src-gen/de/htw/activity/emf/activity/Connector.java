/**
 */
package de.htw.activity.emf.activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.Connector#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference.
	 * @see #setConnected(Connector)
	 * @see de.htw.activity.emf.activity.ActivityPackage#getConnector_Connected()
	 * @model
	 * @generated
	 */
	Connector getConnected();

	/**
	 * Sets the value of the '{@link de.htw.activity.emf.activity.Connector#getConnected <em>Connected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' reference.
	 * @see #getConnected()
	 * @generated
	 */
	void setConnected(Connector value);

} // Connector
