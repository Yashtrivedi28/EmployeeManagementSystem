package demoapis.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//import lom
//@Buildern
@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String houseNo;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}
