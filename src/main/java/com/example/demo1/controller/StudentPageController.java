package com.example.demo1.controller;

import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.example.demo1.entity.Student;
import java.util.List;
@Controller
@RequestMapping("web")
public class StudentPageController {

  @Autowired
    private StudentService studentService;

   @GetMapping("/all")
    public String getAllStudent(Model model)
   {
       List <Student>  lists=studentService.getStudentList();
       model.addAttribute("stus",lists);
       return "index";
   }


   @RequestMapping("/dept/edit/{id}")
   public String upadatestudent(Model  model,@PathVariable("id") Integer stuID) {
       Student student=studentService.getStudentById(stuID);
       model.addAttribute("student",student);

    return "student/studentEdit";
   }

   @RequestMapping("/toupdate")
    public String toupdatestudent(Model model,Student student){
       studentService.updateStudent(student);
       List <Student> list=studentService.getStudentList();
       model.addAttribute("stus",list);
       return "index";
   }


   @RequestMapping("/add")
   public String add()
   {
       return "student/studentAdd";
   }

   @RequestMapping("/toadd")
    public String toAdd(Model model,Student student)
   {
       studentService.addStudent(student);
       List <Student> lists=studentService.getStudentList();
       model.addAttribute("stus",lists);
       return "index";
   }

   @RequestMapping("/web/dept/del/{id}")
    public String todelete(Model model,@PathVariable("id") Integer stuID)
   {
       studentService.deleteStudent(stuID);
       List <Student> lists=studentService.getStudentList();
       model.addAttribute("stus",lists);
       return "index";
   }


}
