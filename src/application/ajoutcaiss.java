package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ajoutcaiss {
	@FXML
    private Button btnenr;

    @FXML
    private TextField id;

    @FXML
    private TextField nom;

    @FXML
    private TextField num_caisse;

    @FXML
    private TextField prenom;

    @FXML
    private TextField salaire;

    @FXML
    void enrcaiss(ActionEvent event) {
    	PreparedStatement pst;
        String requete="INSERT INTO caissier (id, nom , prenom , salaire , num_caisse )"
                + " VALUES ('"+id.getText()+"','"+nom.getText()+"','"+prenom.getText()+"','"+salaire.getText()+"','"+num_caisse.getText()+"');";                               
        
        try
        {
       	Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
           pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("caissier ajouté avec succés !");
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("smart supermarket");
                alert.setContentText("caissier ajouté avec succés !");
                alert.showAndWait();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erreur d'ajout !");
        }
        

   }


    }


