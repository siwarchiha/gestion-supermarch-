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

public class affichmag {
	@FXML
    private Button aff;

    @FXML
    private TableColumn<magasinier, Integer> id;

    @FXML
    private TableColumn<magasinier, String> nom;

    @FXML
    private TableColumn<magasinier, String> prenom;

    @FXML
    private TableColumn<magasinier, Double> salaire;

    @FXML
    private TableView<magasinier> tble;
    @FXML
	public ObservableList<magasinier> data =FXCollections.observableArrayList();


    @FXML
    void affmag(ActionEvent event) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
			Statement st=cnx.createStatement();
	        String sql="Select * from magasinier ";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
               data.add(new magasinier(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
             }
	   } catch (SQLException ex) {
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	   salaire.setCellValueFactory(new PropertyValueFactory<magasinier, Double>("salaire"));
	   id.setCellValueFactory(new PropertyValueFactory<magasinier, Integer>("id"));
	   nom.setCellValueFactory(new PropertyValueFactory<magasinier, String>("nom"));
	   prenom.setCellValueFactory(new PropertyValueFactory<magasinier, String>("prenom"));
	   tble.setItems(data);
	   
	   
}

    }

