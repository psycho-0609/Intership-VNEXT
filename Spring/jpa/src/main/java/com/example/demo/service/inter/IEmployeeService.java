package com.example.demo.service.inter;



import com.example.demo.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();
    Employee insert(Employee employee);
    Employee update(Employee employee);
    void delete(Long id);
    Employee findById(Long id);
}
