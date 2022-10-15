package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class userInterfaceController { 
	@FXML
    private CheckBox chcaiss;

    @FXML
    private CheckBox chgerant;

    @FXML
    private CheckBox chgest;

    @FXML
    private CheckBox chmag;

    @FXML
    void concaiss(ActionEvent event)throws IOException{
		   
        Stage t = new Stage();
        chcaiss.getScene().getWindow().hide();
        Parent root1;
        root1 = FXMLLoader.load(getClass().getResource("LoginCaissier.fxml"));
        Scene scene = new Scene(root1);
        t.setScene(scene);
        t.show();

    }

    @FXML
    void congerant(ActionEvent event)throws IOException{
		   
        Stage gtt = new Stage();
        chgerant.getScene().getWindow().hide();
        Parent root2;
        root2 = FXMLLoader.load(getClass().getResource("LoginGerant.fxml"));
        Scene scene = new Scene(root2);
        gtt.setScene(scene);
        gtt.show();}

    @FXML
    void congest(ActionEvent event) throws IOException{
		   
        Stage gpt = new Stage();
        chgest.getScene().getWindow().hide();
        Parent root3;
        root3 = FXMLLoader.load(getClass().getResource("LoginGestionnaire.fxml"));
        Scene scene = new Scene(root3);
        gpt.setScene(scene);
        gpt.show();

    }

    @FXML
    void conmag(ActionEvent event) throws IOException{
		   
        Stage gp = new Stage();
        chmag.getScene().getWindow().hide();
        Parent root4;
        root4 = FXMLLoader.load(getClass().getResource("LoginMagasinier.fxml"));
        Scene scene = new Scene(root4);
        gp.setScene(scene);
        gp.show();

    }


}
