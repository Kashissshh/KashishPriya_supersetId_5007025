package com.employeemanagementsystem.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagementsystem.employee.entity.Department;
import com.employeemanagementsystem.employee.repo.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id).orElse(null);
    }
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }
    public List<Department> getDepartmentByName(String name){
        return departmentRepository.findByName(name);
    } 
}