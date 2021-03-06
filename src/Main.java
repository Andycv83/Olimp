import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Main {
	
	private static final String QUESTION_XML = "./file/Olimp/question.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException, SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
	
		DbService db = new DbService();
		
		Set <Task> taskCollection = new LinkedHashSet <Task>();
		
		Olimpiad biology = new Olimpiad();
		biology.setName("Biology");		
		biology.setId(1);
				
		Task task1= new Task();		
		task1.setId(1);
		task1.setDescription("First task for begginer First task for begginer");
		task1.setOlimpId(1);
		taskCollection.add(task1);
		
		Task task2= new Task();
		task2.setId(2);
		task2.setDescription("Second task for begginer 222222222");
		task2.setOlimpId(1);
		taskCollection.add(task2);
		
		Task task3= new Task();
		task3.setId(3);
		task3.setDescription("Third task for begginer Third task for begginer  Third task for begginer ");
		task3.setOlimpId(1);
		taskCollection.add(task3);
		
		Task task4= new Task();
		task4.setId(4);
		task4.setDescription("Test task number four");
		task4.setOlimpId(1);
		taskCollection.add(task4);
		
		Task task5= new Task();
		task5.setId(5);
		task5.setDescription("One more task # 5 wwwwwwwwwwwwwwwwwww");
		task5.setOlimpId(1);
		taskCollection.add(task5);
				
		biology.setTasksList(taskCollection);
		
		for (Task task :taskCollection ){
			db.addTask(task);
		}
		
/*	JAXBContext context = JAXBContext.newInstance(Olimpiad.class);
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
	*/    
		    Set <Task> newTask = biology.getTasksList();
		    		
		    for (Task t : newTask) {
	
		      System.out.println("Task: " + t.getId() + "  "
		          + t.getDescription());
		    }
	    
	}
}
