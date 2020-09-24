package com.qa.garage;

public class Tank extends Vehicle {

	private int barrelSize;

	public Tank() {
		super();
	}

	public Tank(int engineSize, int noOfWheels, boolean stationary, int barrelSize) {
		super(engineSize, noOfWheels, stationary);
		this.barrelSize = barrelSize;
	}

	@Override
	public String toString() {
		return "Tank [barrelSize=" + barrelSize + ", getEngineSize()=" + getEngineSize() + ", getNoOfWheels()="
				+ getNoOfWheels() + ", isStationary()=" + isStationary() + "]";
	}

	public int getBarrelSize() {
		return barrelSize;
	}

	public void setBarrelSize(int barrelSize) {
		this.barrelSize = barrelSize;
	}

	@Override
	public float calcRepairCost() {
		return getEngineSize() * getNoOfWheels() + barrelSize;
	}

}
