/**
 */
package de.htw.activity.emf.activity.util;

import de.htw.activity.emf.activity.AcceptEventAction;
import de.htw.activity.emf.activity.AcceptTimeEventAction;
import de.htw.activity.emf.activity.Action;
import de.htw.activity.emf.activity.Activity;
import de.htw.activity.emf.activity.ActivityEdge;
import de.htw.activity.emf.activity.ActivityFinalNode;
import de.htw.activity.emf.activity.ActivityGroup;
import de.htw.activity.emf.activity.ActivityNode;
import de.htw.activity.emf.activity.ActivityPackage;
import de.htw.activity.emf.activity.ActivityParameterNode;
import de.htw.activity.emf.activity.ActivityPartition;
import de.htw.activity.emf.activity.CentralBufferNode;
import de.htw.activity.emf.activity.Connector;
import de.htw.activity.emf.activity.ControlFlow;
import de.htw.activity.emf.activity.ControlNode;
import de.htw.activity.emf.activity.DataStoreNode;
import de.htw.activity.emf.activity.DecisionNode;
import de.htw.activity.emf.activity.ExecutableNode;
import de.htw.activity.emf.activity.FinalNode;
import de.htw.activity.emf.activity.FlowFinalNode;
import de.htw.activity.emf.activity.ForkNode;
import de.htw.activity.emf.activity.InitialNode;
import de.htw.activity.emf.activity.InputPin;
import de.htw.activity.emf.activity.InterruptEdge;
import de.htw.activity.emf.activity.InterruptibleActivityRegion;
import de.htw.activity.emf.activity.JoinNode;
import de.htw.activity.emf.activity.MergeNode;
import de.htw.activity.emf.activity.NamedElement;
import de.htw.activity.emf.activity.ObjectFlow;
import de.htw.activity.emf.activity.ObjectNode;
import de.htw.activity.emf.activity.OutputPin;
import de.htw.activity.emf.activity.Pin;
import de.htw.activity.emf.activity.SendSignalAction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.htw.activity.emf.activity.ActivityPackage
 * @generated
 */
