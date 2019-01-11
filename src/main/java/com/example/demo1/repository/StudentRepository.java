package com.example.demo1.repository;

import com.example.demo1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

   Student findById(int id);
   int deleteById(int id);
}

