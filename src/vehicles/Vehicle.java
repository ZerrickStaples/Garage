package vehicles;

public class Vehicle {
	private String methodOfTransport;
	private int numberOfPassengers;
	private String fuelType;
	
	public Vehicle(String methodOfTransport, int numberOfPassengers, String fuelType) {
		this.methodOfTransport = methodOfTransport;
		this.numberOfPassengers = numberOfPassengers;
		this.fuelType = fuelType;
	}
}
