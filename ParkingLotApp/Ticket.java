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
		ticketNumInt = 5000;
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
		ticketPrice += parkingSpace.getHoursParked() * parkingSpace.getHourlyRate();
	}

	@Override
	public String toString() {
		return "Ticket [parkingSpace=" + parkingSpace + ", vehicle=" + vehicle + ", ticketNum=" + ticketNum
				+ ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}
