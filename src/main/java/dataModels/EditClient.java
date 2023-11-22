package dataModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditClient {
    private String firstName;

    private String lastName;

    private String birthDate;

    private String addressCode;

    private String email;

    private String primaryContactNumber;
}
