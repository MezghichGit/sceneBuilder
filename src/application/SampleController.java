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
	
	@FXML     // @FXML = C'est une annotation, c'est une méta-donnée sur un objet
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
		String nom = txtNom.getText();  // récupérer le nom
		String email = txtEmail.getText(); // récupérer l'email
		String phone = txtPhone.getText(); // récupérer le phone
		String comment = txtCommentaire.getText();
		System.out.println("Vous êtes : "+nom +" Email : "+ email + " Phone : "+phone);
		System.out.println("Votre commentaire : "+comment);
		
		/// début partie alert
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Inscription avec succès");
		alert.setHeaderText("Bienvenue à ISIKA");
		alert.setContentText("Félicitation, la session demarre en Septembre 2022");
		alert.showAndWait();
		/// fin partie alert*/
		
		RadioButton temp = (RadioButton) profil.getSelectedToggle();
		System.out.println(temp.getText());
	}
}
