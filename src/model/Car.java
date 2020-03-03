package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name = "Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carID")
	private int carID;
	@Column(name = "model")
	private String model;
	@Column(name = "make")
	private String make;
	@Column(name = "type")
	private String type;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String make, String type) {
		super();
		this.model = model;
		this.make = make;
		this.type = type;
	}

	public int getCarID() {
		return carID;
	}

	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public String getType() {
		return type;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", model=" + model + ", make=" + make + ", type=" + type + "]";
=======
@Table(name = "car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAR_ID")
	private int carID;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "MAKE")
	private String make;
	@Column(name = "TYPE")
	private String type;
	
	
	/**
	 * default constructor, takes no arguments
	 */
	public Car() {
>>>>>>> 479aed4036a5c399bebca58ba4706884b5a27494
	}

	/**
	 * @param model
	 * @param make
	 * @param type
	 */
	public Car(String model, String make, String type) {
		this.model = model;
		this.make = make;
		this.type = type;
	}

	/**
	 * @param carID
	 * @param model
	 * @param make
	 * @param type
	 */
	public Car(int carID, String model, String make, String type) {
		this.carID = carID;
		this.model = model;
		this.make = make;
		this.type = type;
	}

	/**
	 * @return the carID
	 */
	public int getCarID() {
		return carID;
	}

	/**
	 * @param carID the carID to set
	 */
	public void setCarID(int carID) {
		this.carID = carID;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", model=" + model + ", make=" + make + ", type=" + type + "]";
	}
	
	
}
