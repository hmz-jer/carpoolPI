package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.State;

/**
 * Session Bean implementation class StateService
 */
@Stateless
@LocalBean
public class StateServices implements StateServicesRemote, StateServicesLocal {

    /**
     * Default constructor. 
     */
    public StateServices() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext
    private EntityManager em;
	@Override
	
	public void addState(State state) {
		
		em.persist(state);
	}
	@Override
	public void affiche() {
		System.out.println("JEE 5ra");
		
	}

}
