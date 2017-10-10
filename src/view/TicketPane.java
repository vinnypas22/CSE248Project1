package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class TicketPane {

	private Text buyTicketText;
	private Text vehicleText;
	private ComboBox<String> vehicleComboBox;
	private Text licensePlate;
	private TextField licnesePlateField;
	private Button buyTicketButton;
	private Button backButton;
	private HBox vehicleBox;
	private HBox licensePlateBox;
	private VBox pane;
	private Scene scene;
	
	public TicketPane(){
		buyTicketText = new Text("Buy your Ticket");
		vehicleText = new Text("Please pick your vehicle:");
		ObservableList<String> vehicleOptions = FXCollections.observableArrayList("Car", "Bus");
		vehicleComboBox = new ComboBox<>(vehicleOptions);
		licensePlate = new Text("Enter your license plate number:");
		licnesePlateField = new TextField();
		buyTicketButton = new Button("Purchase");
		backButton = new Button("Back");
		vehicleBox = new HBox();
		vehicleBox.getChildren().addAll(vehicleText, vehicleComboBox);
		vehicleBox.setAlignment(Pos.CENTER);
		vehicleBox.setSpacing(20);
		licensePlateBox = new HBox();
		licensePlateBox.getChildren().addAll(licensePlate, licnesePlateField);
		licensePlateBox.setAlignment(Pos.CENTER);
		licensePlateBox.setSpacing(20);
		pane = new VBox();
		pane.getChildren().addAll(buyTicketText, vehicleBox, licensePlateBox, buyTicketButton, backButton);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		scene = new Scene(pane, 400, 400);
	}

	public Text getBuyTicketText() {
		return buyTicketText;
	}

	public Text getVehicleText() {
		return vehicleText;
	}

	public ComboBox<String> getVehicleComboBox() {
		return vehicleComboBox;
	}

	public Text getLicensePlate() {
		return licensePlate;
	}

	public TextField getLicnesePlateField() {
		return licnesePlateField;
	}

	public Button getBuyTicketButton() {
		return buyTicketButton;
	}
	
	public Button getBackButton(){
		return backButton;
	}

	public HBox getVehicleBox() {
		return vehicleBox;
	}

	public HBox getLicensePlateBox() {
		return licensePlateBox;
	}

	public VBox getPane() {
		return pane;
	}

	public Scene getScene() {
		return scene;
	}
	
}
