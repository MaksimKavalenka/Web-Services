package by.training.service.dao.impl;

import java.util.Collection;

import by.training.entity.TeacherEntity;
import by.training.service.dao.TeacherServiceDAO;
import by.training.service.memory.TeacherMemory;

public class TeacherServiceDAOImpl implements TeacherServiceDAO {

    @Override
    public void createTeacher(final TeacherEntity teacher) {
        TeacherMemory.getTeachers().put(teacher.getId(), teacher);
    }

    @Override
    public void updateTeacher(final TeacherEntity teacher) {
        TeacherMemory.getTeachers().put(teacher.getId(), teacher);
    }

    @Override
    public void deleteTeacher(final long id) {
        TeacherMemory.getTeachers().remove(id);
    }

    @Override
    public TeacherEntity getTeacher(final long id) {
        return TeacherMemory.getTeachers().get(id);
    }

    @Override
    public Collection<TeacherEntity> getTeachers() {
        return TeacherMemory.getTeachers().values();
    }

}
