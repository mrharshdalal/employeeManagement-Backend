package com.codewithme.employeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}


// spring.jpa.hibernate.ddl-auto=update
// spring.datasource.url=jdbc:mysql://localhost:3306/employeemanagement

// spring.datasource.username=root
// spring.datasource.password=toor
// spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
// spring.jpa.show-sql: true
// spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
