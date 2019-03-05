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
public class FXMLMainFrame2Controller implements Initializable {
    
    @FXML
    Button addContact;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Button addContact = (Button) scene.lookup("#add_contact");
        addContact.setOnAction(new EventHandler<ActionEvent> () {
            public void handle(ActionEvent event) {
                System.out.println("Event open contact panel");
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLContactPanel.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
        
                    stage.setScene(scene);
                    stage.setTitle("Create a contact");
                    stage.show();
                    
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }    
    
}
