package Test;

import domain.Student;
import edu.app.client.delegate.StudentServiceDelegate;

public class testAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		
		
		student.setAge(19);
		student.setEmail("ss");
		student.setPassword("pp");
		
		StudentServiceDelegate.doAddStudent(student);
		

	}

}
