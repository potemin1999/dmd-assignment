package awesteam.dmd.model;

import lombok.Data;

import java.util.List;

@Data
public class ChargingStation {

    private int chargingStationId;
    private String gpsLocation;
    private int chargingCost;
    private int freeSlots;
    private int totalSlots;
    private List<ChargingPlug> plugs;
    private List<Car> chargingCars;

}
