package usecase;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;
import model.Librarian;

public class AddLibrarian {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		String res=l.addLibrarian(new Librarian("Dinesh", "@123", "d@mail", "999999"));
		
		System.out.println(res);

	}

}
