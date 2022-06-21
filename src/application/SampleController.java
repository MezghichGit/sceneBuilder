package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController implements Initializable {

	@FXML // @FXML = C'est une annotation, c'est une m�ta-donn�e sur un objet
	private Button btnInscription;

	
	@FXML // @FXML = C'est une annotation, c'est une m�ta-donn�e sur un objet
	private Button btnListe;
	
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
	private CheckBox dev;

	@FXML
	private CheckBox test;
	@FXML
	private CheckBox gestion;
	
	@FXML
	private RadioButton etudiant;
	
	@FXML
	private RadioButton employe;

	@FXML
	public ComboBox<String> pays = new ComboBox<>();

	@Override // redefinition de la m�thode se trouvant dans l'interface
	public void initialize(URL arg0, ResourceBundle arg1) {
		pays.getItems().addAll("Paris", "Lyon", "Marseille", "Lille", "Toulon");
	}
	
	@FXML
	private void btnListeHandler(Event e) throws IOException {
		//System.out.println("Vers l'interface Liste des stagiaires");
		
		// 1) On cherche le grand p�re du bouton[le bouton a comme pere la sc�ne et la sc�ne a comme p�re le Stage]
		Stage primaryStage = (Stage) btnListe.getScene().getWindow();
		// 2) Chargement de layout (design) depuis le fichier ListeStagiaires.fxml
		AnchorPane layoutListe = (AnchorPane)FXMLLoader.load(getClass().getResource("ListeStagiaires.fxml"));
		
		// 3) On cr�er une sc�ne
		Scene sceneList = new Scene(layoutListe,700,400);
		sceneList.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		// 4) On demande � notre stage(th�atre) d'affiche la nouvelle sc�ne : sceneList
		primaryStage.setScene(sceneList);
		
		
	}

	@FXML
	private void btnInscriptionHandler(Event e) {

		String nom = txtNom.getText(); // r�cup�rer le nom
		String email = txtEmail.getText(); // r�cup�rer l'email
		String phone = txtPhone.getText(); // r�cup�rer le phone

		RadioButton temp = (RadioButton) profil.getSelectedToggle();
		String profilStagiaire = temp.getText();

		String preferences = "";

		if (test.isSelected()) {
			preferences = preferences + "Test" + "\t";
		}
		if (gestion.isSelected()) {
			preferences = preferences + "Gestion" + "\t";
		}

		if (dev.isSelected()) {
			preferences = preferences + "Dev" + "\t";
		}
		String comment = txtCommentaire.getText();

		String maVille = pays.getValue();

		// Construction d'un Objet de type Stagiaire avec le constructeur avec
		// param�tres
		Stagiaire stagiaire = new Stagiaire(nom, email, phone, profilStagiaire, preferences, comment, maVille);
		// Ajouter cet objet Stagiaire dans la liste
		Main.stagiaires.add(stagiaire);

		/// d�but partie alert
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Inscription avec succ�s");
		alert.setHeaderText("Bienvenue � ISIKA");
		alert.setContentText("F�licitation, la session demarre en Septembre 2022");
		alert.showAndWait();
		/// fin partie alert*/

		System.out.println("******* Contenu de la liste *********");
		System.out.println(Main.stagiaires); // L'affichage du contenu de la liste
		
		reinitialisationFormulaire();

	}
	
	public void reinitialisationFormulaire() {
		/// R�-initialiser le formulaire
				//TextField
				txtNom.clear();
				txtEmail.clear();
				txtPhone.clear();
				//TextArea
				txtCommentaire.clear();
				// partie combox
				pays.valueProperty().set(null);
				// partie checkbox
				dev.setSelected(true);
				test.setSelected(false);
				gestion.setSelected(false);
				
				// partie Bouton Radio
				etudiant.setSelected(true);
				employe.setSelected(false);
	}

}
