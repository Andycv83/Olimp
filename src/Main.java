import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;


public class Main {
	
	private static final String QUESTION_XML = "./question.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException, SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
	
		DbService db = new DbService();
		Set <Task> newTasks = new HashSet <Task>();
		
		Olimpiad biology = new Olimpiad();
		biology.setName("Biology");		
				
		Task task1= new Task();		
		task1.setId(1);
		task1.setDescription("1First task for begginer ");
		newTasks.add(task1);
		
		Task task2= new Task();
		task2.setId(2);
		task2.setDescription("2Second task for begginer");
		newTasks.add(task2);
		
		Task task3= new Task();
		task3.setId(3);
		task3.setDescription("3Third task for begginer");
		newTasks.add(task3);
				
		biology.setTasksList(newTasks);
		
//		for (Task t : newTasks){
//		db.createTask(t);
//		}
				
		
/*		JAXBContext context = JAXBContext.newInstance(Olimpiad.class);
		    Marshaller marsh = context.createMarshaller();
		    marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		    
		    // Write to System.out
	        marsh.marshal(biology, System.out);

		    // Write to File
		    marsh.marshal(biology, new File(QUESTION_XML));
		    
		    System.out.println();
		    System.out.println("Output from our XML File: ");
		    Unmarshaller um = context.createUnmarshaller();
		    biology = (Olimpiad) um.unmarshal(new FileReader(QUESTION_XML));
		    
		    Set <Task> newTask = biology.getTasksList();
		    
		    for (Task t : newTask) {
	
		      System.out.println("Task: " + t.getId() + "  "
		          + t.getDescription());
		    }
		 */   
	}
}
