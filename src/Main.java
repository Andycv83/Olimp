import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Olimpiad biology = new Olimpiad();
		biology.setName("Biology");
			
		Task taskOne = new Task("Завдання номер один");
		Task taskTwo = new Task("Завдання номер два");
		Task taskThree = new Task("Завдання номер три");

		Set <Task> firstQuestion = new HashSet <Task>();
		firstQuestion.add(taskOne);
		firstQuestion.add(taskTwo);
		firstQuestion.add(taskThree);
		
		biology.setTasks(firstQuestion);
		
	}
}
