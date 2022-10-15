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

public class gestionCaissierController {

    @FXML
    private CheckBox aff;
	 @FXML
	    private CheckBox aj;

	    @FXML
	    private CheckBox mod;

	    @FXML
	    private Button re;

	    @FXML
	    private CheckBox rech;

	    @FXML
	    private CheckBox supp;

	    @FXML
	    void ajcaiss(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("ajoutcaiss.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void modcaiss(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         mod.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("modcaiss.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void rechcaiss(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         rech.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("rechcaiss.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }
	    @FXML
	    void retour(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
	         re.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("interfaceAdmin.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }
	    @FXML
	    void suppcaiss(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         supp.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("suppcaiss.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }
	    @FXML
	    void affcaiss(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         aff.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("affichcaiss.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

}
