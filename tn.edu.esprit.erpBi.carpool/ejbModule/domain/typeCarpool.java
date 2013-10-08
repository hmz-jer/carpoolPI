package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: typeCarpool
 * 
 */
@Entity
public class typeCarpool implements Serializable {

	private int idTypeCarpool;
	private String typeCarpool;
	private List<Carpool> carpools;



	private static final long serialVersionUID = 1L;

	public typeCarpool() {
		super();
	}

	@Id
	public int getIdTypeCarpool() {
		return this.idTypeCarpool;
	}

	public void setIdTypeCarpool(int idTypeCarpool) {
		this.idTypeCarpool = idTypeCarpool;
	}

	public String getTypeCarpool() {
		return this.typeCarpool;
	}

	public void setTypeCarpool(String typeCarpool) {
		this.typeCarpool = typeCarpool;
	}
	
	@OneToMany(mappedBy="typeCarpool")
	public List<Carpool> getCarpools() {
		return carpools;
	}

	public void setCarpools(List<Carpool> carpools) {
		this.carpools = carpools;
	}
	public void assigncarpooltTotypeCarpool(List<Carpool> carpools){
		for(Carpool s :carpools){
			
			s.setTypeCarpool(this);
		}
		
	}
}
