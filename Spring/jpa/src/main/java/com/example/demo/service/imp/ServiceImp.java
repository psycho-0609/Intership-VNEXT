package com.example.demo.service.imp;


import com.example.demo.entity.Employee;
import com.example.demo.repository.IEmployeeRepo;
import com.example.demo.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImp implements IEmployeeService {

    @Autowired
    private IEmployeeRepo employeeRepo;

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee insert(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee findById(Long id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        return employee.get();
    }

}
