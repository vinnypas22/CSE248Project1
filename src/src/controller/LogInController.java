package controller;

import javafx.stage.Stage;
import view.CustomerPane;
import view.LogInPane;
import view.ManagerPane;

public class LogInController {

	public LogInController(LogInPane logInPane, CustomerPane customerPane, Stage stage, ManagerPane managerPane){
		
		logInPane.getCustomerButton().setOnAction( e->{
			stage.setScene(customerPane.getScene());
		});	
		
		logInPane.getManagerButton().setOnAction( e->{
			stage.setScene(managerPane.getScene());
		});
	}
	
}
