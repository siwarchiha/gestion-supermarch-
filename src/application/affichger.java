package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.swing.table.DefaultTableModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class affichger implements Initializable{
	@FXML
    private Button aff;
	  @FXML
	   private TableView<gerant_commerciale> tble;
	   @FXML
	   private TableColumn<gerant_commerciale,Integer> id;
	   @FXML
	   private TableColumn<gerant_commerciale,String> nom;
	   @FXML
	   private TableColumn<gerant_commerciale,String> prenom;
	   @FXML
	   private TableColumn<gerant_commerciale,Double> salaire;
	   @FXML
		public ObservableList<gerant_commerciale> data =FXCollections.observableArrayList();
	    @FXML
	    void affger(ActionEvent event) {
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
		   salaire.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, Double>("salaire"));
		   id.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, Integer>("id"));
		   nom.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, String>("nom"));
		   prenom.setCellValueFactory(new PropertyValueFactory<gerant_commerciale, String>("prenom"));
		   tble.setItems(data);
		   
		   
}
	   @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}



	
	
       
}




