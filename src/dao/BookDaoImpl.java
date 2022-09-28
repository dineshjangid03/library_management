package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
