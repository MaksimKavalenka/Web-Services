package by.training.service.memory;

import java.util.HashMap;
import java.util.Map;

import by.training.entity.TeacherEntity;

public abstract class TeacherMemory {

    static {
        teachers = new HashMap<>();
    }

    private static Map<Long, TeacherEntity> teachers;

    public static Map<Long, TeacherEntity> getTeachers() {
        return teachers;
    }

    public static void setTeachers(final Map<Long, TeacherEntity> teachers) {
        TeacherMemory.teachers = teachers;
    }

}
