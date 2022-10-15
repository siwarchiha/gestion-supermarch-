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

public class affichgest {

    @FXML
    private Button aff;

    @FXML
    private TableColumn<gestionnaire_stock, Integer> id;

    @FXML
    private TableColumn<gestionnaire_stock,String> nom;

    @FXML
    private TableColumn<gestionnaire_stock, String> prenom;

    @FXML
    private TableColumn<gestionnaire_stock, Double> salaire;

    @FXML
    private TableView<gestionnaire_stock> tble;
    @FXML
	public ObservableList<gestionnaire_stock> data =FXCollections.observableArrayList();
    @FXML
    void affgest(ActionEvent event) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
			Statement st=cnx.createStatement();
	        String sql="Select * from gestionnaire ";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
               data.add(new gestionnaire_stock(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
             }
	   } catch (SQLException ex) {
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	   salaire.setCellValueFactory(new PropertyValueFactory<gestionnaire_stock, Double>("salaire"));
	   id.setCellValueFactory(new PropertyValueFactory<gestionnaire_stock, Integer>("id"));
	   nom.setCellValueFactory(new PropertyValueFactory<gestionnaire_stock, String>("nom"));
	   prenom.setCellValueFactory(new PropertyValueFactory<gestionnaire_stock, String>("prenom"));
	   tble.setItems(data);
	   
	   
}

    }

