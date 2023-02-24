package com.jsn.hashicorp.vault.employee.controller;


import com.jsn.hashicorp.vault.employee.modal.Employee;
import com.jsn.hashicorp.vault.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> firstPage() {
        return empService.getAllEmployees();
    }
}
