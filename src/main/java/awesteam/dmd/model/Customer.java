package awesteam.dmd.model;

import lombok.Data;

@Data
public class Customer {

    private String customerName;
    private String customerSurname;
    private String location;
    private String email;
    private String phoneNumber;

}
