/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;



/**
 * FXML Controller class
 *
 * @author adi
 */
public class DashboardController implements Initializable {

    @FXML
    private BorderPane borderpane;
    /**
     * Initializes the controller class.
     */



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void search(MouseEvent event) {
        loadUI("/Search/Search");
    }

    @FXML
    private void newcontacts(MouseEvent event) {
        loadUI("/NewContact/NewContact");
    }


    @FXML
    private void generalinfo(MouseEvent event) {
    }


    @FXML
    private void feedefaulters(MouseEvent event) {
    }

    @FXML
    private void collagefee(MouseEvent event) {
    }

    @FXML
    private void hostelfee(MouseEvent event) {
    }

    @FXML
    private void messfee(MouseEvent event) {
    }

    @FXML
    private void pichart(MouseEvent event) {
    }


    @FXML
    private void settings(MouseEvent event) {
    }

    public void loadUI(String ui){
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource(ui + ".fxml"));
        } catch(IOException ex){
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE,null, ex);
        }
        borderpane.setCenter(root);
    }

    @FXML
    private void accountsdetails(MouseEvent event) {
    }

    @FXML
    private void notifications(MouseEvent event) {
    }
    
}
