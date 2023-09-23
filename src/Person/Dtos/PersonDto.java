/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person.Dtos;

/**
 *
 * @author maryc
 */
public abstract class PersonDto {
    private String id;
    private String name;

    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public PersonDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
