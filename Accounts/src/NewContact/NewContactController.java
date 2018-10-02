/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewContact;

import Dbconnection.Dbconnection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import Dashboard.DashboardController;

/**
 * FXML Controller class
 *
 * @author adi
 */
public class NewContactController implements Initializable {

    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField regno;
    @FXML
    private JFXTextField rollno;
    @FXML
    private JFXTextField semester;
    @FXML
    private JFXTextField batch;
    @FXML
    private JFXTextField year;
    @FXML
    private JFXTextField parentname;
    @FXML
    private JFXTextField parentmob;
    @FXML
    private JFXTextField studentmob;
    @FXML
    private JFXTextField studentemail;
    @FXML
    private JFXTextField address;
    @FXML
    private JFXTextField collagefee;
    @FXML
    private JFXTextField hostelfee;
    @FXML
    private JFXTextField messfee;
    @FXML
    private JFXTextField scholarship;
    @FXML
    private JFXTextField latefine;
    @FXML
    private JFXTextField trandetails;
    @FXML
    private JFXTextField tranid;
    @FXML
    private JFXTextField bankname;
    @FXML
    private JFXTextField holdername;
    @FXML
    private JFXTextField remark;
    @FXML
    private JFXButton save;
    @FXML
    private JFXButton exit;
    
    private Dbconnection dc;
    
    private DashboardController lu;
    
    private PreparedStatement pst;
    @FXML
    private AnchorPane anchorpane;
    @FXML
    private TabPane tabpane;
    @FXML
    private Tab tab1;
    @FXML
    private AnchorPane anch1;
    @FXML
    private Tab tab2;
    @FXML
    private AnchorPane anch2;
    @FXML
    private Tab tab3;
    @FXML
    private AnchorPane anch3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dc = new Dbconnection();
    }    

    //private void click_save(MouseEvent event) throws ClassNotFoundException, SQLException {
        //try{
            //System.out.println("hello");
            /*Connection conn = dc.Connect();
            String Name = name.getText();
            String Regno = regno.getText();
            String Rollno = rollno.getText();
            String Semester = semester.getText();
            String Batch = batch.getText();
            String Year = year.getText();
            String Parentname = parentname.getText();
            String Parentmob = parentmob.getText();
            String Studentmob = studentmob.getText();
            String Studentemail = studentemail.getText();
            String Address = address.getText();
            String Collagefee = collagefee.getText();
            String Hotelfee = hostelfee.getText();
            String Messfee = messfee.getText();
            String Scholarship = scholarship.getText();
            String Latefine = latefine.getText();
            String Trandetails = trandetails.getText();
            String Tranid = tranid.getText();
            String Bankname = bankname.getText();
            String Holdername = holdername.getText();
            String Remark = remark.getText();
            
            String query = "INSERT INTO `studentDetails`(`name`, `regNo`, `rollNo`, `semester`, `batch`, `year`, `parentName`, `parentMob`,`studentMob`,  `studentEmail`, `address`, `collageFee`, `hostelFee`, `messFee`, `scholarship`,`lateFine`,`transDetail`,`transId`,`bankName`,`accountHolder`,`remark`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            pst = conn.prepareStatement(query);
            
            pst.setString(1,Name);
            pst.setString(2,Regno);
            pst.setString(3,Rollno);
            pst.setString(4,Semester);
            pst.setString(5,Batch);
            pst.setString(6,Year);
            pst.setString(7,Parentname);
            pst.setString(8,Parentmob);
            pst.setString(9,Studentmob);
            pst.setString(10,Studentemail);
            pst.setString(11,Address);
            pst.setString(12,Collagefee);
            pst.setString(13,Hotelfee);
            pst.setString(14,Messfee);
            pst.setString(15,Scholarship);
            pst.setString(16,Latefine);
            pst.setString(17,Trandetails);
            pst.setString(18,Tranid);
            pst.setString(19,Bankname);
            pst.setString(20,Holdername);
            pst.setString(21,Remark);
            
            pst.execute();*/
            
            
            
        //}
        /*catch(SQLException ex){
                System.err.println("ERRor "+ex);
        }*/
        
    //}

    @FXML
    private void click_exit(ActionEvent event) {
        //lu.loadUI("/Search/Search");
    }

    @FXML
    private void click_save(ActionEvent event) throws ClassNotFoundException,SQLException {
            try{
            System.out.println("hello");
            Connection conn = dc.Connect();
            String Name = name.getText();
            String Regno = regno.getText();
            String Rollno = rollno.getText();
            String Semester = semester.getText();
            String Batch = batch.getText();
            String Year = year.getText();
            String Parentname = parentname.getText();
            String Parentmob = parentmob.getText();
            String Studentmob = studentmob.getText();
            String Studentemail = studentemail.getText();
            String Address = address.getText();
            String Collagefee = collagefee.getText();
            String Hotelfee = hostelfee.getText();
            String Messfee = messfee.getText();
            String Scholarship = scholarship.getText();
            String Latefine = latefine.getText();
            String Trandetails = trandetails.getText();
            String Tranid = tranid.getText();
            String Bankname = bankname.getText();
            String Holdername = holdername.getText();
            String Remark = remark.getText();
            
            String query = "INSERT INTO `studentDetails`(`name`, `regNo`, `rollNo`, `semester`, `batch`, `year`, `parentName`, `parentMob`,`studentMob`,  `studentEmail`, `address`, `collageFee`, `hostelFee`, `messFee`, `scholarship`,`lateFine`,`transDetail`,`transId`,`bankName`,`accountHolder`,`remark`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            pst = conn.prepareStatement(query);
            
            pst.setString(1,Name);
            pst.setString(2,Regno);
            pst.setString(3,Rollno);
            pst.setString(4,Semester);
            pst.setString(5,Batch);
            pst.setString(6,Year);
            pst.setString(7,Parentname);
            pst.setString(8,Parentmob);
            pst.setString(9,Studentmob);
            pst.setString(10,Studentemail);
            pst.setString(11,Address);
            pst.setString(12,Collagefee);
            pst.setString(13,Hotelfee);
            pst.setString(14,Messfee);
            pst.setString(15,Scholarship);
            pst.setString(16,Latefine);
            pst.setString(17,Trandetails);
            pst.setString(18,Tranid);
            pst.setString(19,Bankname);
            pst.setString(20,Holdername);
            pst.setString(21,Remark);
            
            pst.execute();
            
            
            
        }
        catch(SQLException ex){
                System.err.println("ERRor "+ex);
        }
        
    }
    
    
}
