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

public class gestionCommandeController {

    @FXML
    private CheckBox aff;

    @FXML
    private CheckBox aj;

    @FXML
    private CheckBox mod;

    @FXML
    private CheckBox supp;

    @FXML
    void affCom(ActionEvent event) throws IOException {
    	 Stage logp = new Stage();
         aff.getScene().getWindow().hide();
         Parent rootA;
         rootA = FXMLLoader.load(getClass().getResource("affichCommande.fxml"));
         Scene scene = new Scene(rootA);
         logp.setScene(scene);
         logp.show();

    }

    @FXML
    void ajCom(ActionEvent event) throws IOException {
   	 Stage logp = new Stage();
     aj.getScene().getWindow().hide();
     Parent rootA;
     rootA = FXMLLoader.load(getClass().getResource("ajoutCommande.fxml"));
     Scene scene = new Scene(rootA);
     logp.setScene(scene);
     logp.show();

    	

    }

    @FXML
    void modCom(ActionEvent event) throws IOException {
    	Stage logp = new Stage();
        mod.getScene().getWindow().hide();
        Parent rootA;
        rootA = FXMLLoader.load(getClass().getResource("modifCommande.fxml"));
        Scene scene = new Scene(rootA);
        logp.setScene(scene);
        logp.show();

    }

    @FXML
    void suppCom(ActionEvent event) throws IOException {
   	 Stage logp = new Stage();
     supp.getScene().getWindow().hide();
     Parent rootA;
     rootA = FXMLLoader.load(getClass().getResource("suppCommande.fxml"));
     Scene scene = new Scene(rootA);
     logp.setScene(scene);
     logp.show();
    	

    }

	}


