package dao;

import com.entity.Librarian;

import exception.LibrarianException;

public interface LibrarianDAO {
	
	public String addLibrarian(Librarian librarian);
	
	public String removeLibrarian(int id);
	
	public Librarian librarianByID(int id)throws LibrarianException;

}
