package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

//import DBConn.Cnx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController  {
	@FXML
	private Button btncaissier;
	
	@FXML
    private Button btngestionnaire;

	@FXML
	private Button btnmagasinier;
	@FXML
    private Button btngerant;

    @FXML
    private Button btnAdmin;

    @FXML
    private TextField login;

    @FXML
    private PasswordField pswd;
    @FXML
    void conn(ActionEvent event) {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
    		Statement st=cnx.createStatement();
    		String sql="Select * from adminaccess where username='"+login.getText()+"' and password='"+pswd.getText().toString()+"'";
    		ResultSet rs = st.executeQuery(sql);
    		if(rs.next()) {
    			
    			 System.out.println("Connexion Admin avec succÃ©s");
                 
                 Stage logp = new Stage();
                 btnAdmin.getScene().getWindow().hide();
                 Parent rootA;
                 rootA = FXMLLoader.load(getClass().getResource("interfaceAdmin.fxml"));
                 Scene scene = new Scene(rootA);
                 logp.setScene(scene);
                 logp.show();
    		}
    		 else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText("Veuillez vÃ©rifier votre Identifiant et votre Mot de passe !");
                 alert.showAndWait();
             }
             
         } catch (SQLException ex) {
         } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
    }
    @FXML
    void conngerant(ActionEvent event) {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
    		Statement st=cnx.createStatement();
    		String sql="Select * from gerantaccess where username='"+login.getText()+"' and password='"+pswd.getText().toString()+"'";
    		ResultSet rs = st.executeQuery(sql);
    		if(rs.next()) {
    			
    			 System.out.println("Connexion gerant avec succées");
                 
                 Stage logp = new Stage();
                 btngerant.getScene().getWindow().hide();
                 Parent rootA;
                 rootA = FXMLLoader.load(getClass().getResource("EspaceGerant.fxml"));
                 Scene scene = new Scene(rootA);
                 logp.setScene(scene);
                 logp.show();
    		}
    		 else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText("Veuillez verifier votre Identifiant et votre Mot de passe !");
                 alert.showAndWait();
             }
             
         } catch (SQLException ex) {
         } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    @FXML
    void connmagasinier(ActionEvent event) {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
    		Statement st=cnx.createStatement();
    		String sql="Select * from magasinieraccess where username='"+login.getText()+"' and password='"+pswd.getText().toString()+"'";
    		ResultSet rs = st.executeQuery(sql);
    		if(rs.next()) {
    			
    			 System.out.println("Connexion magasinier avec succées");
                 
                 Stage logp = new Stage();
                 btnmagasinier.getScene().getWindow().hide();
                 Parent rootA;
                 rootA = FXMLLoader.load(getClass().getResource("interfaceMagasinier.fxml"));
                 Scene scene = new Scene(rootA);
                 logp.setScene(scene);
                 logp.show();
    		}
    		 else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText("Veuillez verifier votre Identifiant et votre Mot de passe !");
                 alert.showAndWait();
             }
             
         } catch (SQLException ex) {
         } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    @FXML
    void conngestionniare(ActionEvent event) {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
    		Statement st=cnx.createStatement();
    		String sql="Select * from gestionnaireaccess where username='"+login.getText()+"' and password='"+pswd.getText().toString()+"'";
    		ResultSet rs = st.executeQuery(sql);
    		if(rs.next()) {
    			
    			 System.out.println("Connexion gestionnaire avec succées");
                 
                 Stage logp = new Stage();
                 btngestionnaire.getScene().getWindow().hide();
                 Parent rootA;
                 rootA = FXMLLoader.load(getClass().getResource("interfaceGestionnaire.fxml"));
                 Scene scene = new Scene(rootA);
                 logp.setScene(scene);
                 logp.show();
    		}
    		 else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText("Veuillez verifier votre Identifiant et votre Mot de passe !");
                 alert.showAndWait();
             }
             
         } catch (SQLException ex) {
         } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void caissiercon(ActionEvent event) {
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
    		Statement st=cnx.createStatement();
    		String sql="Select * from caissieraccess where username='"+login.getText()+"' and password='"+pswd.getText().toString()+"'";
    		ResultSet rs = st.executeQuery(sql);
    		if(rs.next()) {
    			
    			 System.out.println("Connexion caissier avec succées");
                 
                 Stage logp = new Stage();
                 btncaissier.getScene().getWindow().hide();
                 Parent rootA;
                 rootA = FXMLLoader.load(getClass().getResource("interfaceCaissier.fxml"));
                 Scene scene = new Scene(rootA);
                 logp.setScene(scene);
                 logp.show();
    		}
    		 else
             {
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setHeaderText(null);
                 alert.setContentText("Veuillez verifier votre Identifiant et votre Mot de passe !");
                 alert.showAndWait();
             }
             
         } catch (SQLException ex) {
         } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }




}
