package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aurionpro.model.IStudentService;
import com.aurionpro.model.Student;

class StudentTest {

    private IStudentService studentService;
    private Student student;

    @BeforeEach
    void init() {
        studentService = Mockito.mock(IStudentService.class);
        student = new Student(studentService);
    }

    @Test
    void testCalculatePercentage() {
        Mockito.when(studentService.getMarks()).thenReturn(650);
        Mockito.when(studentService.getNumberOfSubjects()).thenReturn(10);

        assertEquals(65.0, student.calculatePercentage());
    }
}
