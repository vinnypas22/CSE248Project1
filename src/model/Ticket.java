package model;

public class Ticket {

	private ParkingSpace parkingSpace;
	private Vehicle vehicle;
	private int ticketNum;
	private static int ticketNumInt;
	private double ticketPrice;
	
	public Ticket(ParkingSpace parkingSpace, Vehicle vehicle){
		this.parkingSpace = parkingSpace;
		this.vehicle = vehicle;
		ticketNum = ticketNumInt++;
	}
	
	public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }
	
	public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
	
	public Vehicle getVehicle(){
        return vehicle;
    }
	
	public int getTicketNum(){
        return ticketNum;
    }
	
	public double getTicketPrice(){
		return ticketPrice;
	}
	
	public void calculatePrice(){
		if(vehicle instanceof Bus){
			ticketPrice = parkingSpace.getHoursParked() * 15;
		}
		
		if(vehicle instanceof Car){
			ticketPrice = parkingSpace.getHoursParked() * 5;
		}
	}

	@Override
	public String toString() {
		return "Ticket [parkingSpace=" + parkingSpace + ", vehicle=" + vehicle + ", ticketNum=" + ticketNum
				+ ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
