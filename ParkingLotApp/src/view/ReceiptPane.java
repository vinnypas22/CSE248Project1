package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ReceiptPane {

	private Text receiptText;
	private Text vehicleText;
	private Text licenseText;
	private Text parkingSpotText;
	private Text totalText;
	private Button backButton;
	private VBox pane;
	private Scene scene;
	
	public ReceiptPane(){
		receiptText = new Text("Recept:");
		vehicleText = new Text("Vehicle Type: ");
		licenseText = new Text("Liscense plate number: ");
		parkingSpotText = new Text("Parking spot Number: ");
		totalText = new Text("Total: ");
		backButton = new Button("Back");
		pane = new VBox();
		pane.getChildren().addAll(receiptText, vehicleText, licenseText, parkingSpotText, totalText, backButton);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		scene = new Scene(pane, 400, 400);
	}

	public Text getReceiptText() {
		return receiptText;
	}

	public Text getVehicleText() {
		return vehicleText;
	}

	public Text getLicenseText() {
		return licenseText;
	}

	public Text getParkingSpotText() {
		return parkingSpotText;
	}

	public Text getTotalText() {
		return totalText;
	}
	
	public Button getBackButton(){
		return backButton;
	}

	public VBox getPane() {
		return pane;
	}

	public Scene getScene() {
		return scene;
	}
	
}
