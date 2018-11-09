package awesteam.dmd.model;

import lombok.Data;

@Data
public class CarStatus {

    private boolean isFree;
    private float fuelLevel;
    private boolean isRepairRequired;

}
