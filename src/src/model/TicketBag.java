package model;

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
		System.out.println("Size: " +tickets.size());
		for(int i = 0; i < tickets.size(); i++){
			System.out.println("Ticket: " + tickets.get(i));
			System.out.println("Vehicle: " + tickets.get(i).getVehicle());
			System.out.println("LicensePlate: " + tickets.get(i).getVehicle().getLiscensePlate());
			System.out.println("Licen " + license);
			if(tickets.get(i).getVehicle().getLiscensePlate().equals(license)){
				return tickets.get(i);
			}
		}
		return null;
	}
	
	public Ticket findByTicketNumber(int num){
        for(int i = 0; i < tickets.size(); i++){
            if (tickets.get(i).getTicketNum() == num){
                return tickets.get(i);
            }
        }
        return null;
    }
	
	public ArrayList<Ticket> getTickets(){
		return tickets;
	}
}
