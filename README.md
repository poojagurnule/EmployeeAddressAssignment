<h1 align = "center"> Employee Management System </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This is a backend API built using the Spring framework that handles various HTTP requests for Employee and Address entity classes.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.url=jdbc:mysql://localhost:3306/<databaseName>
spring.datasource.username=<userName>
spring.datasource.password=<password>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* Employee
```
id (Long)
first name (String)
lastName (String)
address (Address)
```

* Address
```
id (Long)
street (String)
City (String)
state (String)
Zipcode (String)
```
## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:

```
EmployeeController:
/employees (GET): Get all employees 
/employees (GET): Get an employee by ID (Pass Id in Request param)
/employees (POST): Create a new employee
/employee/{employeeId} (PUT): Update an employee by ID
/employee/{employeeId} (DELETE): Delete an employee by ID
```

AddressController:
```
/address (GET): Get all addresses 
/address (GET): Get an address by ID (request param)
/address (POST): Create a new address
/address/{addressId} (PUT): Update an address by ID
/address/{addressId} (DELETE): Delete an address by ID
```
<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

This API provides basic functionality for managing Employees and Addresses, allowing users to create, update, retrieve, and delete records. 
The project can be extended to include additional features as required.

## Author

👤 **Pooja Gurnule**

* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)



---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").

---

## Show your support

Give a ⭐️ if this project helped you!

---

## 📝 License

Copyright © 2023 [Pooja Gurnule](https://github.com/poojagurnule).<br />

This project is [MIT]("url") licensed.

---
