package com.example.mybatis.controller;

import com.example.mybatis.model.Employee;
import com.example.mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> findAll(){
        return new ResponseEntity<>(employeeService.getEmployee(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> insert(@RequestBody Employee employee){
        employeeService.insertEmployee(employee);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id)
    {
        employeeService.deleteEmployee(id);
        return "delete: "+id;
    }

}
