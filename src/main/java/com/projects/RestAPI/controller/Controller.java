package com.projects.RestAPI.controller;

import com.projects.RestAPI.entity.Student;
import com.projects.RestAPI.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Repository studRepo;
    //get all the students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studRepo.findAll();
    }

    @GetMapping("/students/{roll_no}")
    public Student getStudent(@PathVariable int roll_no){
        return studRepo.findById(roll_no).get();
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void  createStudent(@RequestBody Student student){
        studRepo.save(student);

    }

    @PutMapping("/student/update/{roll_no}")
    public  Student updateStudent(@PathVariable int roll_no){
        Student student =studRepo.findById(roll_no).get();
        student.setName("Pooja");
        student.setPercentage(92);
        studRepo.save(student);
        return  student;
    }

    @DeleteMapping("/student/delete/{roll_id}")
    public  void removeStudent(@PathVariable int roll_id){
        Student student = studRepo.findById(roll_id).get();
        studRepo.delete(student);
    }

}
