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
public class Deposit extends Transaction {

    public Deposit(double initialAmount) {
        super();
    }

  
    public boolean deposit(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad del depósito tiene que ser mayor que 0");
            return false;
        }

        if (getSource() != null) {
            getSource().deposit(cantidad);

            setDate(new Date());

            System.out.println("Depósito correcto de " + cantidad + " en la cuenta");
            return true;
        } else {
            System.out.println("No se pudo realizar el deposito por fondo insuficiente");
            return false;
        }
    }

    private void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Account getSource() {
        return getSource();
    }
}
