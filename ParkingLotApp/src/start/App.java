package start;

import controller.BuyTicketController;
import controller.CustomerController;
import controller.LogInController;
import controller.ManagerController;
import controller.ReceiptController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CustomerPane;
import view.LogInPane;
import view.ManagerPane;
import view.ReceiptPane;
import view.TicketPane;
import model.TicketBag;
import model.Vehicle;
import model.ParkingSpace;
import model.ParkingSpaceBag;
import model.Ticket;

public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		LogInPane logInPane = new LogInPane();
		CustomerPane customerPane = new CustomerPane();
		ManagerPane managerPane = new ManagerPane();
		TicketPane ticketPane = new TicketPane();
		ReceiptPane receiptPane = new ReceiptPane();
		ParkingSpace parkingSpace = new ParkingSpace();
		TicketBag ticketBag = new TicketBag();
		TicketBag paidTicketBag = new TicketBag();
		ParkingSpaceBag parkingSpaceBag = new ParkingSpaceBag();
			for(int i = 0; i < 50; i++){
	            parkingSpaceBag.add(new ParkingSpace());
	        }
		CustomerController customerController = new CustomerController(customerPane, ticketPane, ticketBag, paidTicketBag, receiptPane, logInPane, stage);
		LogInController logInController = new LogInController(logInPane, customerPane, stage, managerPane);
		BuyTicketController buyTicketController = new BuyTicketController(customerPane, ticketPane, ticketBag, parkingSpaceBag, stage);
		ManagerController managerController = new ManagerController(managerPane, ticketBag, parkingSpaceBag, parkingSpace, logInPane, stage);
		ReceiptController receiptController = new ReceiptController(customerPane, receiptPane, stage);
		stage.setScene(logInPane.getScene());
        stage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
