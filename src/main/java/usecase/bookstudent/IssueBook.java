package usecase.bookstudent;

import dao.BookStudent;
import dao.BookStudentImpl;

public class IssueBook {

	public static void main(String[] args) {
		
		BookStudent bs=new BookStudentImpl();
		
		String res=bs.issueBook(2, 1);
		
		System.out.println(res);

	}

}
