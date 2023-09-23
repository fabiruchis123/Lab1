/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;

/**
 *
 * @author maryc
 */
public class DollarAccount extends Account  {
   private double  exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     *
     * @param exchangeRate
     */
    public DollarAccount(String number, double balance, Custumer custumer, boolean active, double exchangeRate) {
      super(number, balance, custumer, active) ;
        this.exchangeRate = exchangeRate;
    }

    public DollarAccount(String number, double balance, Custumer custumer, boolean active) {
        super(number, balance, custumer, active);
    }

    public DollarAccount(String number, Custumer custumer, boolean active) {
        super(number ,0,  custumer, active);
    }
    
    public boolean Transfer(double Account, double amount){
        return Transfer(Account, amount);
        //hacerlo de nuevo mas grande 
    }
    

    @Override
    public String toString() {
        return "DollarAccount{" + "exchangeRate=" + exchangeRate + '}';
    }
    
    
}
