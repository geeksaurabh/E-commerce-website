package com.example.Ecommercewebsite.Service;

import com.example.Ecommercewebsite.Dao.ProductRepository;
import com.example.Ecommercewebsite.Model.ProductModel;
import com.example.Ecommercewebsite.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;
    public ProductModel saveProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public List<ProductModel> findAllProduct() {
        return  productRepository.findAll();
    }

    public ProductModel findProductById(Integer productId) {
        return productRepository.findById(productId).get();
    }
    public void deleteProductById(Integer productId) {
        productRepository.deleteById(productId);
    }
//
    public void updateProductById(Integer productId, ProductModel newProduct) {
        ProductModel product = findProductById(productId);
        product.setProductName(newProduct.getProductName());
        product.setProductBrand(newProduct.getProductBrand());
        product.setProductDescription(newProduct.getProductDescription());
        product.setProductCategory(newProduct.getProductCategory());
        product.setProductPrice(newProduct.getProductPrice());
        productRepository.save(product);
    }
}
