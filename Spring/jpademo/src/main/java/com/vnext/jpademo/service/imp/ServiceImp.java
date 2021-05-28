package com.vnext.jpademo.service.imp;

import com.vnext.jpademo.entity.Employee;
//import com.vnext.jpademo.repository.IEmployeeRepo;
import com.vnext.jpademo.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements IEmployeeService {

//    @Autowired
//    private IEmployeeRepo employeeRepo;
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepo.findAll();
//    }
//
//    @Override
//    public Employee insert(Employee employee) {
//        return employeeRepo.save(employee);
//    }
//
//    @Override
//    public Employee update(Employee employee) {
//        return employeeRepo.save(employee);
//    }
//
//    @Override
//    public void delete(Long id) {
//        employeeRepo.deleteById(id);
//    }
}
