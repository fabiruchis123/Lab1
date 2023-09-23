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
public abstract class Account {
    
    private String number;
    private double balance;
    private Custumer custumer;
    private boolean active;
    private Date date;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Custumer getCustumer() {
        return custumer;
    }

    public boolean isActive() {
        return active;
    }

    public Account(String number, double balance, Custumer custumer, boolean active) {
        this.number = number;
        this.balance = balance;
        this.custumer = custumer;
        this.active = active;
    }

    public Account(String number,  Custumer custumer, boolean active) {
        this.number = number;
        this.balance = 0;
        this.custumer = custumer;
        this.active = active;
    }
    
    public boolean deposit(double amount){
        return deposit(amount);
    }
    public boolean whithdrawal(double amount){
        return whithdrawal(amount);
        
    }
    public boolean Transfer(double amount){
        return Transfer(amount);
    }

    void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
        balance -= amount;
    } else {
        System.out.println("No se puede retirar la cantidad por saldo insuficiente");
    }
}

    double getAmount() {
    return balance;
}

    void setDate(Date date) {
    this.date = date;
    
    }
}
