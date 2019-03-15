package atm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nourena Nabil
 */
public class transaction {
    private String lastTransaction;
    private double amount;

    
    public transaction(String lastTransaction, double amount) {
        this.lastTransaction = lastTransaction;
        this.amount = amount;
    }
    public String getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public double getamount() {
    return amount;}

    public void setamount(double amount) {
        this.amount = amount;
    }

}