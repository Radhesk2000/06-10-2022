package com.filehandling.test;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
	private String model;
	private int year;
	private int km;
	private double price;
	
	//Constructor to construct a car object
	public Car(String model, int year, int km, double price) {
		this.model = model;
		this.year = year;
		this.km = km;
		this.price = price;
	}
	// get method of model
	public String getModel() {
		return model;
	}
	//get method of year
	public int getYear() {
		return year;
	}
	//get method of km
	public int getKm() {
		return km;
	}
	//get method of price
	public double getPrice() {
		return price;
	}
	// toString method to print all details of car
	@Override
	public String toString() {
		return " model : " + model + ", year: " + year + ", km: " + km + ", price: " + price;
	}
	//It returns true if car coincides with the car c in all of its data
	public boolean equalTo(Car c) {
		return this.model.equals(c.model) &&
				this.year == c.year &&
				this.km == c.km &&
				this.price == c.price;
	}
	//return car object reading from file
	public static Car read(BufferedReader br) throws IOException {
		String s = br.readLine();
		if (s == null)
			return null;
		else
			return new Car(s, Integer.parseInt(br.readLine()),
							Integer.parseInt(br.readLine()),
							Double.parseDouble(br.readLine()));
	}
	
	
}

