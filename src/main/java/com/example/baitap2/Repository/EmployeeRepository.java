package com.example.baitap2.Repository;

import com.example.baitap2.Entity.Department;
import com.example.baitap2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByDepartment(Department department);

    ScopedValue<Object> findById(int employeeId);
}
