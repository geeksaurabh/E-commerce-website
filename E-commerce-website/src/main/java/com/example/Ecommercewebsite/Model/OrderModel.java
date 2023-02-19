package com.example.Ecommercewebsite.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "order_tbl")
public class OrderModel {
//    id:integer
    @Id
    private Integer orderId;
    private Integer orderQuantity;

    //    private UserModel userModel;
//    productID:integer(foreign key mapping)
//    @JoinColumn(name = "product_id")
//    @OneToOne
//    private ProductModel productModel;
//    addressID:integer(foreign key mapping)
//    @JoinColumn(name = "address_id")
//    @OneToOne
//    private AddressModel addressModel;
//    productQuantity:integer


}
