package domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Carpool
 *
 */
@Entity

public class Carpool implements Serializable {

	
	private int idCarpool;
	private Date dateCarpool;
	private int numberMaxPassenger;
	private float startPoint;
	private float endPoint;
	private String placeOfMeeting;
	private float cost;
	private Driver driver;
	private typeCarpool typeCarpool;
	private University university;
	

	private static final long serialVersionUID = 1L;

	public Carpool() {
		super();
	}   
	@Id    
	public int getIdCarpool() {
		return this.idCarpool;
	}

	public void setIdCarpool(int idCarpool) {
		this.idCarpool = idCarpool;
	}   
	public Date getDateCarpool() {
		return this.dateCarpool;
	}

	public void setDateCarpool(Date dateCarpool) {
		this.dateCarpool = dateCarpool;
	}   
	public int getNumberMaxPassenger() {
		return this.numberMaxPassenger;
	}

	public void setNumberMaxPassenger(int numberMaxPassenger) {
		this.numberMaxPassenger = numberMaxPassenger;
	}   
	public float getStartPoint() {
		return this.startPoint;
	}

	public void setStartPoint(float startPoint) {
		this.startPoint = startPoint;
	}   
	public float getEndPoint() {
		return this.endPoint;
	}

	public void setEndPoint(float endPoint) {
		this.endPoint = endPoint;
	}   
	public String getPlaceOfMeeting() {
		return this.placeOfMeeting;
	}

	public void setPlaceOfMeeting(String placeOfMeeting) {
		this.placeOfMeeting = placeOfMeeting;
	}   
	public float getCost() {
		return this.cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	@ManyToOne
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@ManyToOne
	public typeCarpool getTypeCarpool() {
		return typeCarpool;
	}
	public void setTypeCarpool(typeCarpool typeCarpool) {
		this.typeCarpool = typeCarpool;
	}
	@ManyToOne
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
}
