package com.example.Ecommercewebsite.Dao;

import com.example.Ecommercewebsite.Model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel,Integer> {
}
