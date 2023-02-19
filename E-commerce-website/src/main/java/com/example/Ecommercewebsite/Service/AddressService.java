package com.example.Ecommercewebsite.Service;

import com.example.Ecommercewebsite.Dao.AddressRepository;
import com.example.Ecommercewebsite.Model.AddressModel;
import com.example.Ecommercewebsite.Model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressRepository addressRepository;
    public AddressModel saveAddress(AddressModel address) {
        return addressRepository.save(address);
    }

    public List<AddressModel> findAllAddress() {
        return  addressRepository.findAll();
    }
//
    public AddressModel findAddressById(Integer addressId) {
        return addressRepository.findById(addressId).get();
    }
    public void deleteAddressById(Integer addressId) {
        addressRepository.deleteById(addressId);
    }
//    //
    public void updateAddressById(Integer addressId, AddressModel newAddress) {
        AddressModel address = findAddressById(addressId);
        address.setAddressName(newAddress.getAddressName());
        address.setAddressLandmark(newAddress.getAddressLandmark());
        address.setAddressZipcode(newAddress.getAddressZipcode());
        address.setAddressPhoneNumber(newAddress.getAddressPhoneNumber());
        addressRepository.save(address);
    }

}
