package com.example.Ecommercewebsite.Dao;

import com.example.Ecommercewebsite.Model.ProductModel;
import com.example.Ecommercewebsite.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,Integer> {

}
