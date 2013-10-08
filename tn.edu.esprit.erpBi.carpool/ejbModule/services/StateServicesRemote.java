package services;

import javax.ejb.Remote;

import domain.State;

@Remote
public interface StateServicesRemote {

	public void addState(State state);
	public void affiche();

}
