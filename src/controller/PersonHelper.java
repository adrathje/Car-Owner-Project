package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Person;

public class PersonHelper {
static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Car-Owner-Project");
	
	public void insertShopper(Person p) {
		EntityManager em = emfactory .createEntityManager();  
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();  
		}
	
	public List<Person> showAllPersons() {
		EntityManager em = emfactory.createEntityManager();
		List<Person> allPersons = em.createQuery("SELECT p FROM Person p").getResultList();
		return allPersons;
	} 
}
