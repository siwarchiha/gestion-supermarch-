package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class welcomeController {

    @FXML
    private Button btnadm;

    @FXML
    private Button btnemp;

    @FXML
    void conn(ActionEvent event) throws IOException{
    		   
            Stage gpat = new Stage();
            btnadm.getScene().getWindow().hide();
            Parent root1;
            root1 = FXMLLoader.load(getClass().getResource("LoginAdmin.fxml"));
            Scene scene = new Scene(root1);
            gpat.setScene(scene);
            gpat.show();
        

    }

    @FXML
    void open_emp(ActionEvent event) throws IOException{
 		   
            Stage gt = new Stage();
            btnemp.getScene().getWindow().hide();
            Parent root2;
            root2 = FXMLLoader.load(getClass().getResource("userInterface.fxml"));
            Scene scene = new Scene(root2);
            gt.setScene(scene);
            gt.show();

    }

}
