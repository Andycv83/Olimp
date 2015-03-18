import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "task")

@XmlType(propOrder = {"id", "description"})

public class Task {
	
	
	public static enum Level {
		beginer,
		expert		
	}; 
	private int id;
	private int olimpId;	
	private String description;	
	private Level level;
	
	@XmlElement(name = "description")
	
	public Level getLevel() {
		return level;
	}
	 
	 public void setLevel(Level level) {
		this.level = level;
	}
	 
	 public String getDescription() {
		return description;
	}
	 public void setDescription(String description) {
		this.description = description;
	}
	 public int getId() {
		return id;
	}
	 public void setId(int id) {
		this.id = id;
	}
	 public int getOlimpId() {
		return olimpId;
	}
	 public void setOlimpId(int olimpId) {
		this.olimpId = olimpId;
	}
}

