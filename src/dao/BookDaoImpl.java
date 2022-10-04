package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exception.BookException;
import model.Book;
import utility.DBconnection;

public class BookDaoImpl implements BookDAO {

	@Override
	public String addBook(Book book) {
		
		String message="not added !";
		
		try (Connection con=DBconnection.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("insert into books (name,author,publisher,quantity) values(?,?,?,?)");
			
			ps.setString(1, book.getBookName());
			ps.setString(2, book.getAuthor());
			ps.setString(3, book.getPublisher());
			ps.setInt(4, book.getQuantity());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="book added !";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		
		return message;
		
	}

	@Override
	public String removeBook(int id) {
		String msg="Not Removed";
		
		try (Connection con=DBconnection.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("delete from books where id=?");
			ps.setInt(1, id);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				msg="Book removed !";
			}
			
		} catch (SQLException e) {
			msg=e.getMessage();
		}

		return msg;
	}

	@Override
	public Book bookByID(int id) throws BookException{
		Book book=null;
		
		try (Connection con=DBconnection.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("select * from books where id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				String name=rs.getString("name");
				String author=rs.getString("author");
				String publisher=rs.getString("publisher");
				int quantity=rs.getInt("quantity");
				book=new Book(id, name, author, publisher, quantity);
			}
			else {
				throw new BookException("Book not availabe with this id");
			}
			
		} catch (SQLException e) {
			throw new BookException(e.getMessage());
		}

		return book;
	}

}
