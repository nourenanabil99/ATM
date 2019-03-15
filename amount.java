package atm;


import static java.util.Date.parse;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nourena Nabil
 */
public class amount {
    boolean deposit;
    Scene scene;
    public void prepareScene(){
    Label value =new Label ("please enter the amount");
    TextField Amount= new TextField ();
    Label checkAmount = new Label();
    Button ok = new Button ("ok");
    Button check = new Button ("Back");
    ok.setOnAction(e->{
        if(deposit)
        { 
            atmapp.account.deposit(Double.parseDouble(Amount.getText()));
        }
        else 
        {
               atmapp.account.withdraw(Double.parseDouble(Amount.getText()));
                 
               // atmapp.primaryStage.setScene(atmapp.homescreen.getScene());
            
             }
       atmapp.primaryStage.setScene(atmapp.homescreen.getScene());
    });
    GridPane grid = new GridPane ();
    grid.add(value,0,0);
    grid.add(Amount,0,1);
    grid.add(ok,0,4);
    //grid.add(check,2,5);
    grid.add(checkAmount, 2, 6);
    scene = new Scene (grid ,600,400);
    }

    public Scene getScene() {
        return scene;
    }
    
    
    
}
