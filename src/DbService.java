import java.sql.*;

public class DbService {	
	
		static Connection conn ;
		static Statement stmt = null;
		ResultSet rs= null;
		
	public static void updateTable(String sql, Connection conn) throws SQLException {
		
		conn= DriverManager.getConnection("jdbc:sqlite:./file/Olimp/OlimpDB.db");
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		
	}
	
	public void updateRecord(){}   
	
	public void setRecord(){}
	
	public void deleteRecord(){}
	
	public void createTable(){}
		
}
