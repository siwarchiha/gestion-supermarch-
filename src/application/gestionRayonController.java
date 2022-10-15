package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class gestionRayonController{
	 @FXML
	    private CheckBox aff;

	    @FXML
	    private CheckBox aj;

	    @FXML
	    private CheckBox modif;

	    @FXML
	    private CheckBox rech;

	    @FXML
	    private CheckBox supp;

	    @FXML
	    void affProd(ActionEvent event)throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("affichRay.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void ajRay(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("ajoutRayon.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void modifRay(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         modif.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("modRayon.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void rechRay(ActionEvent event)throws IOException {
	    	Stage logp = new Stage();
	         rech.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("rechRay.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void suppRay(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         supp.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("suppRayon.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();


	    }

}
