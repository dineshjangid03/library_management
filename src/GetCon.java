import java.sql.Connection;

public class GetCon {

	public static void main(String[] args) {
		
		Connection con=DBConnection.getConnection();
		
		if(con!=null) {
			System.out.println("connected");
		}

	}

}
