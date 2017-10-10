package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Bus;
import model.Car;
import model.ParkingSpace;
import model.ParkingSpaceBag;
import model.Ticket;
import model.TicketBag;
import view.CustomerPane;
import view.TicketPane;

public class BuyTicketController {

	public BuyTicketController(CustomerPane customerPane, TicketPane ticketPane, TicketBag ticketBag, ParkingSpaceBag parkingSpaceBag, Stage stage){

		ticketPane.getBackButton().setOnAction( e->{
			stage.setScene(customerPane.getScene());
		});
		
		ticketPane.getBuyTicketButton().setOnAction(e -> {
			if(ticketPane.getVehicleComboBox().getSelectionModel().isEmpty()){
				alert("Type of vehicle");
	        } else if(ticketPane.getLicnesePlateField().getText().isEmpty()){
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setTitle("Error");
	            alert.setContentText("Error on license plate");
	            alert.showAndWait();
	        } else if (ticketPane.getVehicleComboBox().getSelectionModel().isSelected(0)){
	            System.out.println("liscence " +  ticketPane.getLicnesePlateField().getText());
	        	Car car = new Car(ticketPane.getLicnesePlateField().getText());
	            ParkingSpace parkingSpace = parkingSpaceBag.getEmptyParkingSpace();
	            Ticket ticket = new Ticket(parkingSpace,car);
	            parkingSpace.park();
	            ticketBag.add(ticket);
	            parkingSpaceBag.display();
	            ticketConfirmation(String.valueOf(ticket.getTicketNum()),String.valueOf(ticket.getParkingSpace().getSpotNum()));
	         } else if (ticketPane.getVehicleComboBox().getSelectionModel().isSelected(1)){
	            Bus bus = new Bus(ticketPane.getLicnesePlateField().getText());
	            ParkingSpace parkingSpace = parkingSpaceBag.getParkingSpot();
	            Ticket ticket = new Ticket(parkingSpace, bus);
	            parkingSpace.park();
	            ticketBag.add(ticket);
	            parkingSpaceBag.display();
	            ticketConfirmation(String.valueOf(ticket.getTicketNum()),String.valueOf(ticket.getParkingSpace().getSpotNum()));
	         	}
			});
		}

	    private void alert(String input) {
	        Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setTitle("Error");
	        alert.setContentText(input + " is not correct");
	        alert.showAndWait();
	    }
	  
	    private void ticketConfirmation(String id, String parkingSpotNumber){
	        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	        alert.setTitle("Confirmation");
	        alert.setContentText("Ticket purchased: Ticket ID number: " + id +" Parking spot #: "+ parkingSpotNumber);
	        alert.showAndWait();
	    }
}
