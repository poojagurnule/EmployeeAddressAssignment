package com.example.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private  Long id ;
     private  String firstName ;
     private  String lastName;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name =  "fk_employee-addressTable-addId")
     private Address address;
}
