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
public class Transfer extends Transaction {

    private Account destino;

    public Transfer(double initialAmount) {
        super();
        this.destino = destino;
    }

 
    public boolean transfer(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La transferencia tiene que ser mayor que 0");
            return false;
        }

        if (getSource() != null && destino != null) {
            
            if (getSource().whithdrawal(amount)) {
                
                if (destino.deposit(cantidad)) {
                    
                    setDate(new Date());
                    destino.setDate(new Date());
                    System.out.println("Transferencia correcta de " + cantidad + " a la cuenta");
                    return true;
                    
                } else {
                    System.out.println("No se pudo depositar en la cuenta de destino.");
                    getSource().deposit(cantidad); 
                }
            } else {
                
                System.out.println("No se pudo realizar el retiro de la cuenta de origen.");
            }
            
        } else {
            System.out.println("No se pudo obtener la cuenta de origen o la cuenta de destino.");
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