package parkingLotApp;

import java.util.ArrayList;
import java.util.Collections;

public class ParkingSpaceBag {

	private ArrayList<ParkingSpace> parkingSpace;
	
	public ParkingSpaceBag(){
		parkingSpace = new ArrayList<ParkingSpace>();
	}
	
	public void add(ParkingSpace spot){
		parkingSpace.add(spot);
		selectionSort();
	}

	private void selectionSort() {
		int out;
		int in;
		int min;
		for(out = 0; out < parkingSpace.size() -1; out++){
			min = out;
			for(in = out + 1; in < parkingSpace.size(); in++ ){
				if(parkingSpace.get(in).getSpotNum() < parkingSpace.get(min).getSpotNum()){
					min = in; 
				}
			}
		Collections.swap(parkingSpace, out, min);
		}
	}
	
	public void remove(ParkingSpace spot){
		for(int i = 0; i < parkingSpace.size(); i++){
			if(parkingSpace.get(i).equals(parkingSpace)){
				parkingSpace.remove(spot);
			}
		}
	}
	
	public void display(){
		for(int i = 0; i < parkingSpace.size(); i++){
			System.out.println("parking spot: " + parkingSpace.get(i).getSpotNum());
		}
	}
	
	public ParkingSpace findBySpotNum(int num){
		for(int i = 0; i < parkingSpace.size(); i++){
			if(parkingSpace.get(i).getSpotNum() == num){
				return parkingSpace.get(i);
			}
		}
		return null;
	}
	
	public ParkingSpace getParkingSpot(){
		for(int i = 0; i < parkingSpace.size(); i++){
			if(parkingSpace.get(i) instanceof ParkingSpace){
				ParkingSpace temp = (ParkingSpace) parkingSpace.get(i);
				remove(parkingSpace.get(i));
				return temp;
			}
		}
		return null;
	}
	
	public ArrayList<ParkingSpace> getParkingSpaces(){
		return parkingSpace;
	}
}
