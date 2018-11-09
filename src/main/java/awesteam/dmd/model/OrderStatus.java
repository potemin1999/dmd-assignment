package awesteam.dmd.model;

import lombok.Data;

@Data
public class OrderStatus {

    private boolean isServed;
    private boolean isWaiting;
    private boolean isServing;

}
