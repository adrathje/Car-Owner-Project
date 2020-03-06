package controller;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;


/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/addItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddItemServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String model = request.getParameter("model");
		String make = request.getParameter("make");
		String type = request.getParameter("type");
		if (model.isEmpty() || make.isEmpty() || type.isEmpty() || model == null || make == null || type == null) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		} else {
			Car c = new Car(model, make, type);
			CarHelper dao = new CarHelper();
			dao.insertItem(c);

			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
