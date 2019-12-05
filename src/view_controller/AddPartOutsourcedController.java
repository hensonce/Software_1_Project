/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Inhouse;
import model.Inventory;
import model.Outsourced;

/**
 * FXML Controller class
 *
 * @author Samantha
 */
public class AddPartOutsourcedController implements Initializable {
    
    Stage stage;
    Parent scene;

    @FXML
    private RadioButton APInHouseradio;
    @FXML
    private RadioButton APOutsourcedradio;
    @FXML
    private TextField APIDtxt;
    @FXML
    private TextField APNametxt;
    @FXML
    private TextField APInvtxt;
    @FXML
    private TextField APPricetxt;
    @FXML
    private TextField APCompanyNametxt;
    @FXML
    private TextField APMaxtxt;
    @FXML
    private TextField APMintxt;
    @FXML
    private Button APSavebtn;
    @FXML
    private Button APCancelbtn;
    
    
    @FXML
    void onActionDisplayMainScreen(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/MainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }
    
    @FXML
    void onActionSwitchToAPInhouse(ActionEvent event) throws IOException {
        
        stage = (Stage)((RadioButton)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/AddPartInhouse.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }
    
    @FXML
    void onActionSavePart(ActionEvent event) throws IOException {
        
        int id = Integer.parseInt(APIDtxt.getText());
        String name = APNametxt.getText();
        int stock = Integer.parseInt(APInvtxt.getText());
        double price = Double.parseDouble(APPricetxt.getText());
        String companyName = APCompanyNametxt.getText();
        int max = Integer.parseInt(APMaxtxt.getText());
        int min = Integer.parseInt(APMintxt.getText());
        
        Inventory.addPart(new Outsourced(id, name, price, stock, min, max, companyName));
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/MainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();        

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
