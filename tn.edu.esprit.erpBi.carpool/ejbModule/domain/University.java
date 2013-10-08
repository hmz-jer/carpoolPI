package domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: University
 *
 */
@Entity

public class University implements Serializable {

	
	private int ID_University;

	private String Name;
	private String Address;
	private static final long serialVersionUID = 1L;

	private  List<Student> students;
private List<Carpool> carpools;
	
	public University() {
		super();
	}   
	@Id    
	public int getID_University() {
		return this.ID_University;
	}

	/*public void setID_University(int ID_University) {
		this.ID_University = ID_University;
	} */  
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
	public void setID_University(int iD_University) {
		ID_University = iD_University;
	}
@OneToMany(mappedBy="university")
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void assignStudentToUniversity(List<Student> students){
		for(Student s :students){
		s.setUniversity(this);
		}
		
	}
	@OneToMany(mappedBy="university")
	public List<Carpool> getCarpools() {
		return carpools;
	}
	public void setCarpools(List<Carpool> carpools) {
		this.carpools = carpools;
	}
	
	public void assignCarpoolToUniversity(List<Carpool> carpools){
		for(Carpool s :carpools){
		s.setUniversity(this);
		}

	}
	}
