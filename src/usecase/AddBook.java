package usecase;

import dao.BookDAO;
import dao.BookDaoImpl;
import model.Book;

public class AddBook {

	public static void main(String[] args) {
		
		BookDAO b=new BookDaoImpl();
		String res=b.addBook(new Book("java", "danny", "raj", 5));
		
		System.out.println(res);

	}

}
