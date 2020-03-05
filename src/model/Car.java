package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	
	// Print method
	public String returnCarDetails() {
		return "Car ID= " + carID + ", model=" + model + ", make=" + make + ", type=" + type;
	}

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", model=" + model + ", make=" + make + ", type=" + type + "]";
	}

}
