package usecase;

import dao.BookDAO;
import dao.BookDaoImpl;
import exception.BookException;
import model.Book;

public class GetBookByID {

	public static void main(String[] args) {
		
		BookDAO b=new BookDaoImpl();
		
		try {
			Book book=b.bookByID(1);
			System.out.println(book);
		} catch (BookException e) {
			System.out.println(e.getMessage());
		}

	}

}
