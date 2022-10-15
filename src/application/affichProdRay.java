package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class affichProdRay {

	 @FXML
	    private TableColumn<produit_dans_rayon, Integer> ref;

	 
    @FXML
    private Button aff;

    @FXML
    private TableColumn<produit_dans_rayon, String> categorie;

    @FXML
    private TableColumn<produit_dans_rayon, String> marque;

    @FXML
    private TableColumn<produit_dans_rayon, String> nom_produit;

    @FXML
    private TableColumn<produit_dans_rayon, Integer> num_rayon;

    @FXML
    private TableColumn<produit_dans_rayon, Double> prix;

   
    @FXML
    private TableView<produit_dans_rayon> tble;
    @FXML
	public ObservableList<produit_dans_rayon> data =FXCollections.observableArrayList();

    @FXML
    void affProd(ActionEvent event) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
			Statement st=cnx.createStatement();
	        String sql="Select * from produit_dans_rayon ";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
               data.add(new produit_dans_rayon(rs.getInt(1) , rs.getString(2),rs.getString(3),rs.getString(4), rs.getDouble(5), rs.getInt(6)));
             }
	   } catch (SQLException ex) {
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
    	System.out.println(data);
 	   ref.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Integer>("ref"));
	   prix.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Double>("prix"));
	   nom_produit.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("nom_produit"));
	   categorie.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("categorie"));
	   marque.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("marque"));
	   num_rayon.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Integer>("num_rayon"));

	   tble.setItems(data);
	   
	   
}
  

    }
