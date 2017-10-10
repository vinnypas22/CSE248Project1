package model;

public class ParkingSpace {

	private int spotNum;
	private static int spotNumInt = 1;
	private boolean isParked;
	private int hoursParked;
	
	public ParkingSpace(){
		spotNum = spotNumInt++;
		isParked = false;
	}
	
	public int getSpotNum(){
		return spotNum;
	}
	
	public boolean isParked(){
		return isParked;
	}
	
	public void park(){
		isParked = true;
	}
	
	public int getHoursParked(){
		return hoursParked;
	}
	
	public void leaveParkingSpace(int hours){
		hoursParked = hours;
		isParked = false;
	}

	@Override
	public String toString() {
		return "ParkingSpace [spotNum=" + spotNum + ", isParked=" + isParked + ", hoursParked=" + hoursParked + "]";
	}
	
}
