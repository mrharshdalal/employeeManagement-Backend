# employeeManagement-Backend

# Employee Management System (Spring)

A simple Employee Management System built using the Spring framework with MySQL database and JPA Repository. This project provides essential CRUD (Create, Read, Update, Delete) operations for employee data.

## Features

- **Get All Employees:** Retrieve a list of all employees.
- **Add Employee:** Add a new employee to the system.
- **Delete Employee:** Remove an existing employee from the system.
- **Update Employee:** Modify employee details.
- **Find Employee by ID:** Search for a specific employee using their unique identifier.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL Database

## Project Structure

![image](https://github.com/mrharshdalal/employeeManagement-Backend/assets/64740456/0fcaabca-bd12-45e5-aeb0-13e89b7b9b5d)

## Database Configuration

- Create a MySQL database and configure the connection details in `application.properties`.

## Frontend (Angular)

For the frontend part of this Employee Management System, you can check out the Angular repository available in [this GitHub repository](https://github.com/mrharshdalal/employeeManagement-Frontend). The Angular frontend provides a user-friendly interface to interact with the backend services, ensuring a seamless experience for managing employee data.


## Screenshots

![1](https://github.com/mrharshdalal/employeeManagement-Backend/assets/64740456/7c87d252-fc5f-4984-883f-35862bec8ed7)

![2](https://github.com/mrharshdalal/employeeManagement-Backend/assets/64740456/2bf0ebd9-f577-4408-b499-c645384417b6)

![3](https://github.com/mrharshdalal/employeeManagement-Backend/assets/64740456/4a297b18-9972-4b65-80aa-481407bbf179)

![4](https://github.com/mrharshdalal/employeeManagement-Backend/assets/64740456/03d0faef-7633-4024-b1ad-b1a120ac140b)

## Setup

1. **Build and Run:**
   - Build the project using Maven: `mvn clean install`.
   - Run the application: `mvn spring-boot:run` or execute the JAR file generated.

2. **Access APIs:**
   - Use tools like Postman to interact with the following APIs:
     - `GET /employees`: Retrieve all employees.
     - `POST /employees`: Add a new employee.
     - `DELETE /employees/{id}`: Delete an employee by ID.
     - `PUT /employees/{id}`: Update an employee by ID.
     - `GET /employees/{id}`: Find an employee by ID.

