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
	private Text parkingSpot;
	private Text spotNumber;
	private Text hourlyRate;
	private Text availibility;
	private HBox buttonBox;
	private VBox ticketTextBox;
	private VBox ticketBox;
	private VBox spotTextBox;
	private VBox spotsBox;
	private Scene scene;
	private GridPane pane;
	
	public ManagerPane(){
		activeTicketButton = new Button("Active Tickets");
		emptySpotsButton = new Button("Empty Spots");
		activeTicketComboBox = new ComboBox(activeTicketsOptions);
		activeTicketsOptions = FXCollections.observableArrayList();
		spotsComboBox = new ComboBox(emptySpots); 
		emptySpots = FXCollections.observableArrayList();
		ticketNumber = new Text();
		licensePlate = new Text();
		parkingSpot = new Text();
		spotNumber = new Text();
		hourlyRate = new Text();
		availibility = new Text();
		buttonBox = new HBox();
		buttonBox.getChildren().addAll(activeTicketButton, emptySpotsButton);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(20);
		ticketTextBox = new VBox();
		ticketTextBox.getChildren().addAll(ticketNumber, licensePlate, parkingSpot, spotNumber);
		ticketTextBox.setAlignment(Pos.CENTER);
		ticketTextBox.setSpacing(20);
		ticketBox = new VBox();
		ticketBox.getChildren().addAll(activeTicketComboBox, ticketTextBox);
		ticketBox.setAlignment(Pos.CENTER);
		ticketBox.setSpacing(20);
		spotTextBox = new VBox();
		spotTextBox.getChildren().addAll(hourlyRate, availibility);
		spotTextBox.setAlignment(Pos.CENTER);
		spotTextBox.setSpacing(20);
		spotsBox = new VBox();
		spotsBox.getChildren().addAll(spotsComboBox, spotTextBox);
		spotsBox.setAlignment(Pos.CENTER);
		spotsBox.setSpacing(20);
		pane = new GridPane();
		pane.add(buttonBox, 0, 0);
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

	public ComboBox<String> getSpotsComboBox() {
		return spotsComboBox;
	}

	public ObservableList<String> getEmptySpots() {
		return emptySpots;
	}

	public Text getTicketNumber() {
		return ticketNumber;
	}

	public Text getLicensePlate() {
		return licensePlate;
	}

	public Text getParkingSpot() {
		return parkingSpot;
	}

	public Text getSpotNumber() {
		return spotNumber;
	}

	public Text getHourlyRate() {
		return hourlyRate;
	}

	public Text getAvailibility() {
		return availibility;
	}

	public HBox getButtonBox() {
		return buttonBox;
	}

	public VBox getTicketTextBox() {
		return ticketTextBox;
	}

	public VBox getTicketBox() {
		return ticketBox;
	}

	public VBox getSpotTextBox() {
		return spotTextBox;
	}

	public VBox getSpotsBox() {
		return spotsBox;
	}

	public Scene getScene() {
		return scene;
	}

	public GridPane getPane() {
		return pane;
	}
	
}
