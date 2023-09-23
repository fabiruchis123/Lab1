/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;

import java.util.Date;

/**
 *
 * @author UTN
 */
public abstract class Transaction {
    double amount;
    private Account source;
    Date date;

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Account getSource() {
        return source;
    }
    
    
    public Transaction() {
        this.amount = amount;
        this.source= source;
        this.date = new Date();
    }
    
       public void transfer(Transaction destino, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad tiene que ser mayor que 0");
            return;
        }

        if (this.amount >= cantidad) {
            
            this.amount -= cantidad;

            
            destino.amount += cantidad;

            
            this.date = new Date();
            destino.date = new Date();

            System.out.println("Transferencia correcta de" + cantidad + " a la cuenta destianria");
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia");
        }
    }

    @Override
    public String toString() {
        return "Transaction{" + "amount=" + amount + ", source=" + source + ", date=" + date + '}';
    }
       
}
