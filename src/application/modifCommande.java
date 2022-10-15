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

public class modifCommande {
	
	 @FXML
	    private Button affich;

	    @FXML
	    private TableColumn<commande, Integer> id;

	    @FXML
	    private TextField id1;

	    @FXML
	    private Button modif;

	    @FXML
	    private TableColumn<commande,String > nom_produit;

	    @FXML
	    private TextField nom_produit1;

	    @FXML
	    private TableColumn<commande, Integer> qtecom;

	    @FXML
	    private TextField qtecom1;

	    @FXML
	    private TableColumn<commande, Integer> ref_produit;

	    @FXML
	    private TextField ref_produit1;

	    @FXML
	    private TableView<commande> table;

	    @FXML
	    private TableColumn<commande, Double> total;

	    @FXML
	    private TextField total1;
	    @FXML
	    public ObservableList<commande> data =FXCollections.observableArrayList();

	    @FXML
	    void affichcom(ActionEvent event) {
	    	try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
				Statement st=cnx.createStatement();
		        String sql="Select * from commande ";
				ResultSet rs = st.executeQuery(sql);
				System.out.println(rs);
				while(rs.next()) {
	               data.add(new commande(rs.getInt(1),rs.getString(2),rs.getInt(4),rs.getInt(4),rs.getFloat(5)));
	             }
		   } catch (SQLException ex) {
	         } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
		   ref_produit.setCellValueFactory(new PropertyValueFactory<commande, Integer>("ref_produit"));
		   id.setCellValueFactory(new PropertyValueFactory<commande, Integer>("id"));
		   qtecom.setCellValueFactory(new PropertyValueFactory<commande, Integer>("qtecom"));
		   total.setCellValueFactory(new PropertyValueFactory<commande, Double>("total"));
		   nom_produit.setCellValueFactory(new PropertyValueFactory<commande, String>("nom_produit"));
           table.setItems(data);

	    }

	    @FXML
	    void modifcom(ActionEvent event) {
	    	
	    	try
	        {
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");

	            String value1=id1.getText();
	            String value2=nom_produit1.getText();
	            String value3=ref_produit1.getText();
	            String value4=qtecom1.getText();
	            String value5=total1.getText();
	            Statement st=cnx.createStatement();
	            String sql1="Select * from commande where id='"+id1.getText().toString()+"'";
	    		ResultSet rs1 = st.executeQuery(sql1);
	    		if (rs1.next()) {
	    			String sql = "UPDATE commande set id= '"+value1+"',nom_produit1= '"+value2+"',ref_produit1= '"+
	    	                value3+"',qtecom1= '"+value4+"',total1= '"+value5+"' where id='"+value1+"' ";
	    	            PreparedStatement pst = cnx.prepareStatement(sql);
	    	            pst.execute();
	    	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	                    alert.setHeaderText("smart_supermarket");
	                    alert.setContentText("commande modifié avec succes !");
	                    alert.showAndWait();
	    		}
	    		else {
	    			 Alert alert = new Alert(Alert.AlertType.ERROR);
	                 alert.setHeaderText(null);
	                 alert.setContentText(" la commande dont vous voulez modifier n'existe pas !");
	                 alert.showAndWait();
	    		}
	    } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }



	    }
}
