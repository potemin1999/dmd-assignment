package awesteam.dmd.model;

import lombok.Data;

@Data
public class Car {

    private int carId;
    private String registrationNumber;
    private CarModel model;
    private CarStatus status;
    private CarColor color;

}
