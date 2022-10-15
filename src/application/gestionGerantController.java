package application;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class gestionGerantController {

	  @FXML
	    private CheckBox aj;

	    @FXML
	    private CheckBox mod;

	    @FXML
	    private Button re;

	    @FXML
	    private CheckBox rech;

	    @FXML
	    private CheckBox supp;
	    @FXML
	    private CheckBox af;

	    @FXML
	    void ajger(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             aj.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("ajoutgerant.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void modger(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             mod.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("modgerant.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void rechger(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
             rech.getScene().getWindow().hide();
             Parent rootA;
             rootA = FXMLLoader.load(getClass().getResource("rechger.fxml"));
             Scene scene = new Scene(rootA);
             logp.setScene(scene);
             logp.show();

	    }

	    @FXML
	    void retour(ActionEvent event) throws IOException {
	    	 Stage logp = new Stage();
	         re.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("interfaceAdmin.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }

	    @FXML
	    void suppger(ActionEvent event) throws IOException {
	    	Stage logp = new Stage();
	         supp.getScene().getWindow().hide();
	         Parent rootA;
	         rootA = FXMLLoader.load(getClass().getResource("suppger.fxml"));
	         Scene scene = new Scene(rootA);
	         logp.setScene(scene);
	         logp.show();

	    }
	    @FXML
	    void afger(ActionEvent event) throws IOException {
	    
	    	try {
	    		Class.forName("com.mysql.jdbc.Driver");
	    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
	    		Statement st=cnx.createStatement();
                String sql="Select * from gerant ";
	    		ResultSet rs = st.executeQuery(sql);
	    		if(rs.next()) {
                     Stage logp = new Stage();
	                 af.getScene().getWindow().hide();
	                 Parent rootA;
	                 rootA = FXMLLoader.load(getClass().getResource("affichger.fxml"));
	                 Scene scene = new Scene(rootA);
	                 logp.setScene(scene);
	                 logp.show();
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



