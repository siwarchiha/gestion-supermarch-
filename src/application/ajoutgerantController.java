package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ajoutgerantController {

    @FXML
    private Button btnenr;

    @FXML
    private TextField id;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    private TextField salaire;

    @FXML
    void enrgerant(ActionEvent event) {
    	
    	 PreparedStatement pst;
         String requete="INSERT INTO gerant (id, nom , prenom , salaire )"
                 + " VALUES ('"+id.getText()+"','"+nom.getText()+"','"+prenom.getText()+"','"+salaire.getText()+"');";                              
         
         try
         {
        	Class.forName("com.mysql.jdbc.Driver");
 			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
            pst = cnx.prepareStatement(requete);
             pst.executeUpdate(requete);
             System.out.println("gerant ajouté avec succés !");
             
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
                 alert.setHeaderText("smart supermarket");
                 alert.setContentText("gerant ajouté avec succés !");
                 alert.showAndWait();
         } catch (SQLException | ClassNotFoundException ex) {
             System.out.println("Erreur d'ajout !");
         }
         
         
     

    		
    }}




