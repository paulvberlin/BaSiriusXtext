/*
 * generated by Xtext 2.16.0
 */
package de.htw.activity.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ActivityDslStandaloneSetup extends ActivityDslStandaloneSetupGenerated {

	def static void doSetup() {
		new ActivityDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
