package de.htw.activity.design;

import org.obeonetwork.dsl.viewpoint.xtext.support.action.OpenXtextEmbeddedEditor;
import com.google.inject.Injector;
import de.htw.activity.xtext.ui.internal.XtextActivator;

public class OpenEmbeddedEditor extends OpenXtextEmbeddedEditor{
	@Override
	protected Injector getInjector() {
		return  XtextActivator.getInstance().getInjector("de.htw.activity.xtext.ActivityDsl");
	}
}
