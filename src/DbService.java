import java.sql.*;

public class DbService {
	
	
	public DbService() {
				
		try{
		Class.forName("org.sqlite.JDBC").newInstance();
		}
		catch (Exception e){
			
		}
	}
	
	public void createTask(Task task) throws SQLException{
		String sql = "INSERT INTO Task (id,description) " +
	    "VALUES ("+task.getId()+ " ," +task.getDescription()+")";
		exuceteSQL(sql);
	}   
	
	public void updateTask(){}
	
	public void deleteTask(){}
	
	
	
	public void exuceteSQL(String sql) throws SQLException{
		
		Connection connection = DriverManager.getConnection("jdbc:sqlite:./file/Olimp/OlimpDB.db");
		Statement stmt = connection.createStatement();	
		
		stmt.execute(sql);
		stmt.close();
		connection.close();
		
	}
		
}
