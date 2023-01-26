package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student dave = new Student("Dave", 1,12,4.0);
        Student deanna = new Student("Deanna", 2,21,4.0);
        Student john = new Student("John", 3,40,4.0);
        Student ddaryl = new Student("Ddaryl", 4,50,4.0);
        Teachers pearce = new Teachers("Pearce", "Odegard","LC101", 3);
        ArrayList<Student> lc101Students = new ArrayList<>();
        lc101Students.add(dave);
        lc101Students.add(deanna);
        lc101Students.add(john);
        lc101Students.add(ddaryl);
        // Instantiate your Student class for part 2 here!

        dave.setName("Dave E Jones");

//        System.out.println(dave.getName());
        System.out.println(dave.toString());

        // Dave --> Dave E dave.setName("Dave E Jones")

        Course launchCode101 = new Course(lc101Students, pearce, 01);
        System.out.println(launchCode101);
    }
}


