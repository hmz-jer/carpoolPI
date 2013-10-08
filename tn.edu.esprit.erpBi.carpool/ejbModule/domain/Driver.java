package domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Driver
 *
 */
@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public class Driver extends Student implements Serializable {

	
	private String TypeCar;
	private String CarModel;
	private String About;
	private List<Carpool> carpools;
	private static final long serialVersionUID = 1L;

	public Driver() {
		super();
	}   
	
	public String getTypeCar() {
		return this.TypeCar;
	}

	public void setTypeCar(String TypeCar) {
		this.TypeCar = TypeCar;
	}   
	public String getCarModel() {
		return this.CarModel;
	}

	public void setCarModel(String CarModel) {
		this.CarModel = CarModel;
	}   
	public String getAbout() {
		return this.About;
	}

	public void setAbout(String About) {
		this.About = About;
	}
@OneToMany(mappedBy="driver")
	public List<Carpool> getCarpools() {
		return carpools;
	}

	public void setCarpools(List<Carpool> carpools) {
		this.carpools = carpools;
	}
	public void assignDrivreToCarpool(List<Carpool> carpools){
		for(Carpool c :carpools){
			
					c.setDriver(this);
		}	
		}
}
