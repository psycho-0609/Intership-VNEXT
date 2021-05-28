package com.vnext.jpademo.controller;

import com.vnext.jpademo.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/")
    public String findAll(Model model){
//        model.addAttribute("emp",employeeService.findAll());
        return "index";
    }
}
