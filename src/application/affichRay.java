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

public class affichRay {
	@FXML
    private Button aff;

    @FXML
    private TableColumn<rayon, Integer> id_rayon;

    @FXML
    private TableColumn<rayon, String> categorie;

    @FXML
    private TableColumn<rayon, Integer> nb_etage;

    @FXML
    private TableView<rayon> tble;
    @FXML
	public ObservableList<rayon> data =FXCollections.observableArrayList();

    @FXML
    void affRay(ActionEvent event) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
			Statement st=cnx.createStatement();
	        String sql="Select * from rayon ";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
               data.add(new rayon(rs.getInt(1) , rs.getString(2),rs.getInt(3)));
             }
	   } catch (SQLException ex) {
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	System.out.println(data);
 	   id_rayon.setCellValueFactory(new PropertyValueFactory<rayon, Integer>("id_rayon"));
	   categorie.setCellValueFactory(new PropertyValueFactory<rayon, String>("categorie"));
	   nb_etage.setCellValueFactory(new PropertyValueFactory<rayon, Integer>("nb_etage"));

	   tble.setItems(data);
	   
	   
}

    }

