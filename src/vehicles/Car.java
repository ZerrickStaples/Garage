package vehicles;

public class Car extends Vehicle {
	private int year;
	private String make;
	private String model;
	private int numberOfDoors;
	
	public Car(String methodOfTransport, int numberOfPassengers, String fuelType) {
		super(methodOfTransport, numberOfPassengers, fuelType);
		this.year = year;
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
	}
	
	public static void Drive() {
		System.out.println("The car is accelerating");
	}
}
