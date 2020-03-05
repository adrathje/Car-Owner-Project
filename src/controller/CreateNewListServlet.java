package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;
import model.CarOrder;
import model.Person;


/**
 * Servlet implementation class CreateNewListServlet
 */
@WebServlet("/createNewListServlet")
public class CreateNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CarHelper lih = new CarHelper();
		String listName = request.getParameter("listName");
		System.out.println("List Name: " + listName);

		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}

		String[] selectedCars = request.getParameterValues("allItemsToAdd");
		List<Car> selectedCarsInList = new ArrayList<Car>();
		if (selectedCars != null && selectedCars.length > 0) {
			for (int i = 0; i < selectedCars.length; i++) {
				System.out.println(selectedCars[i]);
				Car c = lih.searchForItemById(Integer.parseInt(selectedCars[i]));
				selectedCarsInList.add(c);

			}
		}

		Person person = new Person(firstName, lastName);
		CarOrder sld = new CarOrder(listName, ld, person);
		sld.setListOfItems(selectedCarsInList);
		CarOrderHelper slh = new CarOrderHelper();
		slh.insertNewListDetails(sld);

		System.out.println("Success!");
		System.out.println(sld.toString());

		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
