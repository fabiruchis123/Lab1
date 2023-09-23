/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;

/**
 *
 * @author maryc
 */
import bancolab1.Transaction ;

public class CreditCard extends Card{
 private double balance;   
 private double creditLimit;   
 private static double interestRate;

  Transaction transaction= new Transaction() {};
    private double amount = transaction.getAmount();
    
    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public CreditCard(double balance, double creditLimit, String number) {
        super(number);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

 public boolean MakePayment (double amount){
     if(amount>0){
         if (amount<=balance){
             balance -=amount;
             return true;
         }else{
             return false;
         }   
     }else{
         return false;
     }
 }
 public boolean MakePurchase(double amount){
        if (creditLimit<=amount){
            creditLimit -=amount;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void Activate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Desactivate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
