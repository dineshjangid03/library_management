package usecase.student;

import com.entity.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;
import exception.StudentException;

public class GetStudentByID {

	public static void main(String[] args) {
		
		StudentDao s=new StudentDaoImpl();
		
		try {
			Student student=s.studentByID(3);
			System.out.println(student);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}

	}

}
