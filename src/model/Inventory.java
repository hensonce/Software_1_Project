/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Samantha
 */
public class Inventory {
    //I break up methods and fields by parts and products. part -> fields /n product -> fields
    
    //PART
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    
    public static void addPart(Part newPart){
        allParts.add(newPart);        
    }
    
    public static ObservableList<Part> getAllParts(){
        return allParts;
    }
    
    public Part lookupPart(int partId){
        return null;
    }
    
    public ObservableList<Part> lookupPart(String partName){
        return null;
    }
    
    public void updatePart(int index, Part selectedPart){
        
    }
    
    public void deletePart(Part selectedPart){
        
    }
       
    
    //PRODUCT
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    
    public void addProduct(Product newProduct){
    allProducts.add(newProduct);        
    }
        
    public static ObservableList<Product> getAllProducts(){
    return allProducts;
    }
    
    public Product lookupProduct(int productId){
    return null;
    }
    
    public ObservableList<Product> lookupProduct(String productName){
    return null;
    }
    
    public void updateProduct(int index, Product selectedProduct){
        
    }
    
    public void deleteProduct(Product selectedProduct){
        
    }
        
    
}
