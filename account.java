package atm;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nourena Nabil
 */

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

public class account {

/**
 *
 * @author Nourena Nabil
 */

    private String accountCode;
    private static double balance;
    public ArrayList<transaction> history;

    /**
     *
     * @param accountCode
     * 
     */
    
    public account() {
        this.setaccountCode("1000");
        this.setbalance(1000);
        history  = new ArrayList<>();
    }
    protected void setaccountCode(String accountCode)
    {
        this.accountCode=accountCode;
    }
    
    /**
     *
     * @return
     */
    protected double getbalance()
    {
        return balance;
    }
    
    protected void setbalance(double balance)
    {
        this.balance=balance;
    }
    
     static int count=0;
     static boolean done;
     static boolean check=true;
    /* public void check(){
         if(transaction.amount>balance || transaction.amount<0)
         {
             check=true;
         }
         else 
         {
             check=false;
         }
     }*/
    public void withdraw(double amount)
    { 
      if(amount>balance || amount<0)
      {
          done=false;
            System.out.println("this transaction can't be processed");
      }
      else
      { 
          done=true;
          balance-=amount;
      transaction t = new transaction("withdraw", amount);
         
          System.out.println("your transaction completed successfully");
          System.out.println("your current balabnce is "+balance+amount);
           history.add(t);
           count++;
      }
     
    }
     public void deposit(double amount)
    {
      if (amount>=0)
      { balance+=amount;
       transaction t = new transaction("Deposit", amount);
        System.out.println("your transaction completed successfully");
          System.out.println("your current balabnce is "+balance);
          history.add(t);
          count++;
      } 
      else 
            System.out.println("this transaction can't be processed");
    }

  /* public void history  (){
     for( int i=0; i< account.history.size(); i++){
            System.out.print(account.history.get(i).getLastTransaction()+" "+account.history.get(i).getamount());
            
    }
}*/
public void next ()
{
    if(count<history.size()-1)
    {
      count++;
     check=true; 
    }
    if(count>=history.size()-1) 
    {
        check=false;
    }
}
 public void previous ()
 {
     if(count>0)
     count--;

 }
      }
