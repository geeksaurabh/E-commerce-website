package com.example.Ecommercewebsite.Controller;

import com.example.Ecommercewebsite.Model.ProductModel;
import com.example.Ecommercewebsite.Model.UserModel;
import com.example.Ecommercewebsite.Service.ProductService;
import com.example.Ecommercewebsite.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/app/v1")

public class ProductController {
    @Autowired
    public ProductService productService;

    @PostMapping("/add-product")
    public String addProduct( @RequestBody ProductModel product){
        productService.saveProduct(product);
        return "product saved";
    }
    @GetMapping("/find-all-product")
    public List<ProductModel> findAllProduct() {
        return productService.findAllProduct();
    }
    @GetMapping("/find-product-by-productId/{productId}")
    public ProductModel findProductById(@PathVariable Integer productId){
        return productService.findProductById(productId);
    }
    @DeleteMapping("/delete-product-by-productId/{productId}")
    public void deleteProductById(@PathVariable Integer productId){
        productService.deleteProductById(productId);
    }
    @PutMapping("update-product-by-productId/{productId}")
    public ResponseEntity<String> updateProductById(@PathVariable Integer productId, @RequestBody ProductModel product){
        productService.updateProductById(productId,product);
        return new ResponseEntity<>("user updated", HttpStatus.CREATED);
    }
}
