package com.example.EmployeeAddress.repository;

import com.example.EmployeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<Address , Long> {
}
