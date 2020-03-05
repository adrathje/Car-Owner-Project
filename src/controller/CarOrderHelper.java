package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.CarOrder;


public class CarOrderHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Car-Owner-Project");

	public void insertNewListDetails(CarOrder s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<CarOrder> getList() {
		EntityManager em = emfactory.createEntityManager();
		List<CarOrder> allOrders = em.createQuery("SELECT d FROM CarOrder d").getResultList();
		return allOrders;
	}

	public CarOrder searchForListById(Integer tempId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		CarOrder found = em.find(CarOrder.class, tempId);
		em.close();
		return found;
	}

	public void deleteOrder(CarOrder listToDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<CarOrder> typedQuery = em.createQuery("select d from CarOrder d where d.carOrderNumber = :selectedcarOrderNumber",
				CarOrder.class);
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedcarOrderNumber", listToDelete.getCarOrderNumber());

		// we only want one result
		typedQuery.setMaxResults(1);

		// get the result and save it into a new list detail object
		CarOrder result = typedQuery.getSingleResult();

		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();

	}

	public void updateList(CarOrder toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}

}
