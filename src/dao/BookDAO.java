package dao;

import exception.BookException;
import model.Book;

public interface BookDAO {
	
	public String addBook(Book book);
	
	public String removeBook(int id);
	
	public Book bookByID(int id) throws BookException;

}
