package usecase;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;
import exception.LibrarianException;
import model.Librarian;

public class GetLibrarianByID {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		try {
			Librarian librarian=l.librarianByID(1);
			System.out.println(librarian);
		} catch (LibrarianException e) {
			System.out.println(e.getMessage());
		}

	}

}
