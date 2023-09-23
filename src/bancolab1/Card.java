/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;

import bancolab1.Transaction;
/**
 *
 * @author maryc
 */
public abstract class Card implements StatusControl{
    private String number;
    private boolean activate=true;
    private double limit; // quitar 
    
    Transaction transaction= new Transaction() {};
    private double amount = transaction.getAmount();
    public String getNumber() {
        return number;
    }

    public boolean isActivate() {
        return activate;
    }

    public Card(String number) {
        this.number = number;

    }
    
    
    public void activate(){
        activate=true;
    }
    public void desactivate(){
        activate=false; 
    }
    public abstract boolean MakePurchase(double amount);
}
