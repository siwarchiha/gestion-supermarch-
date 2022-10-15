package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class affichcaiss {
	 @FXML
	    private Button aff;

	 @FXML
	    private TableColumn<caissier, Integer> id;

	    @FXML
	    private TableColumn<caissier, String> nom;

	    @FXML
	    private TableColumn<caissier, String> prenom;

	    @FXML
	    private TableColumn<caissier, Double> salaire;
	    @FXML
	    private TableColumn<caissier, Integer> num_caisse;

	    @FXML
	    private TableView<caissier> tble;
	    @FXML
		public ObservableList<caissier> data =FXCollections.observableArrayList();
	    @FXML
	    void affcaiss(ActionEvent event) {
	    	
	    	try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
				Statement st=cnx.createStatement();
		        String sql="Select * from caissier ";
				ResultSet rs = st.executeQuery(sql);
				System.out.println(rs);
				while(rs.next()) {
	               data.add(new caissier(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4), rs.getInt(5)));
	             }
		   } catch (SQLException ex) {
	         } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		   salaire.setCellValueFactory(new PropertyValueFactory<caissier, Double>("salaire"));
		   id.setCellValueFactory(new PropertyValueFactory<caissier, Integer>("id"));
		   nom.setCellValueFactory(new PropertyValueFactory<caissier, String>("nom"));
		   prenom.setCellValueFactory(new PropertyValueFactory<caissier, String>("prenom"));
		   num_caisse.setCellValueFactory(new PropertyValueFactory<caissier, Integer>("num_caisse"));

		   tble.setItems(data);
		   
		   
	}

	    }


