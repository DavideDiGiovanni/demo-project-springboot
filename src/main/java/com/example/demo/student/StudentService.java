package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Dave",
                        "dave.jones@gmail.it",
                        LocalDate.of(1991, Month.JUNE, 5),
                        32
                )
        );
    }
}
