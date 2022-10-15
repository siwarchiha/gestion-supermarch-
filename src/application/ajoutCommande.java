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

public class ajoutCommande {
	@FXML
    private Button btnenr;

    @FXML
    private TextField id;

    @FXML
    private TextField nom_produit;

    @FXML
    private TextField qtecom;

    @FXML
    private TextField ref_produit;

    @FXML
    private TextField total;

    @FXML
    void enrcom(ActionEvent event) {
    	
    	PreparedStatement pst;
        String requete="INSERT INTO commande (id, nom_produit , ref_produit , qtecom , total )"
                + " VALUES ('"+id.getText()+"','"+nom_produit.getText()+"','"+ref_produit.getText()+"','"+qtecom.getText()+"','"+total.getText()+"');";                               
        
        try
        {
       	Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
           pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("commande ajouté avec succés !");
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("smart supermarket");
                alert.setContentText("commande ajouté avec succés !");
                alert.showAndWait();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erreur d'ajout !");
        }
        

    }

}
