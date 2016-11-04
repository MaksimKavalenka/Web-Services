package by.training.controller.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import by.training.entity.LessonEntity;
import by.training.entity.TeacherEntity;
import by.training.service.dao.TeacherServiceDAO;

@RestController
@RequestMapping("/teachers")
public class TeacherRestController {

    @Autowired
    private TeacherServiceDAO teacherService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> createTeacher(@RequestBody final TeacherEntity teacher) {
        teacherService.createTeacher(teacher);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> updateTeacher(@RequestBody final TeacherEntity teacher) {
        if (teacherService.getTeacher(teacher.getId()) == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        teacherService.updateTeacher(teacher);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteTeacher(@PathVariable(value = "id") final long id) {
        teacherService.deleteTeacher(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TeacherEntity> getTeacher(@PathVariable(value = "id") final long id) {
        TeacherEntity teacher = teacherService.getTeacher(id);
        if (teacher == null) {
            return new ResponseEntity<TeacherEntity>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TeacherEntity>(teacher, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<TeacherEntity>> getTeachers() {
        Collection<TeacherEntity> teachers = teacherService.getTeachers();
        return new ResponseEntity<Collection<TeacherEntity>>(teachers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{teacherId}/lesson", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Void> addLesson(@PathVariable(value = "teacherId") final long teacherId,
            @RequestBody final LessonEntity lesson) {
        TeacherEntity teacher = teacherService.getTeacher(teacherId);
        if (teacher == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        teacher.getLessons().put(lesson.getId(), lesson);
        teacherService.updateTeacher(teacher);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
