package com.qa.garage;

public class Plane extends Vehicle {

	private int wingSpan;

	public Plane() {
		super();
	}

	public Plane(int engineSize, int noOfWheels, boolean stationary, int wingSpan) {
		super(engineSize, noOfWheels, stationary);
		this.wingSpan = wingSpan;
	}

	@Override
	public String toString() {
		return "Plane [wingSpan=" + wingSpan + ", getEngineSize()=" + getEngineSize() + ", getNoOfWheels()="
				+ getNoOfWheels() + ", isStationary()=" + isStationary() + "]";
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	@Override
	public float calcRepairCost() {
		return getEngineSize() * getNoOfWheels() / wingSpan;
	}
}
