package dao;


import com.entity.Book;

import exception.BookException;


public interface BookDAO {
	
	public String addBook(Book book);
	
	public String removeBook(int id);
	
	public Book bookByID(int id) throws BookException;

}
