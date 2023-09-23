/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Dtos;

import Person.Dtos.PersonDto;

/**
 *
 * @author maryc
 */
public class UserDto extends PersonDto {
    private String userName;
    private int password;

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }
    
    public UserDto(String id, String name, String userName, int password) {
        super(id, name);
        this.userName=userName;
        this.password=this.password;
    }

}
