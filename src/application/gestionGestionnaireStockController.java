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

public class gestionGestionnaireStockController {
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
    void ajgest(ActionEvent event) throws IOException {
   	 Stage logp = new Stage();
     aj.getScene().getWindow().hide();
     Parent rootA;
     rootA = FXMLLoader.load(getClass().getResource("ajoutgest.fxml"));
     Scene scene = new Scene(rootA);
     logp.setScene(scene);
     logp.show();

}

    @FXML
    void modgest(ActionEvent event)throws IOException {
       	    Stage logp = new Stage();
            mod.getScene().getWindow().hide();
            Parent rootA;
            rootA = FXMLLoader.load(getClass().getResource("modgest.fxml"));
            Scene scene = new Scene(rootA);
            logp.setScene(scene);
            logp.show();

    }

    @FXML
    void rechgest(ActionEvent event) throws IOException {
    	 Stage logp = new Stage();
         rech.getScene().getWindow().hide();
         Parent rootA;
         rootA = FXMLLoader.load(getClass().getResource("rechgest.fxml"));
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
    void suppgest(ActionEvent event)throws IOException {
    	Stage logp = new Stage();
        supp.getScene().getWindow().hide();
        Parent rootA;
        rootA = FXMLLoader.load(getClass().getResource("suppgest.fxml"));
        Scene scene = new Scene(rootA);
        logp.setScene(scene);
        logp.show();

   }
    @FXML
    void affgest(ActionEvent event) throws IOException {
    	Stage logp = new Stage();
        aff.getScene().getWindow().hide();
        Parent rootA;
        rootA = FXMLLoader.load(getClass().getResource("affichgest.fxml"));
        Scene scene = new Scene(rootA);
        logp.setScene(scene);
        logp.show();

    }


}
