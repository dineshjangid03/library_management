package usecase.librarian;

import com.entity.Librarian;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;
import exception.LibrarianException;

public class GetLibrarianByID {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		try {
			Librarian librarian=l.librarianByID(2);
			System.out.println(librarian);
		} catch (LibrarianException e) {
			System.out.println(e.getMessage());
		}

	}

}
