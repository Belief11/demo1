package com.example.demo1.service.serviceImpl;

import com.example.demo1.repository.StudentRepository;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo1.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private  StudentRepository studentRepository;



    public void save(Student student){
        studentRepository.save(student);
    }

    public Student findUserById(int id){
        return  studentRepository.findById(id);
    }

    public void edit(Student student){
        studentRepository.save(student);
    }

    public void delete(int id){
        studentRepository.deleteById(id);
    }

    public Student addStudent(Student student)
    {
       return  studentRepository.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }


    public void deleteStudent(Integer stuID)
    {
         studentRepository.deleteById(stuID);
    }

    public Student getStudentById(Integer stuID)
    {
      return studentRepository.findById(stuID).get();
    }

    public List<Student> getStudentList(){
        return studentRepository.findAll();
    }



}
