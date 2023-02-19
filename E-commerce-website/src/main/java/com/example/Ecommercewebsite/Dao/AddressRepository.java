package com.example.Ecommercewebsite.Dao;

import com.example.Ecommercewebsite.Model.AddressModel;
import com.example.Ecommercewebsite.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressModel,Integer> {

}
