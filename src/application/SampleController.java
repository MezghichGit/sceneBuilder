package application;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SampleController {
	
	@FXML
	private Button btnInscription;
	
	@FXML
	private TextField txtNom;
	
	@FXML
	private TextField txtEmail;
	
	@FXML
	private void btnInscriptionHandler(Event e) {
		System.out.println("Bouton Senregistrer clicked...");
		
	}
}
