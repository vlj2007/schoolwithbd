package ru.hogwartswithbd.schoolwithbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwartswithbd.schoolwithbd.exception.BadRequestException;
import ru.hogwartswithbd.schoolwithbd.model.Faculty;
import ru.hogwartswithbd.schoolwithbd.model.Student;
import ru.hogwartswithbd.schoolwithbd.repository.FacultyRepository;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public FacultyService() {
    }

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(Long id) {
        return facultyRepository.findById(id).orElseThrow(() -> new BadRequestException("Отсутствует id"));
    }

    public void deleteAllFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public void deleteAllFaculty(Faculty faculty) {
        facultyRepository.deleteAll();

    }

    public List<Faculty> showAllFaculty() {
        return facultyRepository.findAll();
    }

    public List<Faculty> findByName(String name) {
        return facultyRepository.findByName(name);
    }

    public List<Faculty> findByColor(String color) {
        return facultyRepository.findByColor(color);
    }


}
