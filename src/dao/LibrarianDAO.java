package dao;

import model.Librarian;

public interface LibrarianDAO {
	
	public String addLibrarian(Librarian librarian);
	
	public String removeLibrarian(int id);

}
