import java.util.List;

import controller.CarHelper;
import controller.PersonHelper;
import model.Car;
import model.Person;

public class Tester {

	public static void main(String[] args) {
		Car car = new Car("testModel" , "testMake", "testType");
		CarHelper ch = new CarHelper();
		ch.insertItem(car);
		List<Car> allCars = ch.showAllItems();
		for (Car a : allCars) {
			System.out.println(a.toString());
		}
		
		
		Person person = new Person("Austin", "Rathje");
		PersonHelper ph = new PersonHelper();
		ph.insertPerson(person);
		
		List<Person> allPersons = ph.showAllPersons();
		for (Person a : allPersons) {
			System.out.println(a.toString());
		}
		
	}

}
