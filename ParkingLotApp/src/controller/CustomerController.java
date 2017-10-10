package controller;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import model.ParkingSpace;
import model.Ticket;
import model.TicketBag;
import view.CustomerPane;
import view.LogInPane;
import view.ReceiptPane;
import view.TicketPane;

public class CustomerController {

	public CustomerController(CustomerPane customerPane, TicketPane ticketPane, TicketBag ticketBag, TicketBag paidTicketBag, ReceiptPane receiptPane, LogInPane logInPane, Stage stage){
		
		customerPane.getBackButton().setOnAction( e->{
			stage.setScene(logInPane.getScene());
		});
		
		customerPane.getBuyATicketButton().setOnAction( e->{
			stage.setScene(ticketPane.getScene());
		});
		
		customerPane.getPayATicketButton().setOnAction( e->{
			TextInputDialog alert = new TextInputDialog();
			alert.setContentText("enter your license plate number");;
			alert.setTitle("Pay Ticket");
			Optional<String> result = alert.showAndWait();
			if(result.isPresent()){
				Ticket ticket = ticketBag.findByLiscensePlate(result.get());
				if(ticket != null){
					TextInputDialog hoursAlert = new TextInputDialog();
					hoursAlert.setContentText("enter the amount of hours you stayed");
					alert.setTitle("confirm");
					Optional<String> hoursResult = hoursAlert.showAndWait();
					if(hoursResult.get().matches("-?\\d+(.\\d+)?") && Integer.valueOf(hoursResult.get()) > 1){
						ticket.getParkingSpace().leaveParkingSpace(Integer.valueOf(hoursResult.get()));
						System.out.println(ticket.getParkingSpace().getHoursParked());
						ticket.calculatePrice();
					} else {
						Alert hoursErrorAlert = new Alert(Alert.AlertType.ERROR);
						hoursErrorAlert.setContentText("invalid hours entered");
						hoursErrorAlert.showAndWait();
					}
				} else {
					Alert licenseErrorAlert = new Alert(Alert.AlertType.ERROR);
					licenseErrorAlert.setContentText("Ticket not found");
					licenseErrorAlert.showAndWait();
				}
			}
			stage.setScene(receiptPane.getScene());
			Ticket ticket = ticketBag.findByLiscensePlate(result.get()); 
			if(ticket == null){
				Alert alert1 = new Alert(Alert.AlertType.ERROR);
				alert1.setContentText("couldnt find the ticket");
				alert1.showAndWait();
			} else {
				receiptPane.getVehicleText().setText("vehicle type: " + ticket.getVehicle().getVehicleType());
				receiptPane.getLicenseText().setText("license plate number: " + ticket.getVehicle().getLiscensePlate());
				receiptPane.getTotalText().setText("Total: " + ticket.getTicketPrice());
				receiptPane.getParkingSpotText().setText("parking spot number: " + ticket.getParkingSpace().getSpotNum());
			}
		});
	}
}
