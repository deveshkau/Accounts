/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import Dbconnection.Dbconnection;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author adi
 */
public class SearchController implements Initializable {

    @FXML
    private AnchorPane s_anchorpane;
    @FXML
    private VBox s_1vbox;
    @FXML
    private HBox s_1hbox;
    @FXML
    private HBox s_2hbox;
    @FXML
    private JFXButton s_loadtable;
    @FXML
    private JFXButton s_regno;
    @FXML
    private JFXButton s_name;
    @FXML
    private JFXButton s_batch;
    @FXML
    private JFXButton s_year;
    @FXML
    private JFXButton s_semester;
    @FXML
    private JFXButton s_remark;
    @FXML
    private VBox s_2vbox;
    @FXML
    private TableColumn<modelTable,String> id;
    @FXML
    private TableColumn<modelTable,String> name;
    @FXML
    private TableColumn<modelTable,String> regno;
    @FXML
    private TableColumn<modelTable,String> rollno;
    @FXML
    private TableColumn<modelTable,String> semester;
    @FXML
    private TableColumn<modelTable,String> batch;
    @FXML
    private TableColumn<modelTable,String> year;
    @FXML
    private TableColumn<modelTable,String> parentname;
    @FXML
    private TableColumn<modelTable,String> parentmob;
    @FXML
    private TableColumn<modelTable,String> studentmob;
    @FXML
    private TableColumn<modelTable,String> studentemail;
    @FXML
    private TableColumn<modelTable,String> address;
    @FXML
    private TableColumn<modelTable,String> collagefee;
    @FXML
    private TableColumn<modelTable,String> hostelfee;
    @FXML
    private TableColumn<modelTable,String> messfee;
    @FXML
    private TableColumn<modelTable,String> scholarship;
    @FXML
    private TableColumn<modelTable,String> fine;
    @FXML
    private TableColumn<modelTable,String> trandetails;
    @FXML
    private TableColumn<modelTable,String> tranid;
    @FXML
    private TableColumn<modelTable,String> bankname;
    @FXML
    private TableColumn<modelTable,String> accountholder;
    @FXML
    private TableColumn<modelTable,String> remark;
    @FXML
    private TableView<modelTable> s_tableview;
    
    private Dbconnection dc;
    
    ObservableList<modelTable> oblist = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dc = new Dbconnection();
    }    

    @FXML
    private void click_loadtable(ActionEvent event) throws ClassNotFoundException, SQLException {
        //System.out.println("error");
        try{
        Connection conn = dc.Connect();
        ResultSet rst = conn.createStatement().executeQuery("select * from studentDetails");
        
        while (rst.next()){
            oblist.add(new modelTable(rst.getString("id"),rst.getString("name"),rst.getString("regNo"),rst.getString("rollNo")
            ,rst.getString("semester"),rst.getString("batch"),rst.getString("year"),rst.getString("parentName"),rst.getString("parentMob")
            ,rst.getString("studentMob"),rst.getString("studentEmail"),rst.getString("address"),rst.getString("collageFee"),rst.getString("hostelFee")
            ,rst.getString("messFee"),rst.getString("scholarship"),rst.getString("lateFine"),rst.getString("transDetail"),rst.getString("transId")
            ,rst.getString("bankName"),rst.getString("accountHolder"),rst.getString("remark")));
        }
        } catch(SQLException ex){
            //Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");    
        }
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        regno.setCellValueFactory(new PropertyValueFactory<>("regno"));
        rollno.setCellValueFactory(new PropertyValueFactory<>("rollno"));
        semester.setCellValueFactory(new PropertyValueFactory<>("semester"));
        batch.setCellValueFactory(new PropertyValueFactory<>("batch"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        parentname.setCellValueFactory(new PropertyValueFactory<>("parentname"));
        parentmob.setCellValueFactory(new PropertyValueFactory<>("parentmob"));
        studentmob.setCellValueFactory(new PropertyValueFactory<>("studentmob"));
        studentemail.setCellValueFactory(new PropertyValueFactory<>("studentemail"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        collagefee.setCellValueFactory(new PropertyValueFactory<>("collagefee"));
        hostelfee.setCellValueFactory(new PropertyValueFactory<>("hostelfee"));
        messfee.setCellValueFactory(new PropertyValueFactory<>("messfee"));
        scholarship.setCellValueFactory(new PropertyValueFactory<>("scholarship"));
        fine.setCellValueFactory(new PropertyValueFactory<>("fine"));
        trandetails.setCellValueFactory(new PropertyValueFactory<>("trandetails"));
        tranid.setCellValueFactory(new PropertyValueFactory<>("tranid"));
        bankname.setCellValueFactory(new PropertyValueFactory<>("bankname"));
        accountholder.setCellValueFactory(new PropertyValueFactory<>("accountholder"));
        remark.setCellValueFactory(new PropertyValueFactory<>("remark"));
        
        s_tableview.setItems(oblist);
    }

    @FXML
    private void click_regno(ActionEvent event) {
        System.out.println("error");
    }

    @FXML
    private void click_name(ActionEvent event) {
    }

    @FXML
    private void click_batch(ActionEvent event) {
    }

    @FXML
    private void click_year(ActionEvent event) {
    }

    @FXML
    private void click_semester(ActionEvent event) {
    }

    @FXML
    private void click_remark(ActionEvent event) {
    }
    
}
