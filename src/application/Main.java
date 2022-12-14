package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	
	/**
	 * This method opends the main screen 
	 * to create an account or log in
	 * @param primaryStage
	 */
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();		
			VBox root = loader.load(new FileInputStream("src/screens/mainScreen.fxml"));		
			Scene scene = new Scene(root,400,200);		
			primaryStage.setScene(scene);
			primaryStage.setTitle("The Student Bank");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
 