package application;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class SampleController {
	
	@FXML     // @FXML = C'est une annotation, c'est une m�ta-donn�e sur un objet
	private Button btnInscription;
	
	@FXML
	private TextField txtNom;
	
	@FXML
	private TextField txtEmail;
	
	@FXML
	private TextField txtPhone;
	
	@FXML
	private TextArea txtCommentaire;
	
	@FXML
	private void btnInscriptionHandler(Event e) {
		//System.out.println("Bouton Senregistrer clicked...");
		String nom = txtNom.getText();  // r�cup�rer le nom
		String email = txtEmail.getText(); // r�cup�rer l'email
		String phone = txtPhone.getText(); // r�cup�rer le phone
		String comment = txtCommentaire.getText();
		System.out.println("Vous �tes : "+nom +" Email : "+ email + " Phone : "+phone);
		System.out.println("Votre commentaire : "+comment);
	}
}
