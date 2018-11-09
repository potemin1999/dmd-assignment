package awesteam.dmd.model;

import lombok.Data;

@Data
public class Transaction {

    private int transactionId;
    private int amount;
    private int bankAcquirerId;
    private long sourceBankAccountNumber;
    private long destinationBankAccountNumber;

}
