import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Main {
	
	private static final String QUESTION_XML = "D:/workspace/Olimp/question.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub

				
		Set <Task> firstQuestion = new HashSet <Task>();
		
		Task task1= new Task();
		task1.setId(1);
		task1.setDescription("First task for begginer");
		firstQuestion.add(task1);
		
		Task task2= new Task();
		task1.setId(2);
		task1.setDescription("Second task for begginer");
		firstQuestion.add(task2);
		
		Task task3= new Task();
		task1.setId(3);
		task1.setDescription("Third task for begginer");
		firstQuestion.add(task3);
		
		Olimpiad biology = new Olimpiad();
		biology.setName("Biology");		
		biology.setTasks(firstQuestion);
		
		if(new File(QUESTION_XML).exists()){
			System.out.println("file question is present ");
		}
		else 
			System.out.println("file not found");
		
		  JAXBContext context = JAXBContext.newInstance(Olimpiad.class);
		    Marshaller marsh = context.createMarshaller();
		    marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		    
		    // Write to System.out
//		    marsh.marshal(biology, System.out);

		    // Write to File
//		    marsh.marshal(biology, new File(QUESTION_XML));
		    
		    System.out.println();
		    System.out.println("Output from our XML File: ");
		    Unmarshaller um = context.createUnmarshaller();
		    biology = (Olimpiad) um.unmarshal(new FileReader(QUESTION_XML));
		    
		    Set <Task> newTask = biology.getTasks();
		    
		    for (Task t : newTask) {
		      System.out.println("Task: " + t.getId() + "  "
		          + t.getDescription());
		    }
	}
}
