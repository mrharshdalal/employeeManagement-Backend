package com.codewithme.employeeManagement.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithme.employeeManagement.exception.UserNotFoundException;
import com.codewithme.employeeManagement.model.Employee;
import com.codewithme.employeeManagement.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
            .orElseThrow(()-> new UserNotFoundException("User by id "+ id + " was not found"));
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployee(Long id){
        // employeeRepository.deleteEmployeeById(id);

        try {
            employeeRepository.deleteEmployeeById(id);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
    }
    
}
