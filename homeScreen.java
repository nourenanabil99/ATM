package atm;



import atm.Atm;
import static atm.account.count;
import static java.util.Date.parse;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
public class homeScreen {

    account a;
    Atm atm;
    Scene scene;
    amount b;
    public void prepare(){
        Label transactions =new Label ("transaction");
         Button withdraw =new Button ("withdraw");
         withdraw.setOnAction(e->{
           atmapp.amount.deposit=false;
           atmapp.primaryStage.setScene(atmapp.amount.getScene());
            });
         Button Deposite =new Button ("Deposite");
        Deposite.setOnAction(e->{
           atmapp.amount.deposit=true;
          // System.out.println("Test1");
           atmapp.primaryStage.setScene(atmapp.amount.getScene());
        });
        Label currentBalance =new Label();
         Button Balance =new Button ("Balance");
         Balance.setOnAction(e->{
            
            atmapp.account.getbalance();
            currentBalance.setText(""+atmapp.account.getbalance());
            
         });
         Label checkNext =new Label ();
         Label ShowNext =new Label();
         Button Next= new Button ("Next");
          Next.setOnAction(e->{
              if(account.check){
              atmapp.account.next();
              ShowNext.setText(atmapp.account.history.get(account.count).getLastTransaction()+atmapp.account.history.get(account.count).getamount());
              }
              else
              {
                  checkNext.setText("unavailable");
              }
              
          });
         Label ShowPrev =new Label();
         Button previous= new Button ("Previous");
         previous.setOnAction(e->{
              //System.out.print("no");
              atmapp.account.previous();
              ShowPrev.setText(""+atmapp.account.history.get(account.count).getLastTransaction()+atmapp.account.history.get(account.count).getamount());
          });
         
         GridPane grid = new GridPane ();
         grid.add(transactions, 1, 0);
         grid.add(Deposite, 0, 1);
         grid.add(withdraw, 2, 1);
         grid.add(Next,0,3);
         grid.add(previous,0,5);
         grid.add(Balance, 0, 7);
         grid.add(currentBalance,1 , 8);
         grid.add(ShowNext, 1, 4);
         grid.add(ShowPrev,1,6);
         grid.add(checkNext,1,3);
         scene = new Scene (grid ,600,400);
         }

    public Scene getScene() {
        return scene;
    }
    
    
    
}
