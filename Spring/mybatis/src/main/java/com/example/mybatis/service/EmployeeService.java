package com.example.mybatis.service;

import com.example.mybatis.mapper.EmployeeMapper;
import com.example.mybatis.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmployee() {
        return employeeMapper.getEmployees();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public void insertEmployee(Employee employee) {
         employeeMapper.insertEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeMapper.deleteEmployee(id);
    }


}
