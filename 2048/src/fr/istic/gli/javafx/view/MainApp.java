package fr.istic.gli.javafx.view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import fr.istic.gli.javafx.controler.Controler;
import fr.istic.gli.javafx.model.BoardImpl;

public class MainApp extends Application {
	


	@Override
    public void start(Stage primaryStage) {
        
        BoardImpl board = new BoardImpl(4);      
        Game2048 game = new Game2048(board);       
        Controler controler= new Controler(board, game, primaryStage);
        GridPane root = controler.getIhmfx();
        
        Scene scene =new Scene(root, 400, 400);
		scene .getStylesheets().add(Game2048.class.getResource("game.css").toExternalForm());
	      root.getStyleClass().addAll("game-root");

    	
        primaryStage.setTitle("GAME 2048");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
