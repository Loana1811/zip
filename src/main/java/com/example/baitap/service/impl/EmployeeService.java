package com.example.baitap.service.impl;

import com.example.baitap.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee getById(Integer id);
    Employee save(Employee employee);
    void delete(Integer id);
}
