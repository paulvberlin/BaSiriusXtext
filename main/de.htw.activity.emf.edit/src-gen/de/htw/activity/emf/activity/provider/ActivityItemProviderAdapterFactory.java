/**
 */
package de.htw.activity.emf.activity.provider;

import de.htw.activity.emf.activity.util.ActivityAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProviderAdapterFactory extends ActivityAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ActivityParameterNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityParameterNodeItemProvider activityParameterNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ActivityParameterNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityParameterNodeAdapter() {
		if (activityParameterNodeItemProvider == null) {
			activityParameterNodeItemProvider = new ActivityParameterNodeItemProvider(this);
		}

		return activityParameterNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ActivityPartition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionItemProvider activityPartitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityPartitionAdapter() {
		if (activityPartitionItemProvider == null) {
			activityPartitionItemProvider = new ActivityPartitionItemProvider(this);
		}

		return activityPartitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.InterruptibleActivityRegion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionItemProvider interruptibleActivityRegionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.InterruptibleActivityRegion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterruptibleActivityRegionAdapter() {
		if (interruptibleActivityRegionItemProvider == null) {
			interruptibleActivityRegionItemProvider = new InterruptibleActivityRegionItemProvider(this);
		}

		return interruptibleActivityRegionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.InitialNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialNodeItemProvider initialNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.InitialNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInitialNodeAdapter() {
		if (initialNodeItemProvider == null) {
			initialNodeItemProvider = new InitialNodeItemProvider(this);
		}

		return initialNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ForkNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeItemProvider forkNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ForkNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkNodeAdapter() {
		if (forkNodeItemProvider == null) {
			forkNodeItemProvider = new ForkNodeItemProvider(this);
		}

		return forkNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.JoinNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinNodeItemProvider joinNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.JoinNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinNodeAdapter() {
		if (joinNodeItemProvider == null) {
			joinNodeItemProvider = new JoinNodeItemProvider(this);
		}

		return joinNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.Connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new ConnectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.MergeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeItemProvider mergeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.MergeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMergeNodeAdapter() {
		if (mergeNodeItemProvider == null) {
			mergeNodeItemProvider = new MergeNodeItemProvider(this);
		}

		return mergeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.DecisionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeItemProvider decisionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.DecisionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionNodeAdapter() {
		if (decisionNodeItemProvider == null) {
			decisionNodeItemProvider = new DecisionNodeItemProvider(this);
		}

		return decisionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.FlowFinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowFinalNodeItemProvider flowFinalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.FlowFinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowFinalNodeAdapter() {
		if (flowFinalNodeItemProvider == null) {
			flowFinalNodeItemProvider = new FlowFinalNodeItemProvider(this);
		}

		return flowFinalNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ActivityFinalNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityFinalNodeItemProvider activityFinalNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ActivityFinalNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityFinalNodeAdapter() {
		if (activityFinalNodeItemProvider == null) {
			activityFinalNodeItemProvider = new ActivityFinalNodeItemProvider(this);
		}

		return activityFinalNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.SendSignalAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendSignalActionItemProvider sendSignalActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.SendSignalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSendSignalActionAdapter() {
		if (sendSignalActionItemProvider == null) {
			sendSignalActionItemProvider = new SendSignalActionItemProvider(this);
		}

		return sendSignalActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.AcceptTimeEventAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptTimeEventActionItemProvider acceptTimeEventActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.AcceptTimeEventAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAcceptTimeEventActionAdapter() {
		if (acceptTimeEventActionItemProvider == null) {
			acceptTimeEventActionItemProvider = new AcceptTimeEventActionItemProvider(this);
		}

		return acceptTimeEventActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.AcceptEventAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionItemProvider acceptEventActionItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.AcceptEventAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAcceptEventActionAdapter() {
		if (acceptEventActionItemProvider == null) {
			acceptEventActionItemProvider = new AcceptEventActionItemProvider(this);
		}

		return acceptEventActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.InputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinItemProvider inputPinItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPinAdapter() {
		if (inputPinItemProvider == null) {
			inputPinItemProvider = new InputPinItemProvider(this);
		}

		return inputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.OutputPin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPinItemProvider outputPinItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputPinAdapter() {
		if (outputPinItemProvider == null) {
			outputPinItemProvider = new OutputPinItemProvider(this);
		}

		return outputPinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.Object} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectItemProvider objectItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectAdapter() {
		if (objectItemProvider == null) {
			objectItemProvider = new ObjectItemProvider(this);
		}

		return objectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.CentralBufferNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CentralBufferNodeItemProvider centralBufferNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.CentralBufferNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCentralBufferNodeAdapter() {
		if (centralBufferNodeItemProvider == null) {
			centralBufferNodeItemProvider = new CentralBufferNodeItemProvider(this);
		}

		return centralBufferNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.DataStoreNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreNodeItemProvider dataStoreNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.DataStoreNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataStoreNodeAdapter() {
		if (dataStoreNodeItemProvider == null) {
			dataStoreNodeItemProvider = new DataStoreNodeItemProvider(this);
		}

		return dataStoreNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ControlFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowItemProvider controlFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlFlowAdapter() {
		if (controlFlowItemProvider == null) {
			controlFlowItemProvider = new ControlFlowItemProvider(this);
		}

		return controlFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.ObjectFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFlowItemProvider objectFlowItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.ObjectFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectFlowAdapter() {
		if (objectFlowItemProvider == null) {
			objectFlowItemProvider = new ObjectFlowItemProvider(this);
		}

		return objectFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.htw.activity.emf.activity.InterruptEdge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptEdgeItemProvider interruptEdgeItemProvider;

	/**
	 * This creates an adapter for a {@link de.htw.activity.emf.activity.InterruptEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterruptEdgeAdapter() {
		if (interruptEdgeItemProvider == null) {
			interruptEdgeItemProvider = new InterruptEdgeItemProvider(this);
		}

		return interruptEdgeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (activityItemProvider != null)
			activityItemProvider.dispose();
		if (activityParameterNodeItemProvider != null)
			activityParameterNodeItemProvider.dispose();
		if (activityPartitionItemProvider != null)
			activityPartitionItemProvider.dispose();
		if (interruptibleActivityRegionItemProvider != null)
			interruptibleActivityRegionItemProvider.dispose();
		if (initialNodeItemProvider != null)
			initialNodeItemProvider.dispose();
		if (forkNodeItemProvider != null)
			forkNodeItemProvider.dispose();
		if (joinNodeItemProvider != null)
			joinNodeItemProvider.dispose();
		if (connectorItemProvider != null)
			connectorItemProvider.dispose();
		if (mergeNodeItemProvider != null)
			mergeNodeItemProvider.dispose();
		if (decisionNodeItemProvider != null)
			decisionNodeItemProvider.dispose();
		if (flowFinalNodeItemProvider != null)
			flowFinalNodeItemProvider.dispose();
		if (activityFinalNodeItemProvider != null)
			activityFinalNodeItemProvider.dispose();
		if (actionItemProvider != null)
			actionItemProvider.dispose();
		if (sendSignalActionItemProvider != null)
			sendSignalActionItemProvider.dispose();
		if (acceptTimeEventActionItemProvider != null)
			acceptTimeEventActionItemProvider.dispose();
		if (acceptEventActionItemProvider != null)
			acceptEventActionItemProvider.dispose();
		if (inputPinItemProvider != null)
			inputPinItemProvider.dispose();
		if (outputPinItemProvider != null)
			outputPinItemProvider.dispose();
		if (objectItemProvider != null)
			objectItemProvider.dispose();
		if (centralBufferNodeItemProvider != null)
			centralBufferNodeItemProvider.dispose();
		if (dataStoreNodeItemProvider != null)
			dataStoreNodeItemProvider.dispose();
		if (controlFlowItemProvider != null)
			controlFlowItemProvider.dispose();
		if (objectFlowItemProvider != null)
			objectFlowItemProvider.dispose();
		if (interruptEdgeItemProvider != null)
			interruptEdgeItemProvider.dispose();
	}

}
