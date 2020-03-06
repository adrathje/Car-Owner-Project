import controller.PersonHelper;
import model.Person;

public class Tester {

	public static void main(String[] args) {
		Person person = new Person("Austin", "Rathje");
		PersonHelper ph = new PersonHelper();
		ph.insertPerson(person);
		
		
		
	}

}
