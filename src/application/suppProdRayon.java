package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class suppProdRayon {

    @FXML
    private TextField ref;

    @FXML
    private Button supp;

    @FXML
    void suppProd(ActionEvent event) {
	    	if(ref.getText().isEmpty())
	    	{
	    		    Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                alert.setHeaderText("smart supermarket");
	                alert.setContentText("\"choisissez le produit a supprimer\" !");
	                alert.showAndWait();

	    	}
	    	else {
	    		try {
	    			PreparedStatement pst;
	    			Class.forName("com.mysql.jdbc.Driver");
					Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
					pst = cnx.prepareStatement("DELETE FROM produit_dans_rayon WHERE ref="+ref.getText());
	    			pst.executeUpdate("DELETE FROM produit_dans_rayon WHERE ref="+ref.getText());
		            System.out.println("produit supprimé avec succés !");

		    		 Alert alert = new Alert(Alert.AlertType.INFORMATION);
		                alert.setHeaderText("smart supermarket");
		                alert.setContentText("produit supprimé avec succes!");
		                alert.showAndWait();
	    			
	    		} catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}


	    }

}
