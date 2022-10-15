package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class modgerant implements Initializable{
	 @FXML
	    private Button affich;

	    @FXML
	    private TableColumn<gerant_commerciale, Integer> id;

	    @FXML
	    private TextField id1;

	    @FXML
	    private Button modif;

	    @FXML
	    private TableColumn<gerant_commerciale,String> nom;

	    @FXML
	    private TextField nom1;

	    @FXML
	    private TableColumn<gerant_commerciale, String> prenom;

	    @FXML
	    private TextField prenom1;

	    @FXML
	    private TableColumn<gerant_commerciale, Double> salaire;

	    @FXML
	    private TextField salaire1;

	    @FXML
	    private TableView<gerant_commerciale> table;
	    @FXML
	    public ObservableList<gerant_commerciale> data =FXCollections.observableArrayList();

	    @FXML
	    void affichger(ActionEvent event) {
	    	try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
				Statement st=cnx.createStatement();
		        String sql="Select * from gerant ";
				ResultSet rs = st.executeQuery(sql);
				System.out.println(rs);
				while(rs.next()) {
	               data.add(new gerant_commerciale(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
	             }
		   } catch (SQLException ex) {
	         } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		   show();
		   
		   

	    }

	    @FXML
	    void modifger(ActionEvent event) {
	    	try
	        {
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");

	            String value1=id1.getText();
	            String value2=nom1.getText();
	            String value3=prenom1.getText();
	            String value4=salaire1.getText();
	            Statement st=cnx.createStatement();
	            String sql1="Select * from gerant where id='"+id1.getText().toString()+"'";
	    		ResultSet rs1 = st.executeQuery(sql1);
	    		if (rs1.next()) {
	    			String sql = "UPDATE gerant set id= '"+value1+"',nom= '"+value2+"',prenom= '"+
	    	                value3+"',salaire= '"+value4+"' where id='"+value1+"' ";
	    	            PreparedStatement pst = cnx.prepareStatement(sql);
	    	            pst.execute();
	    	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                    alert.setHeaderText("smart_supermarket");
	                    alert.setContentText("gerant modifié avec succes !");
	                    alert.showAndWait();
	    		}
	    		else {
	    			 Alert alert = new Alert(Alert.AlertType.ERROR);
	                 alert.setHeaderText(null);
	                 alert.setContentText(" le gerant dont vous voulez modifier n'existe pas !");
	                 alert.showAndWait();
	    		}
	    } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	    }


public void show() {
	salaire.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, Double>("salaire"));
	   id.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, Integer>("id"));
	   nom.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, String>("nom"));
	   prenom.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, String>("prenom"));
	   table.setItems(data);
	
}
public void initialize(URL url, ResourceBundle resourceBundle) {
    //TDoo
    show();
}
}

