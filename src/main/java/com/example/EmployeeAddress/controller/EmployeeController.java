package com.example.EmployeeAddress.controller;

import com.example.EmployeeAddress.model.Employee;
import com.example.EmployeeAddress.service.EmployeeService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {
@Autowired
   private  EmployeeService employeeService;

@PostMapping
    public String createEmployee(@RequestBody List<Employee> employeeList){
        return employeeService.addEmployee(employeeList);
}

  @GetMapping
    public String getAllemployee(@Nullable @RequestParam Long id){
        return employeeService.getEmployees(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployees(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService. updateEmployees(id,employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployeeById(id);
    }

}
