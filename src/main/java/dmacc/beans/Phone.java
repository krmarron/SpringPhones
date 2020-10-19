package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String brand;
	private String model;
	private String carrier;
	
	public Phone() {
		super();
		this.carrier = "verizon";
	}
	
	public Phone(String brand) {
		super();
		this.brand = brand;
	}
	
	public Phone(String brand, String model, String carrier) {
		super();
		this.brand = brand;
		this.model = model;
		this.carrier = carrier;
	}
	
	public Phone(int id, String brand, String model, String carrier) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.carrier = carrier;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", carrier=" + carrier + "]";
	}
	
	
}
