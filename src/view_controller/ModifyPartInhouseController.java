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
import model.Part;

/**
 * FXML Controller class
 *
 * @author Samantha
 */
public class ModifyPartInhouseController implements Initializable {
    
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
    private TextField MPMachineIDtxt;
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
    void onActionSwitchToMPOutsourced(ActionEvent event) throws IOException {

        stage = (Stage)((RadioButton)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/ModifyPartOutsourced.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }
    
//        public boolean update(int id, Part part)
//    {
//        int index = -1;
//        
//        for(Part partloop : Inventory.getAllParts())
//        {
//            index++;
//            
//            if(partloop.getId() == id)
//            {
//                Inventory.getAllParts().set(index, part);
//                return true;
//            }
//        }
//        return false;
//    }
    
    @FXML
    void onActionSave(ActionEvent event) throws IOException {
        
        
        int id = Integer.parseInt(MPIDtxt.getText());
        String name = MPNametxt.getText();
        int stock = Integer.parseInt(MPInvtxt.getText());
        double price = Double.parseDouble(MPPricetxt.getText());
        int machineId = Integer.parseInt(MPMachineIDtxt.getText());
        int max = Integer.parseInt(MPMaxtxt.getText());
        int min = Integer.parseInt(MPMintxt.getText());
        
        //this needs to be set/replace part not addPart
        //Inventory.addPart(new Inhouse(id, name, price, stock, min, max, machineId));
        
        //here it is as update/replace
        //Inventory.getAllParts.set(int // Inhouse(id, name, price, stock, min, max, machineId));
        
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
