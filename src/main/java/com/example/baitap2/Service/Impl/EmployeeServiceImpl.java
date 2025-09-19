package com.example.baitap2.Service.Impl;

import com.example.baitap2.Entity.Employee;
import com.example.baitap2.Repository.EmployeeRepository;
import com.example.baitap2.Service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existing = getEmployeeById(id);
        if (existing != null) {
            existing.setFullName(employee.getFullName());
            existing.setAddress(employee.getAddress());
            existing.setPhone(employee.getPhone());
            existing.setStatus(employee.isStatus());
            existing.setDepartment(employee.getDepartment());
            return employeeRepository.save(existing);
        }
        return null;
    }

    @Override
    public void changeStatus(Integer id) {
        Employee existing = getEmployeeById(id);
        if (existing != null) {
            existing.setStatus(!existing.isStatus());
            employeeRepository.save(existing);
        }
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
