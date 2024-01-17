package ru.hogwartswithbd.schoolwithbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwartswithbd.schoolwithbd.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentByAge(int age);

    List<Student> findStudentByName(String name);


}
