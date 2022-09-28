package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Librarian;
import utility.DBconnection;

public class LibrarianDaoImpl implements LibrarianDAO {

	@Override
	public String addLibrarian(Librarian librarian) {
		String message="not added";
		
		try (Connection con=DBconnection.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("insert into librarian (name,password,email,mobile) values(?,?,?,?)");
			
			ps.setString(1, librarian.getName());
			ps.setString(2, librarian.getPassword());
			ps.setString(3, librarian.getEmail());
			ps.setString(4, librarian.getMobile());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="librarian added !";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		
		
		
		
		return message;
	}

}
