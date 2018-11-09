package awesteam.dmd.model;

import lombok.Data;

@Data
public class Order {

    private int orderId;
    private long creationTime;
    private String location;
    private String destination;
    private int pathLength;
    private long tripDuration;
    private int selectedCarId;
    private Customer owner;
    private OrderPaymentRequest paymentRequest;
    private OrderStatus status;

}
