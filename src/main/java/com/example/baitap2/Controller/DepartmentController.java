package com.example.baitap2.Controller;

import com.example.baitap2.Entity.Department;
import com.example.baitap2.Service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping
    public List<Department> getAll() {
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public Department create(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable Integer id, @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }

    @PatchMapping("/{id}/status")
    public void changeStatus(@PathVariable Integer id) {
        departmentService.changeStatus(id);
    }
}
