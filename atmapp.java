package atm;


import atm.Atm;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nourena Nabil
 */
public class atmapp extends Application  {
    static Stage primaryStage;
    static homeScreen homescreen;
    static amount amount;
    static account account;
    static transaction transaction;
    public static void main(String[] args) {
        launch(args);
    }
    private Parent grid;

    @Override
    public void start(Stage primaryStage) throws Exception {
        atmapp.primaryStage = primaryStage;
        primaryStage.setTitle("                                                     ATM           ");
        account = new account();
         Atm Atm =new Atm();
         homescreen = new homeScreen();
         amount = new amount ();
         Atm.prepareScene();
         homescreen.prepare();
         amount.prepareScene();
   
   //Scene scene =new Scene(grid ,600,400);
           primaryStage.setScene(Atm.getScene());
    primaryStage.show();
    
    }
}
