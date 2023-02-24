package com.jsn.hashicorp.vault.employee.service;

import com.jsn.hashicorp.vault.employee.dao.EmployeeDao;
import com.jsn.hashicorp.vault.employee.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;


    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();

    }


}
