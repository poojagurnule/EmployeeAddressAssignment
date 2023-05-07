package com.example.EmployeeAddress.service;

import com.example.EmployeeAddress.model.Employee;
import com.example.EmployeeAddress.repository.IEmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private IEmployeeDao employeeDao ;


    public String  addEmployee(List<Employee> employeeList) {
      List<Employee> list =  employeeDao.saveAll(employeeList);
        if(list != null){
               return "Added Suceesfully" ;
        }
        return "Not added successfully" ;
    }


    public String getEmployees(Long id) {
        if(id == null){
               return employeeDao.findAll().toString();
        }else{
            List<Employee> employeeList = new ArrayList<>();
            Optional<Employee> list = employeeDao.findById(id);
            if(list.isEmpty()){
                   return  "Employee with " + id + " not found" ;
            }
            employeeList.add(employeeDao.findById(id).get());
            return  employeeList.toString();
        }
    }

    public ResponseEntity<Employee> updateEmployees(Long id, Employee employee) {
        Optional<Employee> existingEmployee = employeeDao.findById(id);
        if(existingEmployee.isPresent()){
               employee.setId(id);
               return ResponseEntity.ok(employeeDao.save(employee));
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteEmployeeById(Long id) {
          Optional<Employee> employee = employeeDao.findById(id);
          if(employee.isPresent()){
                  employeeDao.deleteById(id);
                  return ResponseEntity.noContent().build();
          }else {
              return ResponseEntity.notFound().build();
          }
    }
}
