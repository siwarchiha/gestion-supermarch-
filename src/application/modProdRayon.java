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

public class modProdRayon {  

    @FXML
    private Button affich;

    @FXML
    private TableColumn<produit_dans_rayon, String> categorie;

    @FXML
    private TextField categorie1;

    @FXML
    private TableColumn<produit_dans_rayon, String> marque;

    @FXML
    private TextField marque1;

    @FXML
    private Button modif;

    @FXML
    private TextField nom1;

    @FXML
    private TableColumn<produit_dans_rayon, String> nom_produit;

    @FXML
    private TableColumn<produit_dans_rayon, Integer> num_rayon;

    @FXML
    private TextField num_rayon1;

    @FXML
    private TableColumn<produit_dans_rayon, Double> prix;

    @FXML
    private TextField prix1;

    @FXML
    private TableColumn<produit_dans_rayon, Integer> ref;

    @FXML
    private TextField ref1;

    @FXML
    private TableView<produit_dans_rayon> table;
    @FXML
	public ObservableList<produit_dans_rayon> data =FXCollections.observableArrayList();

    @FXML
    void affichprod(ActionEvent event) {
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
			Statement st=cnx.createStatement();
	        String sql="Select * from produit_dans_rayon ";
			ResultSet rs = st.executeQuery(sql);
			System.out.println(rs);
			while(rs.next()) {
               data.add(new produit_dans_rayon(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));
             }
	   } catch (SQLException ex) {
         } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
 	   ref.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Integer>("ref"));
	   prix.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Double>("prix"));
	   nom_produit.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("nom_produit"));
	   categorie.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("categorie"));
	   marque.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, String>("marque"));
	   num_rayon.setCellValueFactory(new PropertyValueFactory<produit_dans_rayon, Integer>("num_rayon"));
	   table.setItems(data);
	   System.out.println(data);
	   

    }

    @FXML
    void modifprod(ActionEvent event) {
    	
    	try
        {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");

            String value1=ref1.getText();
            String value2=nom1.getText();
            String value3=categorie1.getText();
            String value4=marque1.getText();
            String value5=prix1.getText();
            String value6=num_rayon1.getText();
            Statement st=cnx.createStatement();
            String sql1="Select * from produit_dans_rayon where ref='"+ref1.getText().toString()+"'";
    		ResultSet rs1 = st.executeQuery(sql1);
    		if (rs1.next()) {
    			String sql = "UPDATE produit_dans_rayon set ref= '"+value1+"',nom_produit= '"+value2+"',categorie= '"+
    	                value3+"',marque= '"+value4+"', prix= '"+value5+"',num_rayon= '"+value6+"' where ref='"+value1+"' ";
    	            PreparedStatement pst = cnx.prepareStatement(sql);
    	            pst.execute();
    	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("smart_supermarket");
                    alert.setContentText("produit modifié avec succes !");
                    alert.showAndWait();
    		}
    		else {
    			 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText(" le produit dont vous voulez modifier n'existe pas !");
                 alert.showAndWait();
    		}
    } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
