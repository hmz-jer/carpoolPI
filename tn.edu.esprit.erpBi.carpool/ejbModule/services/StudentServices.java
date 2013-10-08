package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import domain.Student;

/**
 * Session Bean implementation class StudentServices
 */
@Stateless
@LocalBean
public class StudentServices implements StudentServicesRemote, StudentServicesLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager em;
    public StudentServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		em.merge(student);
		
	}

	

	@Override
	public Student findStudentById(int studentID) {
		// TODO Auto-generated method stub
		return em.find(Student.class, studentID);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return em.createQuery("select s from student s", Student.class).getResultList();
	}

	@Override
	public void deleteStudent(Student student) {
		em.remove(student);
		
	}

	@Override
	public Student findStudentByLoginAndPass(String login, String password) {
		
		Student found = null;
		String jpql = "select s from Student s where s.email=:p1 and s.password=:p2";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", login);
		query.setParameter("p2", password);
		try{
			found = (Student) query.getSingleResult();
		}catch(Exception e){
		}
		
		return found;}

	
}