public class ActivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActivityPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_PARAMETER_NODE: {
			ActivityParameterNode activityParameterNode = (ActivityParameterNode) theEObject;
			T result = caseActivityParameterNode(activityParameterNode);
			if (result == null)
				result = caseActivity(activityParameterNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_EDGE: {
			ActivityEdge activityEdge = (ActivityEdge) theEObject;
			T result = caseActivityEdge(activityEdge);
			if (result == null)
				result = caseNamedElement(activityEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_NODE: {
			ActivityNode activityNode = (ActivityNode) theEObject;
			T result = caseActivityNode(activityNode);
			if (result == null)
				result = caseNamedElement(activityNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_PARTITION: {
			ActivityPartition activityPartition = (ActivityPartition) theEObject;
			T result = caseActivityPartition(activityPartition);
			if (result == null)
				result = caseActivityGroup(activityPartition);
			if (result == null)
				result = caseActivity(activityPartition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION: {
			InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion) theEObject;
			T result = caseInterruptibleActivityRegion(interruptibleActivityRegion);
			if (result == null)
				result = caseActivityGroup(interruptibleActivityRegion);
			if (result == null)
				result = caseActivity(interruptibleActivityRegion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_GROUP: {
			ActivityGroup activityGroup = (ActivityGroup) theEObject;
			T result = caseActivityGroup(activityGroup);
			if (result == null)
				result = caseActivity(activityGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.CONTROL_NODE: {
			ControlNode controlNode = (ControlNode) theEObject;
			T result = caseControlNode(controlNode);
			if (result == null)
				result = caseActivityNode(controlNode);
			if (result == null)
				result = caseNamedElement(controlNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.INITIAL_NODE: {
			InitialNode initialNode = (InitialNode) theEObject;
			T result = caseInitialNode(initialNode);
			if (result == null)
				result = caseControlNode(initialNode);
			if (result == null)
				result = caseActivityNode(initialNode);
			if (result == null)
				result = caseNamedElement(initialNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.FINAL_NODE: {
			FinalNode finalNode = (FinalNode) theEObject;
			T result = caseFinalNode(finalNode);
			if (result == null)
				result = caseControlNode(finalNode);
			if (result == null)
				result = caseActivityNode(finalNode);
			if (result == null)
				result = caseNamedElement(finalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.FORK_NODE: {
			ForkNode forkNode = (ForkNode) theEObject;
			T result = caseForkNode(forkNode);
			if (result == null)
				result = caseControlNode(forkNode);
			if (result == null)
				result = caseActivityNode(forkNode);
			if (result == null)
				result = caseNamedElement(forkNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.JOIN_NODE: {
			JoinNode joinNode = (JoinNode) theEObject;
			T result = caseJoinNode(joinNode);
			if (result == null)
				result = caseControlNode(joinNode);
			if (result == null)
				result = caseActivityNode(joinNode);
			if (result == null)
				result = caseNamedElement(joinNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseControlNode(connector);
			if (result == null)
				result = caseActivityNode(connector);
			if (result == null)
				result = caseNamedElement(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.MERGE_NODE: {
			MergeNode mergeNode = (MergeNode) theEObject;
			T result = caseMergeNode(mergeNode);
			if (result == null)
				result = caseControlNode(mergeNode);
			if (result == null)
				result = caseActivityNode(mergeNode);
			if (result == null)
				result = caseNamedElement(mergeNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.DECISION_NODE: {
			DecisionNode decisionNode = (DecisionNode) theEObject;
			T result = caseDecisionNode(decisionNode);
			if (result == null)
				result = caseControlNode(decisionNode);
			if (result == null)
				result = caseActivityNode(decisionNode);
			if (result == null)
				result = caseNamedElement(decisionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.FLOW_FINAL_NODE: {
			FlowFinalNode flowFinalNode = (FlowFinalNode) theEObject;
			T result = caseFlowFinalNode(flowFinalNode);
			if (result == null)
				result = caseFinalNode(flowFinalNode);
			if (result == null)
				result = caseControlNode(flowFinalNode);
			if (result == null)
				result = caseActivityNode(flowFinalNode);
			if (result == null)
				result = caseNamedElement(flowFinalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTIVITY_FINAL_NODE: {
			ActivityFinalNode activityFinalNode = (ActivityFinalNode) theEObject;
			T result = caseActivityFinalNode(activityFinalNode);
			if (result == null)
				result = caseFinalNode(activityFinalNode);
			if (result == null)
				result = caseControlNode(activityFinalNode);
			if (result == null)
				result = caseActivityNode(activityFinalNode);
			if (result == null)
				result = caseNamedElement(activityFinalNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.EXECUTABLE_NODE: {
			ExecutableNode executableNode = (ExecutableNode) theEObject;
			T result = caseExecutableNode(executableNode);
			if (result == null)
				result = caseActivityNode(executableNode);
			if (result == null)
				result = caseNamedElement(executableNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseExecutableNode(action);
			if (result == null)
				result = caseActivityNode(action);
			if (result == null)
				result = caseNamedElement(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.SEND_SIGNAL_ACTION: {
			SendSignalAction sendSignalAction = (SendSignalAction) theEObject;
			T result = caseSendSignalAction(sendSignalAction);
			if (result == null)
				result = caseExecutableNode(sendSignalAction);
			if (result == null)
				result = caseActivityNode(sendSignalAction);
			if (result == null)
				result = caseNamedElement(sendSignalAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACCEPT_TIME_EVENT_ACTION: {
			AcceptTimeEventAction acceptTimeEventAction = (AcceptTimeEventAction) theEObject;
			T result = caseAcceptTimeEventAction(acceptTimeEventAction);
			if (result == null)
				result = caseExecutableNode(acceptTimeEventAction);
			if (result == null)
				result = caseActivityNode(acceptTimeEventAction);
			if (result == null)
				result = caseNamedElement(acceptTimeEventAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.ACCEPT_EVENT_ACTION: {
			AcceptEventAction acceptEventAction = (AcceptEventAction) theEObject;
			T result = caseAcceptEventAction(acceptEventAction);
			if (result == null)
				result = caseExecutableNode(acceptEventAction);
			if (result == null)
				result = caseActivityNode(acceptEventAction);
			if (result == null)
				result = caseNamedElement(acceptEventAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.INPUT_PIN: {
			InputPin inputPin = (InputPin) theEObject;
			T result = caseInputPin(inputPin);
			if (result == null)
				result = casePin(inputPin);
			if (result == null)
				result = caseObjectNode(inputPin);
			if (result == null)
				result = caseActivityNode(inputPin);
			if (result == null)
				result = caseNamedElement(inputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.OUTPUT_PIN: {
			OutputPin outputPin = (OutputPin) theEObject;
			T result = caseOutputPin(outputPin);
			if (result == null)
				result = casePin(outputPin);
			if (result == null)
				result = caseObjectNode(outputPin);
			if (result == null)
				result = caseActivityNode(outputPin);
			if (result == null)
				result = caseNamedElement(outputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.OBJECT_NODE: {
			ObjectNode objectNode = (ObjectNode) theEObject;
			T result = caseObjectNode(objectNode);
			if (result == null)
				result = caseActivityNode(objectNode);
			if (result == null)
				result = caseNamedElement(objectNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.PIN: {
			Pin pin = (Pin) theEObject;
			T result = casePin(pin);
			if (result == null)
				result = caseObjectNode(pin);
			if (result == null)
				result = caseActivityNode(pin);
			if (result == null)
				result = caseNamedElement(pin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.OBJECT: {
			de.htw.activity.emf.activity.Object object = (de.htw.activity.emf.activity.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseObjectNode(object);
			if (result == null)
				result = caseActivityNode(object);
			if (result == null)
				result = caseNamedElement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.CENTRAL_BUFFER_NODE: {
			CentralBufferNode centralBufferNode = (CentralBufferNode) theEObject;
			T result = caseCentralBufferNode(centralBufferNode);
			if (result == null)
				result = caseObjectNode(centralBufferNode);
			if (result == null)
				result = caseActivityNode(centralBufferNode);
			if (result == null)
				result = caseNamedElement(centralBufferNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.DATA_STORE_NODE: {
			DataStoreNode dataStoreNode = (DataStoreNode) theEObject;
			T result = caseDataStoreNode(dataStoreNode);
			if (result == null)
				result = caseObjectNode(dataStoreNode);
			if (result == null)
				result = caseActivityNode(dataStoreNode);
			if (result == null)
				result = caseNamedElement(dataStoreNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow(controlFlow);
			if (result == null)
				result = caseActivityEdge(controlFlow);
			if (result == null)
				result = caseNamedElement(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.OBJECT_FLOW: {
			ObjectFlow objectFlow = (ObjectFlow) theEObject;
			T result = caseObjectFlow(objectFlow);
			if (result == null)
				result = caseActivityEdge(objectFlow);
			if (result == null)
				result = caseNamedElement(objectFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityPackage.INTERRUPT_EDGE: {
			InterruptEdge interruptEdge = (InterruptEdge) theEObject;
			T result = caseInterruptEdge(interruptEdge);
			if (result == null)
				result = caseActivityEdge(interruptEdge);
			if (result == null)
				result = caseNamedElement(interruptEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartition(ActivityPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Time Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Time Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptTimeEventAction(AcceptTimeEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(de.htw.activity.emf.activity.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptEdge(InterruptEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivitySwitch
