package com.qa.garage;

public class Vehicle {

	private int engineSize;
	private int noOfWheels;
	private boolean stationary;

	public Vehicle() {
		super();
	}

	public Vehicle(int engineSize, int noOfWheels, boolean stationary) {
		super();
		this.engineSize = engineSize;
		this.noOfWheels = noOfWheels;
		this.stationary = stationary;
	}

	public float calcRepairCost() {
		return 44.94F;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isStationary() {
		return stationary;
	}

	public void setStationary(boolean stationary) {
		this.stationary = stationary;
	}

}
