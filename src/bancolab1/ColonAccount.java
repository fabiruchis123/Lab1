/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;

/**
 *
 * @author maryc
 */
public class ColonAccount extends Account {

    public ColonAccount(String number, double balance, Custumer custumer, boolean active) {
        super(number, balance, custumer, active);
    }
        public ColonAccount(String number,  Custumer custumer, boolean active) {
        super(number, custumer, active);
    }
    
    public boolean Transfer(double Account, double amount){
        return Transfer(Account, amount);
        //volver a hacer, mas grande
    }
}
