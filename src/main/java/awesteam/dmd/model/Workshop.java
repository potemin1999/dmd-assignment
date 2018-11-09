package awesteam.dmd.model;

import lombok.Data;

import java.util.List;

@Data
public class Workshop {

    private int workshopId;
    private String workshopAddress;
    private List<Detail> storedDetails;

}
