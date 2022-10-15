package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class suppgest {
	 @FXML
	    private TextField id;

	    @FXML
	    private Button supp;

	    @FXML
	    void suppgest(ActionEvent event) {
	    	
	    	if(id.getText().isEmpty())
	    	{
	    		 Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                alert.setHeaderText("smart supermarket");
	                alert.setContentText("\"choisissez le gestionnaire a supprimer\" !");
	                alert.showAndWait();

	    		}
	    	else {
	    		try {
	    			PreparedStatement pst;
	    			Class.forName("com.mysql.jdbc.Driver");
					Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
					pst = cnx.prepareStatement("DELETE FROM gestionnaire WHERE id="+id.getText());
	    			pst.executeUpdate("DELETE FROM gestionnaire WHERE id="+id.getText());
		            System.out.println("gestionnaire supprimé avec succés !");
		            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("smart_supermarket");
                    alert.setContentText("gestionnaire supprimé avec succes !");
                    alert.showAndWait();
	    		} catch(Exception e) {
	    			e.printStackTrace();
	    		}
	    	}

	    }

}
