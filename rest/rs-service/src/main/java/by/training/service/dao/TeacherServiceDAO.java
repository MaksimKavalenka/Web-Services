package by.training.service.dao;

import java.util.Collection;

import by.training.entity.TeacherEntity;

public interface TeacherServiceDAO {

    void createTeacher(TeacherEntity teacher);

    void updateTeacher(TeacherEntity teacher);

    void deleteTeacher(long id);

    TeacherEntity getTeacher(long id);

    Collection<TeacherEntity> getTeachers();

}
