package awesteam.dmd.model;

import lombok.Data;

@Data
public class OrderPaymentRequest {

    private int amount;
    private int sourceAccountNumber;
    private String signature;
    private long date;

}
