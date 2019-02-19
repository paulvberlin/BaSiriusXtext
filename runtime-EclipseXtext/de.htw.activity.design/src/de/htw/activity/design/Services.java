package de.htw.activity.design;

import java.util.List;

import de.htw.activity.emf.activity.AcceptEventAction;
import de.htw.activity.emf.activity.AcceptTimeEventAction;
import de.htw.activity.emf.activity.Action;
import de.htw.activity.emf.activity.Activity;
import de.htw.activity.emf.activity.ActivityEdge;
import de.htw.activity.emf.activity.ActivityFinalNode;
import de.htw.activity.emf.activity.ActivityGroup;
import de.htw.activity.emf.activity.ActivityNode;
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
import de.htw.activity.emf.activity.Object;
import de.htw.activity.emf.activity.OutputPin;
import de.htw.activity.emf.activity.Pin;
import de.htw.activity.emf.activity.SendSignalAction;

/**
 * The services class used by VSM.
 */
public class Services {
    
//---------------------------------------------------------------------------------------------------------------------------
//ActivityNode
//---------------------------------------------------------------------------------------------------------------------------    

	public String ActivityNode_getLabel(ActivityNode node){
		if(node.getName() == null) {
			return "";
		}
		else {
			return node.getName();
		}
	}
	
	public String ActivityNode_generateDefaultQualifiedName(ActivityNode node) {
		int digit = 0;
		
		//check in whitch container is the node
		if(node.eContainer() instanceof ActivityGroup) {
			Activity parentActivity = (Activity)node.eContainer().eContainer();
			
			digit = getNodeDigit(parentActivity);
		}
		else if(node instanceof Pin) {
			if(node.eContainer().eContainer() instanceof Activity) {
				Activity parentActivity = (Activity)node.eContainer().eContainer();
				
				digit = getNodeDigit(parentActivity);
			}
			else {
				Activity parentActivity = (Activity)node.eContainer().eContainer().eContainer();
				
				digit = getNodeDigit(parentActivity);
			}
		}
		else {//Activity
			Activity parentActivity = (Activity)node.eContainer();
			
			digit = getNodeDigit(parentActivity);
		}
		
		return "node" + (digit+1); 
	}
	
	public int getNodeDigit(Activity activity) {
		int activityHighestDigit = 0;
		int groupHighestDigit = 0;
		
		if(activity.getNodes() != null) {
			activityHighestDigit = checkNodes(activity.getNodes());
		}
		
		if(activity.getActivityGroups() != null) {
			groupHighestDigit = checkGroups(activity.getActivityGroups());
		}
		
		
		
		if(groupHighestDigit > activityHighestDigit) {
			return groupHighestDigit;
		}
		else {
			return activityHighestDigit;
		}
	}
	
	public int splitQualifiedName(String str) {
		String[] s = str.split("node");
		
		return Integer.parseInt(s[1]);
	}
	
	public int checkGroups(List<ActivityGroup> list) {
		int highestDigit = 0;
		
		for(int i=0; i <= list.size()-1; i++) {
			ActivityGroup group = list.get(i);
			int digit = checkNodes(group.getNodes());
			
			if(digit > highestDigit) {
				highestDigit = digit;
			}
		}
		
		return highestDigit;
	}
	
	public int checkNodes(List<ActivityNode> list) {
		int highestDigit = 0;
		
		for(int i=0; i <= list.size()-1; i++) {
			ActivityNode node = list.get(i);
			
			if(node.getQualifiedName() != null) {
				int digit = splitQualifiedName(node.getQualifiedName());
			
				if(node instanceof Action) {
					Action action = (Action)node;
					int pDigit = checkPins(action);
				
					if(pDigit > digit) {
						digit = pDigit;
					}
				}
				
				if(digit > highestDigit) {
					highestDigit = digit;
				}
			}
		}
		
		return highestDigit;
	}
	
	public int checkPins(Action action) {
		int digit = 0;
		
		if(action.getInput() != null) {
			for(InputPin pin : action.getInput()) {
				if(pin.getQualifiedName() != null) {
					int pDigit = splitQualifiedName(pin.getQualifiedName());
				
					if(pDigit > digit) {
						digit = pDigit;
					}
				}
				
			}
		}
		
		if(action.getOutput() != null) {
			for(OutputPin pin : action.getOutput()) {
				if(pin.getQualifiedName() != null) {
					int pDigit = splitQualifiedName(pin.getQualifiedName());
				
				
					if(pDigit > digit) {
						digit = pDigit;
					}
				}
			}
		}
		
		return digit;
	}
	

	
//---------------------------------------------------------------------------------------------------------------------------
//ActivityEdge
//---------------------------------------------------------------------------------------------------------------------------    

