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
public class Withdrawal extends Transaction {

    public Withdrawal(double initialAmount) {
        super();
    }



    public boolean withdraw(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad del retiro tiene que ser mayor que 0");
            return false;
        }

        if (getSource() != null) {
            if (getSource().whithdrawal(amount)) {
                setDate(new Date());
                System.out.println("Retiro correcto de " + cantidad + " de la cuenta");
                return true;
            } else {
                System.out.println("No se pudo realizar el retiro por fondo no validoo");
            }
        } else {
            System.out.println("No se encontro la cuenta");
        }

        return false;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Account getSource() {
        return getSource();
    }
}