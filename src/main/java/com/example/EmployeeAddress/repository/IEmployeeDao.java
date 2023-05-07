package com.example.EmployeeAddress.repository;

import com.example.EmployeeAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee,Long>{

}
