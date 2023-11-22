package dataModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Claim {
    private String treatmentDate;
    private String firstAdvised;
    private String firstNotification;
    private String manifestationDate;
    private String claimTotal;
}
