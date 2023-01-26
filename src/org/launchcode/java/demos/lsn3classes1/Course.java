package org.launchcode.java.demos.lsn3classes1;
import java.util.*;
public class Course {
    private ArrayList<Student> students;
    private Teachers teacher;
    private int room;

    public Course(ArrayList<Student> students, Teachers teacher, int room) {
        this.students = students;
        this.teacher = teacher;
        this.room = room;
    }
    public Teachers getTeacher() {
        return teacher;
    }
    public void setTeacher(Teachers aTeacher) {
        this.teacher = aTeacher;
    }
    public int getRoom() {
        return this.room;
    }
    public void setRoom(int aRoom) {
        this.room = aRoom;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student> aStudents) {
        this.students = aStudents;
    }

}
