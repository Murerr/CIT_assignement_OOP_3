package database;

import school.Classes;
import user.Student;
import user.Teacher;

import java.sql.Connection;
import java.util.ArrayList;

public interface DatabaseQueries {

    ArrayList<Student> getStudentsInDatabase();

    void deleteStudent(int studentId);

    void addStudent(Student student);

    void updateStudent(int studentId, Student student);

    ArrayList<Classes> getClassesInDatabase();

    void deleteClasses(int classesId);

    void addClasses(Classes classes);

    void updateClasses(int classesId,Classes classes);


    ArrayList<Teacher> getTeachersInDatabase();

    void deleteTeacher(int teacherId);

    void addTeacher(Teacher teacher);

    void updateTeacher(int teacherId, Teacher teacher);
}
