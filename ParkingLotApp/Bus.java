package parkingLotApp;

public class Bus implements Vehicle{
	
	private String licensePlate;
	
	public Bus(String licensePlate){
		this.licensePlate = licensePlate;
	}

	@Override
	public String getLiscensePlate() {
		return licensePlate;
	}

	@Override
	public String getVehicleType() {
		return "Bus";
	}

	@Override
	public void park() {
		
	}

}
