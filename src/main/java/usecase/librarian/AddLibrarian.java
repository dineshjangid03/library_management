package usecase.librarian;

import com.entity.Librarian;

import dao.LibrarianDAO;
import dao.LibrarianDaoImpl;

public class AddLibrarian {

	public static void main(String[] args) {
		
		LibrarianDAO l=new LibrarianDaoImpl();
		
		String res=l.addLibrarian(new Librarian("Dinesh", "@123", "d@mail", "999999"));
		
		System.out.println(res);

	}

}
