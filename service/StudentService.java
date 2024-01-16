package ru.hogwartswithbd.schoolwithbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwartswithbd.schoolwithbd.model.Student;
import ru.hogwartswithbd.schoolwithbd.repository.StudentRepository;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentService() {
    }

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createdStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public void deleteAllStudents(Student student) {
        studentRepository.deleteAll();
    }

    public Collection<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public List<Student> findStudentByAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

    public List<Student> findStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }
}
