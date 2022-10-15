package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class rechger {
	 @FXML
	    private Button cherch;

	    @FXML
	    private TextField id;

	    @FXML
	    void cherchger(ActionEvent event) {
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
	    		Statement st=cnx.createStatement();
	    		String sql="Select * from gerant where id='"+id.getText().toString()+"'";
	    		ResultSet rs = st.executeQuery(sql);
	    		if(rs.next()) {
	    			
	    			 System.out.println("gerant trouvé");
	    			 System.out.println(rs.getInt("id") + rs.getString("nom") + rs.getString("prenom") + rs.getDouble("salaire") );
	                 
	                 /*Stage logp = new Stage();
	                 cherch.getScene().getWindow().hide();
	                 Parent rootA;
	                 rootA = FXMLLoader.load(getClass().getResource("interfaceMagasinier.fxml"));
	                 Scene scene = new Scene(rootA);
	                 logp.setScene(scene);
	                 logp.show();*/
	    		}
	    		 else
	             {
	                 Alert alert = new Alert(Alert.AlertType.ERROR);
	                 alert.setHeaderText(null);
	                 alert.setContentText("le gerant entre n'existe pas !");
	                 alert.showAndWait();
	             }
	             
	         } catch (SQLException ex) {
	         } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	}

	    }
