package com.example.Ecommercewebsite.Service;

import com.example.Ecommercewebsite.Dao.AddressRepository;
import com.example.Ecommercewebsite.Dao.OrderRepository;
import com.example.Ecommercewebsite.Model.AddressModel;
import com.example.Ecommercewebsite.Model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;
    public OrderModel saveOrder(OrderModel order) {
        return orderRepository.save(order);
    }
//
    public List<OrderModel> findAllOrder() {
        return  orderRepository.findAll();
    }
//    //
    public OrderModel findOrderById(Integer orderId) {
        return orderRepository.findById(orderId).get();
    }
    public void deleteOrderById(Integer orderId) {
        orderRepository.deleteById(orderId);
    }
    //    //
    public void updateOrderById(Integer orderId, OrderModel newOrder) {
        OrderModel order = findOrderById(orderId);
        order.setOrderId(newOrder.getOrderId());
        order.setOrderQuantity(newOrder.getOrderQuantity());
        orderRepository.save(order);
    }
}
