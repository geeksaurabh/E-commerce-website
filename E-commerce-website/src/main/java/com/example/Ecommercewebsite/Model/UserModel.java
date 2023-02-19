package com.example.Ecommercewebsite.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_tbl")
public class UserModel {
    @Id
    private Integer userId;

    private String userName;

    private String userEmail;

    private String userPassword;

    private String userPhoneNumber;
}
