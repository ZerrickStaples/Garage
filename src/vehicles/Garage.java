package vehicles;

import java.util.ArrayList;

public class Garage {

	Car car = new Car("land", 4, "gasoline");
	Boat boat = new Boat("water", 6, "oar");
	Plane plane = new Plane("air", 50, "jet fuel");
	
	static ArrayList<Vehicle> vehicleArray= new ArrayList<Vehicle>() {{
		add(new Car("land", 4, "gasoline"));
		add(new Boat("water", 6, "oar"));
		add(new Plane("air", 50, "jet fuel"));
	}};
	
	public static void addElementToList(int index, Vehicle element) {
		vehicleArray.add(index, element);
	}
	public static void removeElementFromList(int index, Vehicle element) {
		vehicleArray.remove(element);
	}
	
	public static Vehicle fixVehicle(int index) {
		return vehicleArray.get(index);
		
		
	}
	
	public static void main(String[] args) {
		Vehicle element = fixVehicle(0);
		System.out.println(element);
	}
	
	
}
