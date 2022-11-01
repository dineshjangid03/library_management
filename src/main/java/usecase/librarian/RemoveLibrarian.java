package usecase.librarian;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;

public class RemoveLibrarian {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		String res=l.removeLibrarian(2);
		
		System.out.println(res);

	}

}
