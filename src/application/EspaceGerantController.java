package application;

import java.io.IOException;

import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;

	

public class EspaceGerantController {
	 @FXML
	    private CheckBox gc;

	    @FXML
	    private CheckBox gf;

	    @FXML
	    private CheckBox ggs;

	    @FXML
	    private CheckBox gm;

	    @FXML
	    private CheckBox gp;

	    @FXML
	    private CheckBox gr;

	    @FXML
	    void Produit(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         gp.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("interfaceMagasinier.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }

	    @FXML
	    void Rayon(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         gr.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("gestionRayon.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }
	    @FXML
	    void caissier(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         gc.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("gestionCaissier.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }
	

	    @FXML
	    void fournisseur(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         gf.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("GestionFournisseur.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }

	    @FXML
	    void gestionnaire(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         ggs.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("gestionGestionnaireDeStock.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }

	    @FXML
	    void magazinier(ActionEvent event) throws IOException {
	    	 Stage gpat = new Stage();
	         gm.getScene().getWindow().hide();
	         Parent root1;
	         root1 = FXMLLoader.load(getClass().getResource("gestionMagasinier.fxml"));
	         Scene scene = new Scene(root1);
	         gpat.setScene(scene);
	         gpat.show();

	    }

	}





