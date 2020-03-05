package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Car;

/**
 * Servlet implementation class EditItemForListServlet
 */
@WebServlet("/EditItemForListServlet")
public class EditItemForListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditItemForListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CarHelper dao = new CarHelper();

		String model = request.getParameter("model");
		String make = request.getParameter("make");
		String type = request.getParameter("type");
		Integer tempId = Integer.parseInt(request.getParameter("id"));

		Car itemToUpdate = dao.searchForItemById(tempId);
		itemToUpdate.setModel(model);
		itemToUpdate.setMake(make);
		itemToUpdate.setType(type);
		
		dao.updateItem(itemToUpdate); 
		 
		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
	}

}
