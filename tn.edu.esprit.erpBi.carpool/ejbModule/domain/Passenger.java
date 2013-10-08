package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Passenger
 *
 */
@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)

public class Passenger extends Student implements Serializable {

	
	private String About;
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}   
	public String getAbout() {
		return this.About;
	}

	public void setAbout(String About) {
		this.About = About;
	}
   
}
