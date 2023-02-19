package com.example.Ecommercewebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "address_tbl")
public class AddressModel {
    @Id
    private Integer addressId;
    private String addressName;
    private String addressLandmark;
    private String addressPhoneNumber;
    private String addressZipcode;
    private String state;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private UserModel userModel;

}
