package model;

public class Car implements Vehicle{

	private String licensePlate;
	
	public Car(String licensePlate){
		this.licensePlate = licensePlate;
	}
	
	@Override
	public String getLiscensePlate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVehicleType() {
		return "Car";
	}

	@Override
	public void park() {
		
	}

}
