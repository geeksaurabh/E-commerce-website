package com.example.Ecommercewebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product_tbl")
public class ProductModel {
    @Id
    private Integer productId;
    private String productName;
   private Integer productPrice;
   private String productDescription;
   private String productCategory;
   private String productBrand;

}
