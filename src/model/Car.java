package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
