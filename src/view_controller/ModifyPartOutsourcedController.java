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
import model.Inventory;
import model.Outsourced;

/**
 * FXML Controller class
 *
 * @author Samantha
 */
public class ModifyPartOutsourcedController implements Initializable {
    
    Stage stage;
    Parent scene;

    @FXML
    private RadioButton MPInHouseradio;
    @FXML
    private RadioButton MPOutsourcedradio;
    @FXML
    private TextField MPIDtxt;
    @FXML
    private TextField MPNametxt;
    @FXML
    private TextField MPInvtxt;
    @FXML
    private TextField MPPricetxt;
    @FXML
    private TextField MPCompanyNametxt;
    @FXML
    private TextField MPMaxtxt;
    @FXML
    private TextField MPMintxt;
    @FXML
    private Button MPSavebtn;
    @FXML
    private Button MPCancelbtn;
    
    
    @FXML
    void onActionDisplayMainScreen(ActionEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/MainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }
    
    @FXML
    void onActionSwitchToMPInhouse(ActionEvent event) throws IOException {
        
        stage = (Stage)((RadioButton)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/ModifyPartInhouse.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }
    
    @FXML
    void onActionSave(ActionEvent event) throws IOException {
        
        int id = Integer.parseInt(MPIDtxt.getText());
        String name = MPNametxt.getText();
        int stock = Integer.parseInt(MPInvtxt.getText());
        double price = Double.parseDouble(MPPricetxt.getText());
        String companyName = MPCompanyNametxt.getText();
        int max = Integer.parseInt(MPMaxtxt.getText());
        int min = Integer.parseInt(MPMintxt.getText());
        
        //needs to set/change part not addPart
        //Inventory.addPart(new Outsourced(id, name, price, stock, min, max, companyName));
        
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
