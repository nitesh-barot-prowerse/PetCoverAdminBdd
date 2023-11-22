package dataModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientDetails {
    private String firstName;

    private String lastName;

    private String birthDate;

    private String addressCode;

    private String email;

    private String primaryContactNumber;

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(String birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public String getAddressCode() {
//        return addressCode;
//    }
//
//    public void setAddressCode(String addressCode) {
//        this.addressCode = addressCode;
//    }
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPrimaryContactNumber() {
//        return primaryContactNumber;
//    }
//
//    public void setPrimaryContactNumber(String primaryContactNumber) {
//        this.primaryContactNumber = primaryContactNumber;
//    }





}
