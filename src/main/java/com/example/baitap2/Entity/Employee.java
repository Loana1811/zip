package com.example.baitap2.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String address;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private com.example.baitap2.Entity.Department department;

    private boolean status;
}
