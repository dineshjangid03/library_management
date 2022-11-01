package usecase.book;

import dao.BookDAO;
import dao.BookDaoImpl;

public class UpdateBookQun {

	public static void main(String[] args) {
		BookDAO b=new BookDaoImpl();
		String res=b.updateBookQuantity(1, 5);
		System.out.println(res);
	}
	
}
