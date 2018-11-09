package awesteam.dmd.model;

import lombok.Data;

import java.util.List;

@Data
public class DetailSupply {

    private List<Detail> attachedDetails;
    private DetailSupplyBill bill;
    private DetailProvider provider;

}
