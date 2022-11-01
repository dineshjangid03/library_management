package usecase.book;

import com.entity.Book;

import dao.BookDAO;
import dao.BookDaoImpl;

public class AddBook {

	public static void main(String[] args) {
		
		BookDAO b=new BookDaoImpl();
		String res=b.addBook(new Book("java", "danny", "raj", 3));
		System.out.println(res);

	}

}
