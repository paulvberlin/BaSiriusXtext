package de.htw.activity.xtext.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.htw.activity.emf.activity.AcceptEventAction;
import de.htw.activity.emf.activity.AcceptTimeEventAction;
import de.htw.activity.emf.activity.Action;
import de.htw.activity.emf.activity.ActivityFinalNode;
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
import de.htw.activity.emf.activity.Object;

public class ActivityQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
	QualifiedName qualifiedName(Connector c) {
        return QualifiedName.create(c.getQualifiedName());
    }
	
	QualifiedName qualifiedName(InitialNode i) {
        return QualifiedName.create(i.getQualifiedName());
    }
	
	QualifiedName qualifiedName(FlowFinalNode f) {
        return QualifiedName.create(f.getQualifiedName());
    }
	
	QualifiedName qualifiedName(ActivityFinalNode a) {
        return QualifiedName.create(a.getQualifiedName());
    }
	
	QualifiedName qualifiedName(ForkNode f) {
        return QualifiedName.create(f.getQualifiedName());
    }
	
	QualifiedName qualifiedName(JoinNode e) {
        return QualifiedName.create(e.getQualifiedName());
    }
	
	QualifiedName qualifiedName(MergeNode m) {
        return QualifiedName.create(m.getQualifiedName());
    }
	
	QualifiedName qualifiedName(DecisionNode d) {
        return QualifiedName.create(d.getQualifiedName());
    }
	
	QualifiedName qualifiedName(Action a) {
        return QualifiedName.create(a.getQualifiedName());
    }
	
	QualifiedName qualifiedName(SendSignalAction s) {
        return QualifiedName.create(s.getQualifiedName());
    }
	
	QualifiedName qualifiedName(AcceptTimeEventAction a) {
        return QualifiedName.create(a.getQualifiedName());
    }
	
	QualifiedName qualifiedName(AcceptEventAction a) {
        return QualifiedName.create(a.getQualifiedName());
    }
	
	QualifiedName qualifiedName(Object o) {
        return QualifiedName.create(o.getQualifiedName());
    }
	
	QualifiedName qualifiedName(CentralBufferNode c) {
        return QualifiedName.create(c.getQualifiedName());
    }
	
	QualifiedName qualifiedName(DataStoreNode d) {
        return QualifiedName.create(d.getQualifiedName());
    }
	
	QualifiedName qualifiedName(ControlFlow c) {
        return QualifiedName.create(c.getQualifiedName());
    }
	
	QualifiedName qualifiedName(ObjectFlow o) {
        return QualifiedName.create(o.getQualifiedName());
    }
	
	QualifiedName qualifiedName(InterruptEdge i) {
        return QualifiedName.create(i.getQualifiedName());
    }
	
	QualifiedName qualifiedName(InputPin i) {
        return QualifiedName.create(i.getQualifiedName());
    }
	
	QualifiedName qualifiedName(OutputPin o) {
        return QualifiedName.create(o.getQualifiedName());
    }
	
	QualifiedName qualifiedName(InterruptibleActivityRegion region) {
		
        return QualifiedName.create(region.getName());
    }
}
