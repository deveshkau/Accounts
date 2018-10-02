/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author adi
 */
public class Accounts extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Stage stage=new Stage();
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/Dashboard/Dashboard.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Accounts Console");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
