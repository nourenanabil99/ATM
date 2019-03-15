/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Nourena Nabil
 */
public class Atm{
    //homeScreen homescreen;
    Scene scene;
    loginauthentication authentication;
   transaction transaction;
    public void prepareScene(){
 
   authentication  = new loginauthentication();
   
   
  //Label usernameLabel = new Label("username:");
  Label passwordLabel =new Label("password: ");
  Label validationLabel =new Label();
   PasswordField passwordField = new PasswordField();
   Button login =new Button("login");
   GridPane grid = new GridPane();
   grid.add(passwordLabel,0 ,1);
   grid.add(passwordField,1 ,1);
   grid.add(login,1 ,4);
   grid.add(validationLabel,1,3);
    
   login.setOnAction (e ->{
          String password =passwordField.getText();
        boolean valid = authentication.validate(password);
   if(valid)
{
   validationLabel.setText("welcome");
    atmapp.primaryStage.setScene(atmapp.homescreen.getScene());
}
else 
{
  validationLabel.setText("wrong password");
}
   });
       
     scene = new Scene (grid ,600,400);
    }
    public Scene getScene(){
        return this.scene;
    }
    
}

    /**
     * @param args the command line arguments
     */
    
    
