package com.example.SpringDemo.service;

import com.example.SpringDemo.models.Employee;
import com.example.SpringDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceHandler {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeList() {

        employeeRepository.save(buildEmployee());
        employeeRepository.save(buildEmployee1());
        return employeeRepository.findAll();
    }

    private Employee buildEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Nihanth");
        employee.setLastName("Kandukuri");
        return employee;
    }

    private Employee buildEmployee1() {
        Employee employee = new Employee();
        employee.setFirstName("Ruthvik");
        employee.setLastName("Kandukuri");
        return employee;
    }
}
