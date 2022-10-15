package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class interfaceMagasinierController {
	 @FXML
	    private Button re;
	 @FXML
	    private CheckBox aff;

	    @FXML
	    private CheckBox aj;

	    @FXML
	    private CheckBox mod;

	    @FXML
	    private CheckBox rech;

	    @FXML
	    private CheckBox supp;

	    @FXML
	    void affprod(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("affichProdRay.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void ajprod(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("ajoutProdRayon.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();
	    }

	    @FXML
	    void modprod(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         mod.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("modProdRayon.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void rechprod(ActionEvent event)throws IOException {
	    	Stage logp = new Stage();
	         rech.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("rechprod.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void suppprod(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         supp.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("suppProdRayon.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }
	    @FXML
	    void retour(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
	         re.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("interfaceMagasinier.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }


}
