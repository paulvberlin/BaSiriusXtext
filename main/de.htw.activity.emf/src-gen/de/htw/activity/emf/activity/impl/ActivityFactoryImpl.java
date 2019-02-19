/**
 */
package de.htw.activity.emf.activity.impl;

import de.htw.activity.emf.activity.AcceptEventAction;
import de.htw.activity.emf.activity.AcceptTimeEventAction;
import de.htw.activity.emf.activity.Action;
import de.htw.activity.emf.activity.Activity;
import de.htw.activity.emf.activity.ActivityFactory;
import de.htw.activity.emf.activity.ActivityFinalNode;
import de.htw.activity.emf.activity.ActivityPackage;
import de.htw.activity.emf.activity.ActivityParameterNode;
import de.htw.activity.emf.activity.ActivityPartition;
import de.htw.activity.emf.activity.CentralBufferNode;
import de.htw.activity.emf.activity.Connector;
import de.htw.activity.emf.activity.ControlFlow;
import de.htw.activity.emf.activity.DataStoreNode;
import de.htw.activity.emf.activity.DecisionNode;
import de.htw.activity.emf.activity.FlowFinalNode;
import de.htw.activity.emf.activity.ForkNode;
import de.htw.activity.emf.activity.InitialNode;
import de.htw.activity.emf.activity.InputPin;
import de.htw.activity.emf.activity.InterruptEdge;
import de.htw.activity.emf.activity.InterruptibleActivityRegion;
import de.htw.activity.emf.activity.JoinNode;
import de.htw.activity.emf.activity.MergeNode;
import de.htw.activity.emf.activity.ObjectFlow;
import de.htw.activity.emf.activity.OutputPin;
import de.htw.activity.emf.activity.SendSignalAction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityFactoryImpl extends EFactoryImpl implements ActivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityFactory init() {
		try {
			ActivityFactory theActivityFactory = (ActivityFactory) EPackage.Registry.INSTANCE
					.getEFactory(ActivityPackage.eNS_URI);
			if (theActivityFactory != null) {
				return theActivityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ActivityPackage.ACTIVITY:
			return createActivity();
		case ActivityPackage.ACTIVITY_PARAMETER_NODE:
			return createActivityParameterNode();
		case ActivityPackage.ACTIVITY_PARTITION:
			return createActivityPartition();
		case ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION:
			return createInterruptibleActivityRegion();
		case ActivityPackage.INITIAL_NODE:
			return createInitialNode();
		case ActivityPackage.FORK_NODE:
			return createForkNode();
		case ActivityPackage.JOIN_NODE:
			return createJoinNode();
		case ActivityPackage.CONNECTOR:
			return createConnector();
		case ActivityPackage.MERGE_NODE:
			return createMergeNode();
		case ActivityPackage.DECISION_NODE:
			return createDecisionNode();
		case ActivityPackage.FLOW_FINAL_NODE:
			return createFlowFinalNode();
		case ActivityPackage.ACTIVITY_FINAL_NODE:
			return createActivityFinalNode();
		case ActivityPackage.ACTION:
			return createAction();
		case ActivityPackage.SEND_SIGNAL_ACTION:
			return createSendSignalAction();
		case ActivityPackage.ACCEPT_TIME_EVENT_ACTION:
			return createAcceptTimeEventAction();
		case ActivityPackage.ACCEPT_EVENT_ACTION:
			return createAcceptEventAction();
		case ActivityPackage.INPUT_PIN:
			return createInputPin();
		case ActivityPackage.OUTPUT_PIN:
			return createOutputPin();
		case ActivityPackage.OBJECT:
			return createObject();
		case ActivityPackage.CENTRAL_BUFFER_NODE:
			return createCentralBufferNode();
		case ActivityPackage.DATA_STORE_NODE:
			return createDataStoreNode();
		case ActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case ActivityPackage.OBJECT_FLOW:
			return createObjectFlow();
		case ActivityPackage.INTERRUPT_EDGE:
			return createInterruptEdge();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion createInterruptibleActivityRegion() {
		InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
		return interruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFinalNode createFlowFinalNode() {
		FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
		return flowFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendSignalAction createSendSignalAction() {
		SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
		return sendSignalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptTimeEventAction createAcceptTimeEventAction() {
		AcceptTimeEventActionImpl acceptTimeEventAction = new AcceptTimeEventActionImpl();
		return acceptTimeEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptEventAction createAcceptEventAction() {
		AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
		return acceptEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.htw.activity.emf.activity.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentralBufferNode createCentralBufferNode() {
		CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
		return centralBufferNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode createDataStoreNode() {
		DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
		return dataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptEdge createInterruptEdge() {
		InterruptEdgeImpl interruptEdge = new InterruptEdgeImpl();
		return interruptEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPackage getActivityPackage() {
		return (ActivityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityPackage getPackage() {
		return ActivityPackage.eINSTANCE;
	}

} //ActivityFactoryImpl
