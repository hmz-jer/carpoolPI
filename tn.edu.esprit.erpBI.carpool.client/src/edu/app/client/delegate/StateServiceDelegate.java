package edu.app.client.delegate;

import services.StateServicesRemote;
import domain.State;
import edu.app.client.locator.ServiceLocator;

public class StateServiceDelegate {
	private static final String jndiName = "ejb:/tn.edu.esprit.erpBi.carpool/StateServices!services.StateServicesRemote";

	private static StateServicesRemote getProxy() {
		return (StateServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}
	public static void doAddState(State state) {
		getProxy().addState(state);

	}
	public static void doAfficher() {
		getProxy().affiche();

	}


}
