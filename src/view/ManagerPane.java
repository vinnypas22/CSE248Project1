package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ManagerPane {

	private Button activeTicketButton;
	private Button emptySpotsButton;
	private ComboBox<String> activeTicketComboBox;
	private ObservableList<String> activeTicketsOptions;
	private ComboBox<String> spotsComboBox;
	private ObservableList<String> emptySpots;
	private Text ticketNumber;
	private Text licensePlate;
	private Text vehicleType;
	private Text spotNumber;
	private Text headerText;
	private Button backButton;
	private HBox activeTicketBox;
	private VBox textBox;
	private HBox emptyTicketBox;
	private Scene scene;
	private VBox pane;
	
	public ManagerPane(){
		activeTicketButton = new Button("Active Tickets");
		emptySpotsButton = new Button("Empty Spots");
		emptySpots = FXCollections.observableArrayList();
		activeTicketsOptions = FXCollections.observableArrayList();
		activeTicketComboBox = new ComboBox(activeTicketsOptions);
		spotsComboBox = new ComboBox(emptySpots); 
		headerText = new Text("Active/Empty spots:");
		headerText.setFont(new Font(30));
		ticketNumber = new Text();
		licensePlate = new Text();
		spotNumber = new Text();
		vehicleType = new Text();
		backButton = new Button("Back");
		activeTicketBox = new HBox();
		activeTicketBox.getChildren().addAll(activeTicketButton, activeTicketComboBox);
		activeTicketBox.setAlignment(Pos.CENTER_LEFT);
		activeTicketBox.setSpacing(20);
		textBox = new VBox();
		textBox.getChildren().addAll(ticketNumber, licensePlate, spotNumber, vehicleType);
		textBox.setAlignment(Pos.CENTER);
		textBox.setSpacing(20);
		emptyTicketBox = new HBox();
		emptyTicketBox.getChildren().addAll(emptySpotsButton, spotsComboBox);
		emptyTicketBox.setAlignment(Pos.CENTER_LEFT);
		emptyTicketBox.setSpacing(20);
		pane = new VBox();
		pane.getChildren().addAll(headerText, activeTicketBox, textBox, emptyTicketBox, backButton);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		scene = new Scene(pane, 400, 400);
	}

	public Button getActiveTicketButton() {
		return activeTicketButton;
	}

	public Button getEmptySpotsButton() {
		return emptySpotsButton;
	}

	public ComboBox<String> getActiveTicketComboBox() {
		return activeTicketComboBox;
	}

	public ObservableList<String> getActiveTicketsOptions() {
		return activeTicketsOptions;
	}

	public ComboBox<String> spotsComboBox() {
		return spotsComboBox;
	}

	public ObservableList<String> getEmptySpots() {
		return emptySpots;
	}

	public Text getHeaderText() {
		return headerText;
	}

	public Text getTicketNumber() {
		return ticketNumber;
	}

	public Text getLicensePlate() {
		return licensePlate;
	}

	public Text getSpotNumber() {
		return spotNumber;
	}
	
	public Text getVehicleType(){
		return vehicleType;
	}

	public Button getBackButton() {
		return backButton;
	}

	public HBox getActiveTicketBox() {
		return activeTicketBox;
	}

	public VBox getTextBox() {
		return textBox;
	}

	public HBox getEmptyTicketBox() {
		return emptyTicketBox;
	}

	public Scene getScene() {
		return scene;
	}

	public VBox getPane() {
		return pane;
	}
	
}
