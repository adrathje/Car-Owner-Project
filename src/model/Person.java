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
	@Column(name = "personID")
	private int personID;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(int personID, String firstName, String lastName) {
		super();
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getPersonID() {
		return personID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
