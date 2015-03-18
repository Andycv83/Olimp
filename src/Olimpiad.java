import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "D:/workspace/Olimp/")

public class Olimpiad {
	
	  // XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "tasks")
	  
	  // XmlElement sets the name of the entities
	  @XmlElement(name = "task")
	  
	  
	private String name;
	private Date start;
	private Date end;
	private int id;
	private Set <Task> tasks ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	
public void setTasks(Set<Task> tasks) {
	this.tasks = tasks;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void addTask(Task t){
		tasks.add(t);
	}
}	


