package domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: State
 *
 */
@Entity

public class State implements Serializable {

	
	private int ID_State;
	private String StateName;
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private  List<Student> students;

	public State() {
		super();
	}   
	@Id   
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public int getID_State() {
		return this.ID_State;
	}

	public void setID_State(int ID_State) {
		this.ID_State = ID_State;
	}   
	public String getStateName() {
		return this.StateName;
	}

	public void setStateName(String StateName) {
		this.StateName = StateName;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
		
	}

