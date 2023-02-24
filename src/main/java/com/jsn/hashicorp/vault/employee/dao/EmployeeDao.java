package com.jsn.hashicorp.vault.employee.dao;

import com.jsn.hashicorp.vault.employee.modal.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
}
