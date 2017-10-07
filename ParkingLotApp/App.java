package start;

import controller.CustomerController;
import controller.LogInController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CustomerPane;
import view.LogInPane;
import view.ManagerPane;
import view.ReceiptPane;
import view.TicketPane;
import model.TicketBag;
import model.ParkingSpaceBag;

public class App extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		LogInPane logInPane = new LogInPane();
		CustomerPane customerPane = new CustomerPane();
		ManagerPane managerPane = new ManagerPane();
		TicketPane ticketPane = new TicketPane();
		ReceiptPane receiptPane = new ReceiptPane();
		TicketBag ticketBag = new TicketBag();
		TicketBag paidTicketBag = new TicketBag();
		CustomerController customerController = new CustomerController(customerPane, ticketPane, ticketBag, paidTicketBag, receiptPane, stage);
		LogInController logInController = new LogInController(logInPane, customerPane, stage, managerPane);
		stage.setScene(logInPane.getScene());
        stage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
