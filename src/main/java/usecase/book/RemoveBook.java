package usecase.book;

import dao.BookDAO;
import dao.BookDaoImpl;

public class RemoveBook {

	public static void main(String[] args) {
		
		BookDAO b=new BookDaoImpl();
		
		String res=b.removeBook(1);
		
		System.out.println(res);

	}

}
