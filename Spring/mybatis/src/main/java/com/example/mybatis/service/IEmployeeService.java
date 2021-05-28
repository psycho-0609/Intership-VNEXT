package com.example.mybatis.service;

import com.example.mybatis.model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getEmployee();
    Employee getEmployeeById(Long id);
    void insertEmployee(Employee employee);
    void updateEmployee (Employee employee);
    void deleteEmployee(Long id);

}
