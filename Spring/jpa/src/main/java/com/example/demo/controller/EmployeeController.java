package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.inter.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/")
    public String findAll(Model model){
        model.addAttribute("emp",employeeService.findAll());
        return "index";
    }

    @GetMapping("/edit")
    public String add(@RequestParam(value ="id", required = false ) Long id, Model model){
        if(id != null){
            model.addAttribute("emp",employeeService.findById(id));
            return "update";
        }
        model.addAttribute("emp",new Employee());
        return "insert";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Employee employee, Model model){
        employeeService.insert(employee);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Employee employee){
        employeeService.update(employee);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        employeeService.delete(id);
        return "redirect:/";
    }
}
