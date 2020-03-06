import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.CarOrderHelper;
import model.Car;
import model.CarOrder;
import model.Person;

public class ShopperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shopper bill = new Shopper("Bill");
		
		//ShopperHelper sh = new ShopperHelper();
		
		//sh.insertShopper(bill);
		
		/*
		 * List<Shopper> allShoppers = sh.showAllShoppers(); for(Shopper a: allShoppers)
		 * { System.out.println(a.toString()); }
		 */
		
		//Shopper cameron = new Shopper("Cameron");
		
		//ShopperHelper sh = new ShopperHelper();
		
		//sh.insertShopper(cameron);
		
		//ListDetailHelper ldh = new ListDetailHelper();
		//ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);
		
		//ldh.insertNewListDetails(cameronList);
		//ldh.insertShopper(cameronList);
		
		//List<ListDetails> allLists = ldh.getLists();
		//for(ListDetails a : allLists) {
		//	System.out.println(a.toString());
		//}
		
		Person susan = new Person("Susan", "Smith");
		CarOrderHelper ldh = new CarOrderHelper();
		Car susancar = new Car("Camry", "Toyota", "Sedan");
		Car jamescar = new Car("Sentra", "Nissan", "Sedan");
		List<Car> susansItems = new ArrayList<Car>();
		susansItems.add(susancar);
		susansItems.add(jamescar);
		
		CarOrder susansList = new CarOrder();
		susansList.setListOfItems(susansItems);
		ldh.insertNewListDetails(susansList);
		List<CarOrder> allLists = ldh.getList();
			for(CarOrder a: allLists) {
				System. out .println(a.toString());
				}   
	}

}
