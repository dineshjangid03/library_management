package dao;

import javax.persistence.EntityManager;

import com.entity.Student;
import exception.StudentException;
import util.EMutil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String addStudent(Student student) {
		String message="not added !";
		
		EntityManager em=EMutil.getEM();
		
		em.getTransaction().begin();
		em.persist(student);
		message="student added";
		em.getTransaction().commit();
		em.close();

		return message;
	}

	@Override
	public String removeStudent(int id) {
		String msg="Not Removed";
		
		EntityManager em=EMutil.getEM();
		Student s=em.find(Student.class, id);
		
		if(s==null) {
			msg="student not found with this id";
		}else {
			em.getTransaction().begin();
			em.remove(s);
			msg="student removed";
			em.getTransaction().commit();
		}
		
		em.close();
		
		return msg;
	}

	@Override
	public Student studentByID(int id) throws StudentException {
		
		Student s=null;
		EntityManager em=EMutil.getEM();
		s=em.find(Student.class, id);
		if(s==null) {
			em.close();
			throw new StudentException("student not found");
		}
		em.close();
		return s;
		
	}

}
