package ru.hogwartswithbd.schoolwithbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.hogwartswithbd.schoolwithbd.model.Faculty;

import java.util.List;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    List<Faculty> findByName (String name);
    List<Faculty> findByColor (String color);
}
