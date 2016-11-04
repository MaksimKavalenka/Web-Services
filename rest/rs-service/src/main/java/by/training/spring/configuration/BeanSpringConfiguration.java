package by.training.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import by.training.service.dao.TeacherServiceDAO;
import by.training.service.dao.impl.TeacherServiceDAOImpl;

@Configuration
public class BeanSpringConfiguration {

    @Bean
    public TeacherServiceDAO teacherService() {
        return new TeacherServiceDAOImpl();
    }

}
