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

public class interfaceAdminController {
    @FXML
    private CheckBox chcaiss;

    @FXML
    private CheckBox chger;

    @FXML
    private CheckBox chgest;

    @FXML
    private CheckBox chmag;

    @FXML
    void gestcaiss(ActionEvent event) throws IOException{
    Stage gpat = new Stage();
    chcaiss.getScene().getWindow().hide();
    Parent root1;
    root1 = FXMLLoader.load(getClass().getResource("gestionCaissier.fxml"));
    Scene scene = new Scene(root1);
    gpat.setScene(scene);
    gpat.show();
    }
    @FXML
    void gestger(ActionEvent event) throws IOException{
		   
        Stage gpat = new Stage();
        chger.getScene().getWindow().hide();
        Parent root1;
        root1 = FXMLLoader.load(getClass().getResource("gestionGerant.fxml"));
        Scene scene = new Scene(root1);
        gpat.setScene(scene);
        gpat.show();

    }

    @FXML
    void gestgest(ActionEvent event) throws IOException{
		   
        Stage gpat = new Stage();
        chgest.getScene().getWindow().hide();
        Parent root1;
        root1 = FXMLLoader.load(getClass().getResource("gestionGestionnaireDeStock.fxml"));
        Scene scene = new Scene(root1);
        gpat.setScene(scene);
        gpat.show();

    }

    @FXML
    void gestmag(ActionEvent event) throws IOException{
		   
        Stage gpat = new Stage();
        chmag.getScene().getWindow().hide();
        Parent root1;
        root1 = FXMLLoader.load(getClass().getResource("gestionMagasinier.fxml"));
        Scene scene = new Scene(root1);
        gpat.setScene(scene);
        gpat.show();

    }

}
