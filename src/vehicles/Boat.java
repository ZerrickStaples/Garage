package vehicles;

public class Boat extends Vehicle {
	private Boolean isGasOperated;
	private String typeOfBoat;
	
	public Boat(String methodOfTransport, int numberOfPassengers, String fuelType) {
		super(methodOfTransport, numberOfPassengers, fuelType);
		this.isGasOperated = isGasOperated;
		this.typeOfBoat = typeOfBoat;
	}
	
	public static void Sail() {
		System.out.println("The boat is sailing!");
	}
}
