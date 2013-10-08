package services;

import java.util.List;

import javax.ejb.Remote;

import domain.Student;



@Remote
public interface StudentServicesRemote {
public void addStudent(Student student);
public void updateStudent(Student student);
public void deleteStudent(Student student);

public Student findStudentById(int studentID);
	
public List<Student> findAllStudents();
public Student findStudentByLoginAndPass(String login, String password);

}
