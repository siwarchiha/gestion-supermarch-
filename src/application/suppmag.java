package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class suppmag {
	  @FXML
	    private TextField id;

	    @FXML
	    private Button supp;

	    @FXML
	    void suppmag(ActionEvent event) {

	    	if(id.getText().isEmpty())
	    	{
	    		 Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                alert.setHeaderText("smart supermarket");
	                alert.setContentText("\"choisissez le magasinier a supprimer\" !");
	                alert.showAndWait();

	    		}
	    	else {
	    		try {
	    			PreparedStatement pst;
	    			Class.forName("com.mysql.jdbc.Driver");
					Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
					pst = cnx.prepareStatement("DELETE FROM magasinier WHERE id="+id.getText());
	    			pst.executeUpdate("DELETE FROM magasinier WHERE id="+id.getText());
		            System.out.println("magasinier supprimé avec succés !");
	    			
	    		} catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}

	    }


	    }



