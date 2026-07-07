package com.student;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {
                System.out.println("Student Found");
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}