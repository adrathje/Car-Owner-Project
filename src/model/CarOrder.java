package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_order")
public class CarOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAR_ORDER_NUMBER")
	private int carOrderNumber;
	@Column(name = "CAR_ID")
	private Car car;
	@Column(name = "DATE")
	private LocalDate date;
	@ManyToOne
	@JoinColumn(name = "PERSON_ID")
	private Person person;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "CARS_ON_LIST", joinColumns = {
			@JoinColumn(name = "CAR_ORDER_NUMBER", referencedColumnName = "CAR_ORDER_NUMBER") }, inverseJoinColumns = {
					@JoinColumn(name = "CAR_ID", referencedColumnName = "CAR_ID", unique = true) })
	private List<Car> listOfItems;

	/**
	 * default constructor, takes no arguments
	 */
	public CarOrder() {
	}

	/**
	 * @param carOrderNumber
	 * @param car
	 * @param date
	 * @param person
	 * @param listOfItems
	 */
	public CarOrder(int carOrderNumber, Car car, LocalDate date, Person person, List<Car> listOfItems) {
		this.carOrderNumber = carOrderNumber;
		this.car = car;
		this.date = date;
		this.person = person;
		this.listOfItems = listOfItems;
	}

	/**
	 * @param car
	 * @param date
	 * @param person
	 * @param listOfItems
	 */
	public CarOrder(Car car, LocalDate date, Person person, List<Car> listOfItems) {
		this.car = car;
		this.date = date;
		this.person = person;
		this.listOfItems = listOfItems;
	}

	/**
	 * @param car
	 * @param date
	 * @param person
	 */
	public CarOrder(Car car, LocalDate date, Person person) {
		this.car = car;
		this.date = date;
		this.person = person;
	}

	
	
	/**
	 * @param date
	 * @param person
	 */
	public CarOrder(LocalDate date, Person person) {
		this.date = date;
		this.person = person;
	}

	/**
	 * @return the carOrderNumber
	 */
	public int getCarOrderNumber() {
		return carOrderNumber;
	}

	/**
	 * @param carOrderNumber the carOrderNumber to set
	 */
	public void setCarOrderNumber(int carOrderNumber) {
		this.carOrderNumber = carOrderNumber;
	}

	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the listOfItems
	 */
	public List<Car> getListOfItems() {
		return listOfItems;
	}

	/**
	 * @param listOfItems the listOfItems to set
	 */
	public void setListOfItems(List<Car> listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "CarOrder [carOrderNumber=" + carOrderNumber + ", car=" + car + ", date=" + date + ", person=" + person
				+ ", listOfItems=" + listOfItems + "]";
	}

}
