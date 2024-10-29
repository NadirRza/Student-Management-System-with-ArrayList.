package NewStudentManagemetTask;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student1 = new  Student(1,"Name-1",19,51.1);
        Student student2 = new Student(2,"Name-2",20,71.1);
        Student student3 = new Student(3,"Name-3",19,81.1);

        StudentManagement.add(student1);
        StudentManagement.add(student2);
        StudentManagement.add(student3);
        StudentManagement.remove(student1);
        StudentManagement.contains(student2);
        StudentManagement.contains(student1);
        StudentManagement.contains(student3);
        StudentManagement.updateStudent(1,student1);
        StudentManagement.findById(2);
        StudentManagement.clearAllStudents();


    }
}