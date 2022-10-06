package com.filehandling.test;

import java.io.File;

public class TestCar {

	public static void main(String[] args) {
		try {
		Car c1 = new Car("R123",2021,0, 9000);
		Car c2 = new Car("R234",2006,0,350000);
		Car c3 = new Car("R345",2009,0,950000);
		Car c4 = new Car("R456",2020,0,850000);
 		Car c5 = new Car("R567",2022,0, 1000);
		Car c6 = new Car("R678",2018,1000,750000);
		Car c7 = new Car("R789",2018,5000,80000);
		Car c8 = new Car("R890",2020,0,25000);
		Car c9 = new Car("R901",2020,0,790000);
		Car c10 = new Car("R012",2019,0,950000);
		
		//Creating the array of Car class
		Car [] cars = new Car[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		
		//It will create new file and delete the file if it is already existed.
		File f = new File("car.txt");
		f.delete();
		
		//Creating the object of CarList
		CarList carList = new CarList("car.txt");
		
		for(Car c : cars) {
			carList.addCar(c);
		}
		
		//print the no. of new cars in CarList
		System.out.println("New Cars : " + carList.countNewCars());
		
		//print the details of most expensive car.
		System.out.println("Most expensive Car : " +carList.mostExpensiveCar());
		
		//it will remove the object from the list if its coincides with the given object of Car
		carList.removeCar(c10);
		System.out.println("New Cars : " + carList.countNewCars());
		
		carList.removeCar(c5);
		System.out.println("New Cars : " + carList.countNewCars());
		
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		

	}

}
