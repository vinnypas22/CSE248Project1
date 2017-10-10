package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class CustomerPane {

	private Button buyATicketButton;
	private Button payATicketButton;
	private Button receiptButton;
	private Button backButton;
	private HBox buttonBox;
	private Text chooseText;
	private VBox pane;
	private Scene scene;
	
	public CustomerPane(){
		buyATicketButton = new Button("Buy a Ticket");
		payATicketButton = new Button("Pay a ticket");
		receiptButton = new Button("View your receipt");
		buttonBox = new HBox();
		buttonBox.getChildren().addAll(buyATicketButton, payATicketButton, receiptButton);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(20);
		chooseText = new Text("Please choose one");
		chooseText.setFont(new Font(30));
		backButton = new Button("Back");
		pane = new VBox();
		pane.getChildren().addAll(chooseText, buttonBox, backButton);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		scene = new Scene(pane, 400, 400);
	}

	public Button getBuyATicketButton() {
		return buyATicketButton;
	}

	public Button getPayATicketButton() {
		return payATicketButton;
	}

	public Button getReceiptButton() {
		return receiptButton;
	}
	
	public Button getBackButton(){
		return backButton;
	}

	public HBox getButtonBox() {
		return buttonBox;
	}

	public VBox getPane() {
		return pane;
	}

	public Scene getScene() {
		return scene;
	}
	
}
