package com.example.jdbc_tutorial;

import com.example.jdbc_tutorial.dao.DAO;
import com.example.jdbc_tutorial.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JdbcTutorialApplication {

    private static DAO<Course> dao;

    public JdbcTutorialApplication(DAO<Course> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcTutorialApplication.class, args);

        System.out.println("\n Create Course ------------------- \n");
        Course springVue = new Course("Spring Boot + Vue", "New Course", "https://youtube.com");
        dao.create(springVue);

        System.out.println("\n One Course ------------------- \n");
        Optional<Course> firstOne = dao.get(1);
        System.out.println(firstOne.get());

        springVue.setDescription("Learn how to use Spring Boot with Vue");
        dao.update(springVue, 6);

        dao.delete(4);

        System.out.println("\n All Courses ------------------- \n");
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);
    }

}
