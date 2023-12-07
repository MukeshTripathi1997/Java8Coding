package in.mukeshit.beans;

public interface Vehicle {
	public void cleanVehicle();
	 default void sensor() {
		System.out.println("SENSOR  added.......!!!!");
	}
	default void startVehicle() {
		System.out.println("Vehicle started...!!!");
	}
	static void fuelCheck() {
		System.out.println("Checking the fuel...!!!");
		
	}
	
	

}
