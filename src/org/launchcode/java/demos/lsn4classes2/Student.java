package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
     //Determine the grade level of the student based on numberOfCredits
    public String getGradeLevel(int credits) {
        if (credits <= 29){
            return "Freshman";
        } else if (credits <= 59){
            return "Sophomore";
        } else if (credits <= 89){
            return "Junior";
        } else{
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double totalScore = this.gpa * this.numberOfCredits;
        totalScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalScore/this.numberOfCredits;
        // Update the appropriate fields: numberOfCredits, gpa
    }
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(24, 3.5);
        System.out.println(sally);
        sally.addGrade(35, 3.8);
        System.out.println(sally);
    }

    @Override
    public String toString() {
//        return "\nStudent: " + this.getName() +"\nStudent ID: " + this.getStudentId() + "\nNumber of Credits: " + this.getNumberOfCredits() + "\nGPA: " + this.getGpa() + "\n";
        return "\nStudent's name is " + this.getName() + ": Their Student ID: " + this.getStudentId() + ". Has " + this.getNumberOfCredits() + " Credits for school. With a GPA of " + this.getGpa();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }
}
