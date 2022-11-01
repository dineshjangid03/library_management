package dao;



import javax.persistence.EntityManager;

import com.entity.Book;

import exception.BookException;
import util.EMutil;

public class BookDaoImpl implements BookDAO {

	@Override
	public String addBook(Book book) {
		
		String message="not added !";
		
		EntityManager em=EMutil.getEM();
		
		em.getTransaction().begin();
		em.persist(book);
		message="book added";
		em.getTransaction().commit();
		em.close();

		return message;
		
	}

	@Override
	public String removeBook(int id) {
		
		String msg="Not Removed";
		
		EntityManager em=EMutil.getEM();
		Book book=em.find(Book.class, id);
		
		if(book==null) {
			msg="book not found with this id";
		}else {
			em.getTransaction().begin();
			em.remove(book);
			msg="book removed";
			em.getTransaction().commit();
		}
		
		em.close();
		
		return msg;
	}

	@Override
	public Book bookByID(int id) throws BookException{
		Book book=null;
		
		EntityManager em=EMutil.getEM();
		book=em.find(Book.class, id);
		
		if(book==null) {
			em.close();
			throw new BookException("book not found");
		}

		em.close();
		
		return book;
	}

	@Override
	public String updateBookQuantity(int bookId, int newQuantity) {
		String msg="not updated";
		EntityManager em=EMutil.getEM();
		Book book=em.find(Book.class, bookId);
		
		if(book==null) {
			msg="book not found";
		}
		else {
			em.getTransaction().begin();
			book.setQuantity(book.getQuantity()+newQuantity);
			msg="updated";
			em.getTransaction().commit();
		}
		
		em.close();
		return msg;
	}

}
