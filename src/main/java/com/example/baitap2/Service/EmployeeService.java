package com.example.baitap2.Service;


import com.example.baitap2.Entity.Employee;

import java.util.List;

public interface EmployeeService {
        List<Employee> getAllEmployees();
        Employee getEmployeeById(Integer id);
        Employee saveEmployee(Employee employee);
        Employee updateEmployee(Integer id, Employee employee);
        void changeStatus(Integer id);
        void deleteEmployee(Integer id);
}