	public String ActivityEdge_getLabel(ActivityEdge edge){
		if(edge.getName() == null) {
			return "";
		}
		else {
			return edge.getName();
		}
	}
	
	public String ActivityEdge_generateDefaultQualifiedName(ActivityEdge edge) {
		int digit = 0;
		
		//check in which container is the node
		if(edge.eContainer() instanceof ActivityGroup) {
			int[] i = {1,1,2};
			Activity parentActivity = (Activity)edge.eContainer().eContainer();
			
			digit = getEdgeDigit(parentActivity, edge, i);
		}
		else {//Activity
			int[] i = {2,1,1};
			Activity parentActivity = (Activity)edge.eContainer();
			
			digit = getEdgeDigit(parentActivity, edge, i);
		}
		
		return "edge" + (digit+1); 
	}
	
	public int getEdgeDigit(Activity activity, ActivityEdge edge, int[] i) {
		int index = 0;
		int digit = 0;
		
		if(activity.getEdges().size() >= i[0]) {
			index = activity.getEdges().size() -i[0];
			String[] s = activity.getEdges().get(index).getQualifiedName().split("edge");
			digit = Integer.parseInt(s[1]);
		}

		
		for(ActivityGroup group : activity.getActivityGroups()) {
			if(group.getEdges() != null ) {
				if(group.getEdges().size() >= i[2] && edge.eContainer().equals(group)) {
					index = group.getEdges().size() - i[2];
					String[] s = group.getEdges().get(index).getQualifiedName().split("edge");
					if(digit < Integer.parseInt(s[1])) {
						digit = Integer.parseInt(s[1]);
					}
				}
				else if(group.getEdges().size() >= i[2]){
					index = group.getEdges().size() - i[2];
					String[] s = group.getEdges().get(index).getQualifiedName().split("edge");
					if(digit < Integer.parseInt(s[1])) {
						digit = Integer.parseInt(s[1]);
					}
				}
			}
		}
		return digit;
	}
	
//---------------------------------------------------------------------------------------------------------------------------
//ControlFlow
//---------------------------------------------------------------------------------------------------------------------------
	
	public String ControlFlow_generateDefaultName(ControlFlow flow) {		
		return "ControlFlow";
	}
	    
//---------------------------------------------------------------------------------------------------------------------------
//ObejctFlow
//---------------------------------------------------------------------------------------------------------------------------
	    
	public String ObjectFlow_generateDefaultName(ObjectFlow flow) {
		
		return "ObjectFlow";
	}
		 
//---------------------------------------------------------------------------------------------------------------------------
//ControlFlow
//---------------------------------------------------------------------------------------------------------------------------
	public String InterruptEdge_generateDefaultName(InterruptEdge flow) {
			
		return "InterruptEdge";
	}
		
//---------------------------------------------------------------------------------------------------------------------------
//InitialNode
//---------------------------------------------------------------------------------------------------------------------------
	    
	public String InitialNode_generateDefaultName(InitialNode i) {
		return "Initial";
	}
	    
//---------------------------------------------------------------------------------------------------------------------------
//MergeNode
//---------------------------------------------------------------------------------------------------------------------------
	      
	public String MergeNode_generateDefaultName(MergeNode m) {
		return "Merge";
	}
	      
//---------------------------------------------------------------------------------------------------------------------------
//DecisionNode
//---------------------------------------------------------------------------------------------------------------------------
	             
	public String DecisionNode_generateDefaultName(DecisionNode d) {
		return "Decision";
	}

//---------------------------------------------------------------------------------------------------------------------------
//FlowFinalNode
//---------------------------------------------------------------------------------------------------------------------------
 
	public String FlowFinalNode_generateDefaultName(FlowFinalNode f) { 		
		return "FlowFinal";
	}
	  
//---------------------------------------------------------------------------------------------------------------------------
//ActivityFinalNode
//---------------------------------------------------------------------------------------------------------------------------
	                  
