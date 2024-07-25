package com.perscholas.spRegistration.controller;

import com.perscholas.spRegistration.entity.Student;
import com.perscholas.spRegistration.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
@Controller
public class studentDController {
    @Autowired
    private StudentService service;


    List<String> courses;

   @ModelAttribute
    public void preLoad() {
        courses = new ArrayList<String>();
        courses.add("C");
        courses.add("CPP");
        courses.add("Java");
    }
    @RequestMapping(value = "/Registration" , method = RequestMethod.GET)
    public String home(Model model, Student student) {
        model.addAttribute("courses", courses);
        return "register";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String register(@ModelAttribute("student") Student student, Model model) {
        System.out.println("get courses:::"+student.getCourse());
        service.save(student);
        return "welcome";
    }
}


