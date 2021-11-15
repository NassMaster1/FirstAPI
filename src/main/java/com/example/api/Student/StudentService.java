package com.example.api.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final  StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void addNexStudent(Student student) {
        Optional<Student> studentByEmail=studentRepository.findStudentByemail(student.getEmail());

        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id){
       boolean exist= studentRepository.existsById(id);
       if(!exist)
       {
           throw new IllegalStateException("student does not exist id: "+ id);
       }
       studentRepository.deleteById(id);
    }
}