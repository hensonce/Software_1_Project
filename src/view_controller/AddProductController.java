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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Part;

/**
 * FXML Controller class
 *
 * @author Samantha
 */
public class AddProductController implements Initializable {
    
    Stage stage;
    Parent scene;

    @FXML
    private TextField MPrIDtxt;
    @FXML
    private TextField MPrNametxt;
    @FXML
    private TextField MPrInvtxt;
    @FXML
    private TextField MPrPricetxt;
    @FXML
    private TextField MPrMaxtxt;
    @FXML
    private TextField MPrMintxt;
    @FXML
    private Button MPrPotentialSearchbtn;
    @FXML
    private TextField MPrPotentialSearchtxt;
    @FXML
    private TableView<Part> MPrPotentialTableView;
    @FXML
    private TableColumn<Part, Integer> MPrPTVPartIDcol;
    @FXML
    private TableColumn<Part, String> MPrPTVPartNamecol;
    @FXML
    private TableColumn<Part, Integer> MPrPTVInventoryLevelcol;
    @FXML
    private TableColumn<Part, Double> MPrPTVPricecol;
    @FXML
    private Button MPrPotentialAddbtn;
    @FXML
    private TableView<Part> MPrCurrentTableView;
    @FXML
    private TableColumn<Part, Integer> MPrCTVPartIDcol;
    @FXML
    private TableColumn<Part, String> MPrCTVPartNamecol;
    @FXML
    private TableColumn<Part, Integer> MPrCTVInventoryLevelcol;
    @FXML
    private TableColumn<Part, Double> MPrCTVPricecol;
    @FXML
    private Button MPrCurrentDeletebtn;
    @FXML
    private Button MPrSavebtn;
    @FXML
    private Button MPrCancelbtn;
    
    
    @FXML
    void onActionDisplayMainScreen(ActionEvent event) throws IOException {
        
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/MainScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }
    
    @FXML
    void onActionSave(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
