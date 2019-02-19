/**
 */
package de.htw.activity.emf.activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htw.activity.emf.activity.ActivityParameterNode#getName <em>Name</em>}</li>
 *   <li>{@link de.htw.activity.emf.activity.ActivityParameterNode#getInBorder <em>In Border</em>}</li>
 * </ul>
 *
 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityParameterNode()
 * @model
 * @generated
 */
public interface ActivityParameterNode extends Activity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityParameterNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.htw.activity.emf.activity.ActivityParameterNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Border</b></em>' containment reference list.
	 * The list contents are of type {@link de.htw.activity.emf.activity.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Border</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Border</em>' containment reference list.
	 * @see de.htw.activity.emf.activity.ActivityPackage#getActivityParameterNode_InBorder()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getInBorder();

} // ActivityParameterNode
