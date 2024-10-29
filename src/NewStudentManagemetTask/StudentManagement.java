package NewStudentManagemetTask;

import java.util.*;

public  class StudentManagement {

    //TODO : displayStudent() sort(son)- findStudentById() contains(byId),  clearAllStudent(), isEmpty()
    // updateStudent, remove( by id), addStudent()
    // Student : Integer id, String name, double grade, Integer age

    private static final List<Student> STUDENTS = new ArrayList<>();

    public static void  add(Student student){
        STUDENTS.add(student);
    }
    public static  void  remove(Student student){
        STUDENTS.remove(student);

    }
    public static  boolean  contains(Student student){
        return STUDENTS.contains(student);
    }
    public  static  void  updateStudent(Integer id, Student updatedStudent){
        for (Student student : STUDENTS) {
            if (student.getId().equals(id)) {
                student.setAge(updatedStudent.getAge());
            }
        }
        for (Student student: STUDENTS){
            if (student.getId().equals(id))
                student.setName(updatedStudent.getName());
        }
    }
    public  static  Student  findById(Integer id){
        for (Student student:STUDENTS){
            if (student.getId().equals(id)){
                return student;
            }
        }return null;
    }

    public  static boolean  isEmpty(){
        return STUDENTS.isEmpty();
    }

    public static void clearAllStudents(){
        STUDENTS.clear();
    }
}
