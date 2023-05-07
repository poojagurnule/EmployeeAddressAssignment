package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.repository.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private IAddressDao addressDao;


    public String addAddress(List<Address> address) {
        List<Address> addressList = addressDao.saveAll(address);
        if(addressList != null){
            return "Added successfully";
        }else{
            return "Not added successfully";
        }
    }

    public ResponseEntity<Void> deleteAddressById(Long id) {
        Optional<Address> address = addressDao.findById(id);
        if (address.isPresent()) {
            addressDao.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    public ResponseEntity<Address> updateAddress(Long id, Address address) {
        Optional<Address> existingAddress = addressDao.findById(id);
        if (existingAddress.isPresent()) {
            address.setId(id);
            Address savedAddress = addressDao.save(address);
            return ResponseEntity.ok(savedAddress);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public List<Address> getAddress(Long addressId) {
        if(addressId == null){
            return addressDao.findAll();
        }else{
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressDao.findById(addressId).get());
            return addressList;
        }
    }
}
