package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSON_ID")
	private int personID;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	
	/**
	 * default constructor, takes no arguments
	 */
	public Person() {
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @param personID
	 * @param firstName
	 * @param lastName
	 */
	public Person(int personID, String firstName, String lastName) {
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return the personID
	 */
	public int getPersonID() {
		return personID;
	}
	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
