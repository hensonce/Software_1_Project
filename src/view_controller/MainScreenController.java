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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Inhouse;
import model.Inventory;
import model.Part;
import model.Product;

/**
 *
 * @author Samantha
 */
public class MainScreenController implements Initializable {
    
    Stage stage;
    Parent scene;
    
    //I think i can delete this label...
    private Label label;
    //delete above?
    
    @FXML
    private Button MSPSearchbtn;
    @FXML
    private TextField MSPSearchtxt;
    @FXML
    private TableView<Part> MSPTableView;
    @FXML
    private TableColumn<Part, Integer> MSPTVPartIDcol;
    @FXML
    private TableColumn<Part, String> MSPTVPartNamecol;
    @FXML
    private TableColumn<Part, Integer> MSPTVInventoryLevelcol;
    @FXML
    private TableColumn<Part, Double> MSPTVPricecol;
    @FXML
    private Button MSPAddbtn;
    @FXML
    private Button MSPModifybtn;
    @FXML
    private Button MSPDeletebtn;
    @FXML
    private Button MSPrSearchbtn;
    @FXML
    private TextField MSPrSearchtxt;
    @FXML
    private TableView<Product> MSPrTableView;
    @FXML
    private TableColumn<Product, Integer> MSPrTVProductIDcol;
    @FXML
    private TableColumn<Product, String> MSPrTVProductNamecol;
    @FXML
    private TableColumn<Product, Integer> MSPrTVInventoryLevelcol;
    @FXML
    private TableColumn<Product, Double> MSPrTVPricecol;
    @FXML
    private Button MSPrAddbtn;
    @FXML
    private Button MSPrModifybtn;
    @FXML
    private Button MSPrDeletebtn;
    @FXML
    private Button MSExitbtn;
    
    
    @FXML
    void onActionAddPartInhouse(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/AddPartInhouse.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }

    @FXML
    void onActionAddProduct(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/AddProduct.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void onActionExit(ActionEvent event) {

        System.exit(0);
    }

    @FXML
    void onActionModifyPartInhouse(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/ModifyPartInhouse.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
        
    }

    @FXML
    void onActionModifyProduct(ActionEvent event) throws IOException {

        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view_controller/ModifyProduct.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }
    
    //maybe going to be replaced
    public boolean search(int id) {
        for(Part part : Inventory.getAllParts())
        {
            if(part.getId() == id)
                return true;
        }
            return false;
    }
    
    //funky...?
//    public boolean update(int id, Part part)
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
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        MSPTableView.setItems(Inventory.getAllParts());
        
        MSPTVPartIDcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        MSPTVPartNamecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        MSPTVInventoryLevelcol.setCellValueFactory(new PropertyValueFactory<>("stock"));
        MSPTVPricecol.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        //going to be replaced
//        if(search(3))
//            System.out.println("match");
//        else
//            System.out.println("no match");
        
    }    
    
}
