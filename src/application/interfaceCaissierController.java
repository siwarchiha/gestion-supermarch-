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

public class interfaceCaissierController {
	  @FXML
	    private CheckBox gercom;

	    @FXML
	    private CheckBox gerfact;

	    @FXML
	    void gercommande(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
	    	 gercom.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("gestionCommande.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void gerfacture(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
	    	 gerfact.getScene().getWindow().hide();
            Parent rootA;
            rootA = FXMLLoader.load(getClass().getResource("gestionFacture.fxml"));
            Scene scene = new Scene(rootA);
            logp.setScene(scene);
            logp.show();
	    }


}
