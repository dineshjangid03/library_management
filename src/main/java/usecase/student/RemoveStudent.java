package usecase.student;

import dao.StudentDao;
import dao.StudentDaoImpl;

public class RemoveStudent {

	public static void main(String[] args) {
		
		StudentDao s=new StudentDaoImpl();
		
		String res=s.removeStudent(3);
		
		System.out.println(res);

	}

}
