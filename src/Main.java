import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Olimpiad biology = new Olimpiad();
		biology.setName("Biology");
			
		Task taskOne = new Task("�������� ����� ����");
		Task taskTwo = new Task("�������� ����� ���");
		Task taskThree = new Task("�������� ����� ���");

		Set <Task> firstQuestion = new HashSet <Task>();
		firstQuestion.add(taskOne);
		firstQuestion.add(taskTwo);
		firstQuestion.add(taskThree);
		
		biology.setTasks(firstQuestion);
		
	}
}
