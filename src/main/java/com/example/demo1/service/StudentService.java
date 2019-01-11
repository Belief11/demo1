package com.example.demo1.service;
import com.example.demo1.entity.Student;
import java.util.List;

public interface StudentService {



  // public Student findUserById(int id);

  // public void save(Student student);

  // public  void edit(Student student);

    // public void delete(int id);

   public Student addStudent(Student student);

   Student updateStudent(Student student);

   Student getStudentById(Integer stuID);

    public List<Student> getStudentList();

    public void  deleteStudent(Integer stuID);


}
