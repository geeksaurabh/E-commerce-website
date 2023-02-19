package com.example.Ecommercewebsite.Controller;

import com.example.Ecommercewebsite.Model.AddressModel;
import com.example.Ecommercewebsite.Model.OrderModel;
import com.example.Ecommercewebsite.Service.AddressService;
import com.example.Ecommercewebsite.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1")
public class OrderController {
    @Autowired
    public OrderService orderService;

    @PostMapping("/add-order")
    public String addOrder( @RequestBody OrderModel order){
        orderService.saveOrder(order);
        return "order saved";
    }
    @GetMapping("/find-all-order")
    public List<OrderModel> findAllOrder() {
        return orderService.findAllOrder();
    }
    @GetMapping("/find-order-by-orderId/{orderId}")
    public OrderModel findOrderById(@PathVariable Integer orderId){
        return orderService.findOrderById(orderId);
    }
    @DeleteMapping("/delete-order-by-orderId/{orderId}")
    public void deleteOrderById(@PathVariable Integer orderId){
        orderService.deleteOrderById(orderId);
    }
    @PutMapping("update-order-by-orderId/{orderId}")
    public ResponseEntity<String> updateOrderById(@PathVariable Integer orderId, @RequestBody  OrderModel order){
        orderService.updateOrderById(orderId,order);
        return new ResponseEntity<>("order updated", HttpStatus.CREATED);
    }
}
