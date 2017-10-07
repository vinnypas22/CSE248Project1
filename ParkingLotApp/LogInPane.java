package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LogInPane{
	
	private Text parkingLotText;
	private Text chooseText;
	private Button customerButton;
	private Button managerButton;
	private Scene scene;
	private HBox buttonBox;
	private VBox pane;
	
	public LogInPane(){
		parkingLotText = new Text("Parking Lot");
        chooseText = new Text("Please choose one");
        customerButton = new Button("Customer");
        managerButton = new Button("Manager");
        buttonBox = new HBox();
        buttonBox.getChildren().addAll(customerButton, managerButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);
        pane = new VBox();
        pane.getChildren().addAll(parkingLotText, chooseText, buttonBox);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(10);
        scene = new Scene(pane,300,300);
	}
	
	public Button getCustomerButton(){
		return customerButton;
	}
	
	public Button getManagerButton(){
		return managerButton;
	}
	
	public Scene getScene(){
		return scene;
	}
	
}