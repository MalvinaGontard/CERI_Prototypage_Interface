/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author casanova
 */
public class FXMLContactPanelController implements Initializable {

    @FXML
    Button addPhoneNumber;
    
    @FXML
    Button cancel;
    
    @FXML
    Button ok;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        addPhoneNumber.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event open phone number");
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLPhoneNumberPanel.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
        
                    stage.setScene(scene);
                    stage.setTitle("Add a phone number");
                    stage.show();
                    
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        cancel.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event click close new contact");
                Stage stage = (Stage) cancel.getScene().getWindow();
                stage.close();
            }
        });
        
        ok.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event click close new contact");
                Stage stage = (Stage) ok.getScene().getWindow();
                stage.close();
            }
        });
    }    
    
}
