package parkingLotApp;

import java.util.ArrayList;

public class TicketBag {

	private ArrayList<Ticket> tickets;
	
	public TicketBag(){
		tickets = new ArrayList<Ticket>();
	}
	
	public void add(Ticket ticket){
		tickets.add(ticket);
	}
	
	public void remove(Ticket ticket){
		for(int i = 0; i < tickets.size(); i++){
			if(tickets.get(i).equals(ticket)){
				tickets.remove(ticket);
			}
		}
	}
	
	public void display(){
		for(int i = 0; i < tickets.size(); i++){
			System.out.println("tickets: " + tickets.get(i));
		}
	}
	
	public Ticket findByLiscensePlate(String license){
		for(int i = 0; i < tickets.size(); i++){
			if(tickets.get(i).getVehicle().getLiscensePlate().equals(license)){
				return tickets.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Ticket> getTickets(){
		return tickets;
	}
}
