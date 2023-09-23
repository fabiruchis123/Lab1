/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancolab1;
import Person.Dtos.PersonDto;
import java.time.LocalDate;
import java.time.Period;
import java.sql.Date;


/**
 *
 * @author maryc
 */
public class Custumer  extends PersonDto {
    private Date dateOfBirth;
    private String phone;
    private String email;
    private String adress;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public Custumer(String id, String name, Date dateOfBirth, String email, String address) {
        super(id, name);
        this.dateOfBirth=dateOfBirth;
        this.email=email;
        this.adress=address;
        
    }
      public Custumer(String id, String name, Date dateOfBirth,String phone, String email, String address) {
        super(id, name);
        this.dateOfBirth=dateOfBirth;
        this.phone=phone;
        this.email=email;
        this.adress=address;
        
    }
      public int getAge(){
       return CalculateAge();
      }
    private int CalculateAge (){
           return Period.between(this.dateOfBirth.toLocalDate(), new Date(System.currentTimeMillis()).toLocalDate()).getYears();
    }
}
