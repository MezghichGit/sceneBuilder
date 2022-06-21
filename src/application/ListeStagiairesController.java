package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListeStagiairesController implements Initializable{
	
		@FXML
	    private TableColumn<Stagiaire, String> nomC;
		
		@FXML
	    private TableColumn<Stagiaire, String> emailC;
		
		@FXML
	    private TableColumn<Stagiaire, String> phoneC;
		
		@FXML
	    private TableColumn<Stagiaire, String> commentaireC;
		
		@FXML
	    private TableColumn<Stagiaire, String> villeC;
		

	    @FXML
	    private TableView<Stagiaire> tblStagiaires;


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			nomC.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("nom"));
			emailC.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("email"));
			phoneC.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("phone"));
			commentaireC.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("commentaire"));
			villeC.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("ville"));
			
			
			//Charger le TableView par Observable List qui contient nos objets Produits
			tblStagiaires.setItems(Main.stagiaires);
			
		}

}
