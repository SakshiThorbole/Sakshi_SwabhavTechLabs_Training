package com.aurionpro.list.model;

public class Car {
	int id;
	String companyName;
	int mileage;
	
	public Car(int id, String companyName, int mileage) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.mileage = mileage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", companyName=" + companyName + ", mileage=" + mileage + "]";
	}
}
