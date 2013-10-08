package edu.app.client.delegate;

import java.util.List;

import services.StudentServicesRemote;
import domain.Student;
import edu.app.client.locator.ServiceLocator;

public class StudentServiceDelegate {

	private static final String jndiName = "ejb:/tn.edu.esprit.erpBi.carpool/StudentServices!services.StudentServicesRemote";

	private static StudentServicesRemote getProxy() {
		return (StudentServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static void doAddStudent(Student student) {
		getProxy().addStudent(student);

	}

	public static void doDeleteStudent(Student student) {
		getProxy().deleteStudent(student);
	}

	public static List<Student> doFindAllStudents() {
		return getProxy().findAllStudents();
	}

	public static Student doFindStudentById(int studentID) {
		return getProxy().findStudentById(studentID);
	}

	public static void doUpdateStudent(Student student) {
		getProxy().updateStudent(student);
	}

	public static Student doFindStudentByLoginAndPassword(String login,
			String password) {
		return getProxy().findStudentByLoginAndPass(login, password);
	}

}
