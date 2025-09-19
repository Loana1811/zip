package com.example.baitap2.Service;


import com.example.baitap2.Entity.Department;

import java.util.List;


public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    Department saveDepartment(Department department);
    Department updateDepartment(Integer id, Department department);
    void changeStatus(Integer id);
}
