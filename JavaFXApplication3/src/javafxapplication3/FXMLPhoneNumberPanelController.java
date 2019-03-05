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
public class FXMLPhoneNumberPanelController implements Initializable {

    @FXML
    Button ok;
            
    @FXML
    Button cancel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        cancel.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event click close Phone number");
                Stage stage = (Stage) cancel.getScene().getWindow();
                stage.close();
            }
        });
        
        ok.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event click close Phone number");
                Stage stage = (Stage) ok.getScene().getWindow();
                stage.close();
            }
        });
    }    
    
}
