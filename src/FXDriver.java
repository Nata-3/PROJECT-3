/*
 * Class: CMSC203 
 * Instructor: Prof. Ahmed Tarek
 * Description: A program that encrypts and decrypts text
 * Due: 3/11/2025
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
 *independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Natnael Tenagashaw
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main method for the GUI example program JavaFX version
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022 *
 */
public class FXDriver extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// call the main scene which is a BorderPane
		FXMainPane root = new FXMainPane();
		stage.setScene(new Scene(root, 600, 350));
		// Set stage title and show the stage.
		stage.setTitle("Cybersecurity Encryption and Decryption");
		stage.show();

	}
}
