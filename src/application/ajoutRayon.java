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

public class ajoutRayon {
	
	 @FXML
	    private Button btnenr;

	    @FXML
	    private TextField categorie;

	    @FXML
	    private TextField id_rayon;

	    @FXML
	    private TextField nb_etage;

	    @FXML
	    void enrRay(ActionEvent event) {
	    	PreparedStatement pst;
	        String requete="INSERT INTO rayon (id_rayon , categorie , nb_etage )"
	                + " VALUES ('"+id_rayon.getText()+"','"+categorie.getText()+"','"+nb_etage.getText()+"');";                               
	        
	        try
	        {
	       	Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
	           pst = cnx.prepareStatement(requete);
	            pst.executeUpdate(requete);
	            System.out.println("rayon ajoute avec succés !");
	            
	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                alert.setHeaderText("smart supermarket");
	                alert.setContentText("rayon ajouté avec succés !");
	                alert.showAndWait();
	        } catch (SQLException | ClassNotFoundException ex) {
	            System.out.println("Erreur d'ajout !");
	        }
	        

	   }


	    }



