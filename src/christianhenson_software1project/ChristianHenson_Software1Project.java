/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christianhenson_software1project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Inhouse;
import model.Inventory;
import model.Outsourced;

/**
 *
 * @author Samantha
 */
public class ChristianHenson_Software1Project extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view_controller/MainScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //inhousepart fitting = new inhousepart("name", id, price, ect)
        Inhouse inhouse1 = new Inhouse(1, "coupling", 0.99, 50, 20, 500, 1);
        Inhouse inhouse2 = new Inhouse(2, "maleadaptor", 1.99, 40, 20, 500, 1);
        Inhouse inhouse3 = new Inhouse(3, "elbow", 0.99, 200, 100, 1000, 1);
        
        Inventory.addPart(inhouse1);
        Inventory.addPart(inhouse2);
        Inventory.addPart(inhouse3);
        
        //outsourced parts
        Outsourced outhouse1 = new Outsourced(4, "conduitsweep", 2.99, 10, 5, 50, "acme");
        Outsourced outhouse2 = new Outsourced(5, "greypvccement", 7.99, 5, 3, 10, "ferguson");
        Outsourced outhouse3 = new Outsourced(6, "wire", 0.04, 200, 100, 2000, "acme");
        
        Inventory.addPart(outhouse1);
        Inventory.addPart(outhouse2);
        Inventory.addPart(outhouse3);
        
        launch(args);
    }
    
}
