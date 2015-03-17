
public class Task {
	
	
	public static enum Level {
		beginer,
		expert		
	}; 
	private int id;
	private int olimpId;	
	private String description;	
	private Level level;
	
	public Task(String description) {
		this.description=description;
	} 
	
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

