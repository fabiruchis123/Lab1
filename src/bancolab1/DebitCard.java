/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;
/**
 *
 * @author maryc
 */
public class DebitCard extends Card{
    private Account account;
     private double limit;
     
   Transaction transaction= new Transaction() {};
    private double amount = transaction.getAmount();
    
    public Account getAccount() {
        return account;
    }

    public double getLimit() {
        return limit;
    }

    public DebitCard(Account account, double limit, String number) {
        super(number);
        this.account = account;
   
    }

    public boolean MakePurchase(double amount){
        if (limit<=amount){
            limit -=amount;
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
