package ru.hogwartswithbd.schoolwithbd.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwartswithbd.schoolwithbd.model.Faculty;
import ru.hogwartswithbd.schoolwithbd.service.FacultyService;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("faculty")
public class FacultyController {


    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping //POST localhost:8080/faculty/1
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.createFaculty(faculty);
    }

    @GetMapping("{id}") //GET http://localhost:8080/faculties/1
    public ResponseEntity<Faculty> getFacultyInfo(@PathVariable long id) {
        Faculty faculty = facultyService.findFaculty(id);
        if (faculty == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PutMapping //PUT localhost:8080/faculties/1
    public Faculty editFaculty(Faculty faculty) {
        return facultyService.editFaculty(faculty);
    }

    @DeleteMapping("{id}") //DELETE http://localhost:8080/faculties/1
    public ResponseEntity<Faculty> deleteFaculty(@PathVariable long id) {
        facultyService.deleteAllFaculty(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping() //DELETE http://localhost:8080/faculty/1
    public ResponseEntity<Void> deleteAllFaculty(Faculty faculty) {
        facultyService.deleteAllFaculty(faculty);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/find") // http://localhost:8080/faculty/find
    public Collection<Faculty> getFaculty() {
        return facultyService.showAllFaculty();
    }

    @GetMapping
    public ResponseEntity<Collection<Faculty>> findFaculties(@RequestParam(required = false) String color) {
        if (color != null && !color.isBlank()) {
            return ResponseEntity.ok(facultyService.findByColor(color));
        }
        return ResponseEntity.ok(Collections.emptyList());
    }

}