	public String ActivityFinalNode_generateDefaultName(ActivityFinalNode a) {
		return "ActivityFinal";
	}
		
//---------------------------------------------------------------------------------------------------------------------------
//JoinNode
//---------------------------------------------------------------------------------------------------------------------------
		                  
	public String JoinNode_generateDefaultNodeName(JoinNode j) {  		
		return "Join";
	}

//---------------------------------------------------------------------------------------------------------------------------
//ForkNode
//---------------------------------------------------------------------------------------------------------------------------
	
	public String ForkNode_generateDefaultName(ForkNode f) {
		return "Fork";
	}
	
//---------------------------------------------------------------------------------------------------------------------------
//Connector
//---------------------------------------------------------------------------------------------------------------------------

	public String Connector_generateDefaultName(Connector c) {   
		return "c";
	}
//---------------------------------------------------------------------------------------------------------------------------
//Object
//---------------------------------------------------------------------------------------------------------------------------
			                  
	public String Object_generateDefaultName(Object o) { 
		return "Object";
	}
		
//---------------------------------------------------------------------------------------------------------------------------
//CentralBufferNode
//---------------------------------------------------------------------------------------------------------------------------
	
	public String CentralBufferNode_getName(CentralBufferNode c) {
		return "<<centralBuffer>>\n" + c.getName();
	}
	
	public String CentralBufferNode_generateDefaultName(CentralBufferNode c) {  		
		return "Buffer";
	}
		
//---------------------------------------------------------------------------------------------------------------------------
//DataStoreNode
//---------------------------------------------------------------------------------------------------------------------------
                 
	public String DataStoreNode_generateDefaultName(DataStoreNode d) {  		
		return "DataStore";
	} 
		
//---------------------------------------------------------------------------------------------------------------------------
//OutputPin
//---------------------------------------------------------------------------------------------------------------------------

	public String OutputPin_generateDefaultName(OutputPin p) {		
		return "Output";
	}

//---------------------------------------------------------------------------------------------------------------------------
//InputPin
//---------------------------------------------------------------------------------------------------------------------------

			
	public String InputPin_generateDefaultName(InputPin p) {
		return "Input";
	}
		
//---------------------------------------------------------------------------------------------------------------------------
//SendSignalAction
//---------------------------------------------------------------------------------------------------------------------------
				
	public String SendSignalAction_generateDefaultName(SendSignalAction s) {
		return "SendSignal";
	}
	
//---------------------------------------------------------------------------------------------------------------------------
//AcceptTimeEventAction
//---------------------------------------------------------------------------------------------------------------------------
					
	public String AcceptTimeEventAction_generateDefaultName(AcceptTimeEventAction a) {
		return "TimeEvent";
	}
	
//---------------------------------------------------------------------------------------------------------------------------
//AcceptTimeEventAction
//---------------------------------------------------------------------------------------------------------------------------
	
	public String Action_generateDefaultName(Action a) {
		return "Action";
	}
			
//---------------------------------------------------------------------------------------------------------------------------
//AcceptEventAction
//---------------------------------------------------------------------------------------------------------------------------
						
	public String AcceptEventAction_generateDefaultName(AcceptEventAction a) {		
		return "AcceptEvent";
	}
	
	
//---------------------------------------------------------------------------------------------------------------------------
//InterruptibleActivityRegion
//---------------------------------------------------------------------------------------------------------------------------	
	public String InterruptibleActivityRegion_getLabel(InterruptibleActivityRegion region){
		if(region.getName() == null) {
			return "";
		}
		else {
			return region.getName();
		}
	}
	
	public String InterruptibleActivityRegion_generateDefaultName(InterruptibleActivityRegion region) {
		Activity parentActivity = (Activity)region.eContainer();
		InterruptibleActivityRegion lastRegion = null;
					    
		// -2, die neue entstandene Instanz zählt schon mit, als existierende Instanz
		for(int i=0; i<=parentActivity.getActivityGroups().size()-2; i++) {
			if(parentActivity.getActivityGroups().get(i) instanceof InterruptibleActivityRegion) {
				lastRegion = (InterruptibleActivityRegion) parentActivity.getActivityGroups().get(i);
			}
		}
					    	
		if(lastRegion == null) {
			return "Region1";
		}
		else {
			String[] sNumber = lastRegion.getName().split("Region");
			int number = Integer.parseInt(sNumber[1]) +1;
			return "Region" + number;
		}
	}	
}
