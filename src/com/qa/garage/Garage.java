package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

	public float calcBill() {
		float bill = 0;
		for (Vehicle vehicle : vehicles) {
			bill += vehicle.calcRepairCost();
		}
		return bill;
	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	public List<Vehicle> removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
//		if ("Tank".equals(type)) {
//			for (Vehicle vehicle : this.vehicles) {
//				if (vehicle instanceof Tank) {
//					toRemove.add(vehicle);
//				}
//			}
//		} else if ("MotorBike".equals(type)) {
//			for (Vehicle vehicle : this.vehicles) {
//				if (vehicle instanceof MotorBike) {
//					toRemove.add(vehicle);
//				}
//			}
//		} else if ("Plane".equals(type)) {
//			for (Vehicle vehicle : this.vehicles) {
//				if (vehicle instanceof Plane) {
//					toRemove.add(vehicle);
//				}
//			}
//		}
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(vehicle);
//				this.vehicles.remove(vehicle);
			}
		}

		this.vehicles.removeAll(toRemove);

		return toRemove;
	}

}
