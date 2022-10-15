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
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class modcaiss {
	@FXML
    private Button modif;
	@FXML
    private Button affich;

    @FXML
    private TextField id1;

    @FXML
    private TextField nom1;

    @FXML
    private TextField num_caisse1;

    @FXML
    private TextField prenom1;

    @FXML
    private TextField salaire1;
    @FXML
    private TableView<caissier> table;
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
    public ObservableList<caissier> data =FXCollections.observableArrayList();
    @FXML
    void affichcaiss(ActionEvent event) {
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

		   table.setItems(data);
		   
		   
	}

    @FXML
    void modifcaiss(ActionEvent event) {
        try
        {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");

            String value1=id1.getText();
            String value2=nom1.getText();
            String value3=prenom1.getText();
            String value4=salaire1.getText();
            String value5=num_caisse1.getText();
            Statement st=cnx.createStatement();
            String sql1="Select * from caissier where id='"+id1.getText().toString()+"'";
    		ResultSet rs1 = st.executeQuery(sql1);
    		if (rs1.next()) {
    			String sql = "UPDATE caissier set id= '"+value1+"',nom= '"+value2+"',prenom= '"+
    	                value3+"',salaire= '"+value4+"',num_caisse= '"+value5+"' where id='"+value1+"' ";
    	            PreparedStatement pst = cnx.prepareStatement(sql);
    	            pst.execute();
    	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("smart_supermarket");
                    alert.setContentText("caissier modifié avec succes !");
                    alert.showAndWait();
    		}
    		else {
    			 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText(" le caissier dont vous voulez modifier n'existe pas !");
                 alert.showAndWait();
    		}
    } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

	
	}
	   

