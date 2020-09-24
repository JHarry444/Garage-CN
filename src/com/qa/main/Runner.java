package com.qa.main;

import com.qa.garage.Garage;
import com.qa.garage.Plane;
import com.qa.garage.Tank;
import com.qa.garage.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Vehicle plane1 = new Plane(500, 3, false, 30);
		Vehicle tank1 = new Tank(1000, 20, true, 40);

		Garage garage = new Garage();

		garage.addVehicle(tank1);
		garage.addVehicle(plane1);

		System.out.println(plane1.getClass().getName());

		System.out.println(garage);

		garage.addVehicle(new Plane());
		garage.removeByType("tank");

		System.out.println(garage);

		System.out.println(garage.calcBill());

		garage.addVehicle(new Tank(2000, 40, false, 80));

		System.out.println(garage.calcBill());
	}

}
