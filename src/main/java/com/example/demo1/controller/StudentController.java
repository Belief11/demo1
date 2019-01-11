package com.example.demo1.controller;

import com.example.demo1.entity.Student;
import com.example.demo1.repository.StudentRepository;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

import javax.annotation.Resource;

@RestController
@RequestMapping("stu")
public class StudentController {
    @Resource
    @Autowired

    StudentService studentService;

    @PostMapping("/toyouadd")
    private Student addStudent(Student student)
    {
        return studentService.addStudent(student);
    }



    @PutMapping("/updatestu")
    private Student  updateStudent(Student student)
    {
        return studentService.updateStudent(student);
    }

    @GetMapping("all")
    private List getStudentList()
    {
        return studentService.getStudentList();
    }

    @GetMapping("getbyid/{id}")
    private Student getStudentById(@PathVariable("id") Integer stuID)
    {
        return studentService.getStudentById(stuID);
    }
    @DeleteMapping("del/{id}")

    private  void deleStudent(@PathVariable("id") Integer stuID)
    {
        studentService.deleteStudent(stuID);
    }




    /*@RequestMapping("/add")
    public String add(Student student) {
        studentService.save(student);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,int id) {
        Student student=studentService.findUserById(id);
        model.addAttribute("student", student);
        return "student/studentEdit";
    }

    @RequestMapping("/edit")
    public String edit(Student student) {
        studentService.edit(student);
        return "redirect:/list";
    }

    @PostMapping("/")
    public String index(){
        return "redirect:/list";

    }

    @PostMapping("/list")

    public String list(Model model)
    {
        List <Student>   students=studentService.getStudentList();
        model.addAttribute("students" ,students);
        return ("student/list");
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "student/studentAdd";
    }

 */



}
