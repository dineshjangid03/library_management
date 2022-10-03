package usecase;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;

public class RemoveLibrarian {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		String res=l.removeLibrarian(1);
		
		System.out.println(res);

	}

}
