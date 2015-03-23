import java.sql.*;

public class DbService {

	
	public void addTask(Task task) throws SQLException{
		String sql = "INSERT INTO TASK (ID,Description) " +  "VALUES (" +task.getId()+" , '"+ task.getDescription() + "');";	
		executeSQL(sql);
	}   
	
	public void updateTask(Task task) throws SQLException{
		String sql = "UPDATE TASK set Description = '"+ task.getDescription()+"' where ID=" +task.getId()+";";	
		executeSQL(sql);
	}
	
	public void deleteTask(Task task) throws SQLException{
		String sql = "DELETE from TASK where ID=" +task.getId()+";";	
		executeSQL(sql);
	}
	
	
	
	public void executeSQL(String sql) throws SQLException{
		
		try{
		Class.forName("org.sqlite.JDBC").newInstance();
				
		Connection connection = DriverManager.getConnection("jdbc:sqlite:./file/Olimp/OlimpDB.db");
	
		Statement stmt = connection.createStatement();	
		
		stmt.executeUpdate(sql);
		stmt.close();
		connection.close();
		}
		catch (Exception e){			
		}
		
	}
		
}
