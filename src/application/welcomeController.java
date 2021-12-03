package application;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.layout.VBox;

public class welcomeController {
	@FXML
	private Button btn;
	private VBox VBox; 
	private Parent fxml;
	
	@FXML
	public void admin() {
		 TranslateTransition t = new TranslateTransition(Duration.seconds(1),VBox);
		 t.setToX(VBox.getLayoutX());
			 t.play();
			 t.setOnFinished(e ->{
			 try {
				 fxml=FXMLLoader.load(getClass().getResource("interfaceAdmin.fxml"));
				 VBox.getChildren().removeAll();
				 VBox.getChildren().setAll(fxml);
				 }
			 catch (Exception e1) {
				 e1.printStackTrace();
			 }
			 
		 });
	 }

}
