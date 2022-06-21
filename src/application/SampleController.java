package application;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SampleController {
	
	@FXML     // @FXML = C'est une annotation, c'est une méta-donnée sur un objet
	private Button btnInscription;
	
	@FXML
	private TextField txtNom;
	
	@FXML
	private TextField txtEmail;
	
	@FXML
	private TextField txtPhone;
	@FXML
	private void btnInscriptionHandler(Event e) {
		//System.out.println("Bouton Senregistrer clicked...");
		String nom = txtNom.getText();  // récupérer le nom
		String email = txtEmail.getText(); // récupérer l'email
		String phone = txtPhone.getText(); // récupérer le phone
		System.out.println("Vous êtes : "+nom +" Email : "+ email + " Phone : "+phone);
	}
}
