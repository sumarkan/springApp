package com.example.SpringDemo.controller;

import com.example.SpringDemo.models.Employee;
import com.example.SpringDemo.service.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    ServiceHandler serviceHandler;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return serviceHandler.getEmployeeList();
    }
}
