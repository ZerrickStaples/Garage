package vehicles;

public class Plane extends Vehicle {
	private String typeOfPlane;
	private int topSpeed;
	
	public Plane(String methodOfTransport, int numberOfPassengers, String fuelType) {
		super(methodOfTransport, numberOfPassengers, fuelType);
		
	}
	
	public static void Fly() {
		System.out.println("The plane is flying!");
	}
}
