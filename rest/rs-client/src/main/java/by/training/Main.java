package by.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.apache.commons.httpclient.HttpException;

import by.training.entity.LessonEntity;
import by.training.entity.TeacherEntity;
import by.training.executor.RESTExecutor;

public class Main {

    public static void main(final String[] args) throws HttpException, IOException, JAXBException {

        {
            List<LessonEntity> lessonsList = new ArrayList<>(2);
            lessonsList.add(new LessonEntity(1, "Mathematics", 2));
            lessonsList.add(new LessonEntity(2, "Physics", 1));

            Map<Long, LessonEntity> lessons = new HashMap<>(lessonsList.size());
            for (LessonEntity lesson : lessonsList) {
                lessons.put(lesson.getId(), lesson);
            }

            TeacherEntity teacher = new TeacherEntity(1, "John",
                    new GregorianCalendar(1978, 8, 3).getTime(), lessons);

            RESTExecutor.createTeacher(teacher);
        }

        RESTExecutor.getTeachers();

        {
            List<LessonEntity> lessonsList = new ArrayList<>(2);
            lessonsList.add(new LessonEntity(1, "Mathematics", 2));
            lessonsList.add(new LessonEntity(2, "Physics", 1));

            Map<Long, LessonEntity> lessons = new HashMap<>(lessonsList.size());
            for (LessonEntity lesson : lessonsList) {
                lessons.put(lesson.getId(), lesson);
            }

            TeacherEntity teacher = new TeacherEntity(1, "Jack",
                    new GregorianCalendar(1984, 5, 28).getTime(), lessons);
            RESTExecutor.updateTeacher(teacher);
        }

        {
            List<LessonEntity> lessonsList = new ArrayList<>(1);
            lessonsList.add(new LessonEntity(1, "Spanish", 3));

            Map<Long, LessonEntity> lessons = new HashMap<>(lessonsList.size());
            for (LessonEntity lesson : lessonsList) {
                lessons.put(lesson.getId(), lesson);
            }

            TeacherEntity teacher = new TeacherEntity(2, "Brad",
                    new GregorianCalendar(1989, 2, 17).getTime(), lessons);

            RESTExecutor.createTeacher(teacher);
        }

        RESTExecutor.getTeachers();
        RESTExecutor.getTeacher(2);

        {
            LessonEntity lesson = new LessonEntity(3, "Chemistry", 4);
            RESTExecutor.addLesson(1, lesson);
        }

        RESTExecutor.getTeachers();
        RESTExecutor.getTeacher(3);

        {
            List<LessonEntity> lessonsList = new ArrayList<>(1);
            lessonsList.add(new LessonEntity(1, "History", 2));

            Map<Long, LessonEntity> lessons = new HashMap<>(lessonsList.size());
            for (LessonEntity lesson : lessonsList) {
                lessons.put(lesson.getId(), lesson);
            }

            TeacherEntity teacher = new TeacherEntity(3, "Carl",
                    new GregorianCalendar(1968, 6, 21).getTime(), lessons);
            RESTExecutor.updateTeacher(teacher);
        }

        RESTExecutor.deleteTeacher(1);
        RESTExecutor.getTeachers();

    }

}
