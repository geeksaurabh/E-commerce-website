package com.example.Ecommercewebsite.Controller;

import com.example.Ecommercewebsite.Model.AddressModel;
import com.example.Ecommercewebsite.Model.ProductModel;
import com.example.Ecommercewebsite.Service.AddressService;
import com.example.Ecommercewebsite.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1")
public class AddressController {
    @Autowired
    public AddressService addressService;

    @PostMapping("/add-address")
    public String addAddress( @RequestBody AddressModel address){
        addressService.saveAddress(address);
        return "address saved";
    }
    @GetMapping("/find-all-address")
    public List<AddressModel> findAllAddress() {
        return addressService.findAllAddress();
    }
    @GetMapping("/find-address-by-addressId/{addressId}")
    public AddressModel findAddressById(@PathVariable Integer addressId){
        return addressService.findAddressById(addressId);
    }
    @DeleteMapping("/delete-address-by-addressId/{addressId}")
    public void deleteAddressById(@PathVariable Integer addressId){
        addressService.deleteAddressById(addressId);
    }
    @PutMapping("update-address-by-addressId/{addressId}")
    public ResponseEntity<String> updateAddressById(@PathVariable Integer addressId, @RequestBody AddressModel address){
        addressService.updateAddressById(addressId,address);
        return new ResponseEntity<>("address updated", HttpStatus.CREATED);
    }
}
