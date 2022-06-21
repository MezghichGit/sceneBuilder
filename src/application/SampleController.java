package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController implements Initializable {

	@FXML // @FXML = C'est une annotation, c'est une méta-donnée sur un objet
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
	private CheckBox dev;

	@FXML
	private CheckBox test;
	@FXML
	private CheckBox gestion;

	@FXML
	public ComboBox<String> pays = new ComboBox<>();

	@Override // redefinition de la méthode se trouvant dans l'interface
	public void initialize(URL arg0, ResourceBundle arg1) {
		pays.getItems().addAll("Paris", "Lyon", "Marseille", "Lille", "Toulon");
	}

	@FXML
	private void btnInscriptionHandler(Event e) {

		String nom = txtNom.getText(); // récupérer le nom
		String email = txtEmail.getText(); // récupérer l'email
		String phone = txtPhone.getText(); // récupérer le phone

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
		// paramètres
		Stagiaire stagiaire = new Stagiaire(nom, email, phone, profilStagiaire, preferences, comment, maVille);
		// Ajouter cet objet Stagiaire dans la liste
		Main.stagiaires.add(stagiaire);

		/// début partie alert
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Inscription avec succès");
		alert.setHeaderText("Bienvenue à ISIKA");
		alert.setContentText("Félicitation, la session demarre en Septembre 2022");
		alert.showAndWait();
		/// fin partie alert*/

		System.out.println("******* Contenu de la liste *********");
		System.out.println(Main.stagiaires); // L'affichage du contenu de la liste

	}

}
