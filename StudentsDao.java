package com.karim.Dao;

import com.karim.Entity.Student;

import java.util.Collection;

public interface StudentsDao {
    // get Students information
    // this is going to return the students name,id,course
    //goes to the student class with the data
    Collection<Student> getAllStudents();

    // will get the student ID from the Student encapsualtion class
    Student getStudentById(int id);

    void removeStudentById(int id);

    // setting the name id and course and getting them
    void updateStudentById(Student student);

    void inserStudentToDB(Student student);
}
