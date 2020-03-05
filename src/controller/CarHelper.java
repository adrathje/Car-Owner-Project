package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Car;;

public class CarHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Car-Owner-Project");
	
	public void insertItem(Car li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Car> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<Car> allItems = em.createQuery("SELECT i FROM Car i").getResultList();
		return	allItems;
		}
	
	public void deleteItem(Car toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Car> typedQuery	= em.createQuery("select li from Car li where li.model = :selectedModel and li.make = :selectedMake and li.type = :selectedType", Car.class);

		//Substitute parameter with actual data	from the toDelete item
		typedQuery.setParameter("selectedModel", toDelete.getModel());
		typedQuery.setParameter("selectedMake",	toDelete.getModel());
		typedQuery.setParameter("selectedType", toDelete.getType());

		//we only want one result
		typedQuery.setMaxResults(1);

		//get the result and save it into a new	list item
		Car result	= typedQuery.getSingleResult();

		//remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();

		}

	public Car searchForItemById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Car found = em.find(Car.class, idToEdit);
		em.close();
		return	found;
	}

	public void updateItem(Car toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}

	public List<Car> searchForItemByModel(String modelName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Car> typedQuery	= em.createQuery("SELECT li	FROM Car li WHERE li.model = :selectedModel", Car.class);
		typedQuery.setParameter("selectedModel", modelName);
		List<Car> foundModel = typedQuery.getResultList();
		em.close();
		return	foundModel;
	}

	public List<Car> searchForItemByMake(String makeName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Car> typedQuery	= em.createQuery("SELECT li	FROM ListPet li WHERE li.make = :selectedMake",	Car.class);
		typedQuery.setParameter("selectedMake",	makeName);
		List<Car> foundMake = typedQuery.getResultList();
		em.close();
		return	foundMake;
	}
	
	public List<Car> searchForItemByType(String typeName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Car> typedQuery	= em.createQuery("SELECT li	FROM Car li WHERE li.type = :selectedType", Car.class);
		typedQuery.setParameter("selectedType",	typeName);
		List<Car> foundOwner = typedQuery.getResultList();
		em.close();
		return	foundOwner;
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
