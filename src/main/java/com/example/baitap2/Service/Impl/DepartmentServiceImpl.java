package com.example.baitap2.Service.Impl;

import com.example.baitap2.Entity.Department;
import com.example.baitap2.Repository.DepartmentRepository;
import com.example.baitap2.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
        Department existing = getDepartmentById(id);
        if (existing != null) {
            existing.setName(department.getName());
            existing.setStatus(department.isStatus());
            return departmentRepository.save(existing);
        }
        return null;
    }

    @Override
    public void changeStatus(Integer id) {
        Department existing = getDepartmentById(id);
        if (existing != null) {
            existing.setStatus(!existing.isStatus());
            departmentRepository.save(existing);
        }
    }
}
