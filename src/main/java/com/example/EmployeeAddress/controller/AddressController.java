package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Address;
import com.example.EmployeeAddress.service.AddressService;
import io.micrometer.common.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public String createAddress(@RequestBody List<Address> address){
        return addressService.addAddress(address);
    }
@GetMapping
    public List<Address> getAddress (@Nullable @RequestParam Long id){
        return addressService.getAddress(id);
    }

    @PutMapping("/id")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        return addressService.deleteAddressById(id);
    }

}
