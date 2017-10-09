package controller;

import javafx.stage.Stage;
import model.ParkingSpace;
import model.ParkingSpaceBag;
import model.Ticket;
import model.TicketBag;
import view.LogInPane;
import view.ManagerPane;

public class ManagerController {

	public ManagerController(ManagerPane managerPane, TicketBag ticketBag, ParkingSpaceBag parkingSpaceBag, ParkingSpace parkingSpace, LogInPane logInPane, Stage stage){
		 
		
		
		managerPane.getActiveTicketButton().setOnAction(e->{
			for(int i = 0; i < ticketBag.getTickets().size(); i++){
	            managerPane.getActiveTicketsOptions().add("Ticket # " + String.valueOf(ticketBag.getTickets().get(i).getTicketNum()));
	        	}
	        });
		
	    managerPane.getActiveTicketComboBox().setOnAction(e->{
	            if(managerPane.getActiveTicketComboBox().getSelectionModel().getSelectedItem() != null) {
	                String ticketNum = managerPane.getActiveTicketComboBox().getSelectionModel().getSelectedItem().substring(9);
	                Ticket ticketTemp = ticketBag.findByTicketNumber(Integer.parseInt(ticketNum));
	                managerPane.getTicketNumber().setText("Ticket number: " + String.valueOf(ticketTemp.getTicketNum()));
	                managerPane.getLicensePlate().setText("License Plate number: " + ticketTemp.getVehicle().getLiscensePlate());
	                managerPane.getSpotNumber().setText("Space number: " + ticketTemp.getParkingSpace().getSpotNum());
	                }


	        });
	       
	    managerPane.getEmptySpotsButton().setOnAction(e->{
	            if(managerPane.getEmptySpots().isEmpty()) {
	            	for(ParkingSpace ps : parkingSpaceBag.getParkingSpaces()){
	            		if(!ps.isParked()){
	            			managerPane.getEmptySpots().add("Spot number: " + ps.getSpotNum());
	            		}
	            	}
	            }
	        });

	        managerPane.getBackButton().setOnAction(e->{
	            stage.setScene(logInPane.getScene());
	        });  
	}
}

