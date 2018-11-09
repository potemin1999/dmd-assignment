package awesteam.dmd.model;

import lombok.Data;

import java.util.List;

@Data
public class TransactionHistoryList {

    private long lastUpdateTime;
    private List<Transaction> transactionList;

}
