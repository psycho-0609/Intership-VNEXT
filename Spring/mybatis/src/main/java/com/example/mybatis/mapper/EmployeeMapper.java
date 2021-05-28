package com.example.mybatis.mapper;

import com.example.mybatis.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    void insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);

}
