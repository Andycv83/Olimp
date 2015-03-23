import java.sql.*;

public class DbService {
	
	public void addTask(Task task) throws SQLException{
		String sql = "INSERT INTO TASK (ID, olimpId , Description) " +  "VALUES (" +task.getId()+","+ 
					task.getOlimpId()+" ,'"+ task.getDescription() + "');";	
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
	
	public void createTable(String sql) throws SQLException{
		executeSQL(sql);
	}
	
	public void getAllTasks(int olimpId) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String sql = "SELECT * From TASK where olimpId = "  + olimpId +";";
	
		Class.forName("org.sqlite.JDBC").newInstance();	
		Connection connection = DriverManager.getConnection("jdbc:sqlite:./file/Olimp/OlimpDB.db");
		Statement stmt = connection.createStatement();	
		
		ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
	        	int id = rs.getInt("id");
	        	String  descr = rs.getString("Description");         
	         System.out.print( "ID =  " + id );
	         System.out.print("  Description : " + descr);
	         System.out.println();
			}
	}     
		
	private void executeSQL(String sql) throws SQLException{
		
		try{
			Class.forName("org.sqlite.JDBC").newInstance();		
			Connection connection = DriverManager.getConnection("jdbc:sqlite:./file/Olimp/OlimpDB.db");
			Statement stmt = connection.createStatement();	
			stmt.executeUpdate(sql);
			stmt.close();
			connection.close();
	//		
		}
		 catch (Exception e){
		}
		
	}
		
}
