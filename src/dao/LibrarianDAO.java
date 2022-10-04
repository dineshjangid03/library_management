package dao;

import exception.LibrarianException;
import model.Librarian;

public interface LibrarianDAO {
	
	public String addLibrarian(Librarian librarian);
	
	public String removeLibrarian(int id);
	
	public Librarian librarianByID(int id)throws LibrarianException;

}
