package application;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


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
	private ToggleGroup profil;
	
	@FXML
	private void btnInscriptionHandler(Event e) {
		//System.out.println("Bouton Senregistrer clicked...");
		/*
		String nom = txtNom.getText();  // r�cup�rer le nom
		String email = txtEmail.getText(); // r�cup�rer l'email
		String phone = txtPhone.getText(); // r�cup�rer le phone
		String comment = txtCommentaire.getText();
		System.out.println("Vous �tes : "+nom +" Email : "+ email + " Phone : "+phone);
		System.out.println("Votre commentaire : "+comment);
		
		/// d�but partie alert
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Inscription avec succ�s");
		alert.setHeaderText("Bienvenue � ISIKA");
		alert.setContentText("F�licitation, la session demarre en Septembre 2022");
		alert.showAndWait();
		/// fin partie alert*/
		
		RadioButton temp = (RadioButton) profil.getSelectedToggle();
		System.out.println(temp.getText());
	}
}
