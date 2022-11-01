package usecase.student;

import com.entity.Student;

import dao.StudentDao;
import dao.StudentDaoImpl;

public class AddStudent {

	public static void main(String[] args) {
		
		StudentDao s=new StudentDaoImpl();
		String res=s.addStudent(new Student("Demo", "Demo", "8696"));
		System.out.println(res);

	}

}
