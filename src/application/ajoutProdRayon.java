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

public class ajoutProdRayon {

    @FXML
    private Button btnenr;

    @FXML
    private TextField categorie;

    @FXML
    private TextField marque;

    @FXML
    private TextField nom_produit;

    @FXML
    private TextField num_rayon;

    @FXML
    private TextField prix;

    @FXML
    private TextField ref;

    @FXML
    void enrprod(ActionEvent event) {
	PreparedStatement pst;
    String requete="INSERT INTO produit_dans_rayon (ref, nom_produit , categorie , marque , prix ,num_rayon )"
            + " VALUES ('"+ref.getText()+"','"+nom_produit.getText()+"','"+categorie.getText()+"','"+marque.getText()+"','"+prix.getText()+"','"+num_rayon.getText()+"');";                              
    
    try
    {
   	Class.forName("com.mysql.jdbc.Driver");
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
       pst = cnx.prepareStatement(requete);
        pst.executeUpdate(requete);
        System.out.println("produit ajouté avec succés dans le rayon !");
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("smart supermarket");
            alert.setContentText("produit ajouté avec succés dans le rayon !");
            alert.showAndWait();
    } catch (SQLException | ClassNotFoundException ex) {
        System.out.println("Erreur d'ajout !");
    }
    

}
}
