package dao;

import javax.persistence.EntityManager;

import com.entity.Book;
import com.entity.Student;

import util.EMutil;

public class BookStudentImpl implements BookStudent{

	@Override
	public String issueBook(int studentId, int bookId) {
		String msg="book not issued";
		EntityManager em=EMutil.getEM();
		
		Student s=em.find(Student.class, studentId);
		Book b=em.find(Book.class, bookId);
		
		if(s==null) {
			msg="student not found with this id";
		}
		else if(b==null) {
			msg="book not found with this id";
		}
		else if(b.getQuantity()==0) {
			msg="book quantity is 0";
		}
		else if(s.getBooks().contains(b)) {
			msg="book already issued";
		}
		else {
			em.getTransaction().begin();
			s.getBooks().add(b);
			b.getStudent().add(s);
			b.setQuantity(b.getQuantity()-1);
			em.getTransaction().commit();
			msg="book issued";
		}
		
		em.close();
		return msg;
	}

	@Override
	public String returnBook(int studentId, int bookId) {
		String msg="book not returned";
		EntityManager em=EMutil.getEM();
		
		Student s=em.find(Student.class, studentId);
		Book b=em.find(Book.class, bookId);
		
		if(s==null) {
			msg="student not found with this id";
		}
		else if(b==null) {
			msg="book not found with this id";
		}
		else {
			em.getTransaction().begin();
			boolean flag1=b.getStudent().remove(s);
			boolean flag2=s.getBooks().remove(b);
			b.setQuantity(b.getQuantity()+1);
			em.getTransaction().commit();
			
			if(!flag1||!flag2) {
				msg="book was not alloted to this student";
			}
			else {
				msg="book returned";
			}
			
		}
		return msg;
	}

}
