/*
 * generated by Xtext 2.16.0
 */
package de.htw.activity.xtext.ide

import com.google.inject.Guice
import de.htw.activity.xtext.ActivityDslRuntimeModule
import de.htw.activity.xtext.ActivityDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ActivityDslIdeSetup extends ActivityDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ActivityDslRuntimeModule, new ActivityDslIdeModule))
	}
	
}
