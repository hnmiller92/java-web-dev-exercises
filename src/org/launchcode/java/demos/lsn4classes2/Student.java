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
    public String getGradeLevel() {
        if(this.numberOfCredits >= 90) {
            return(this.name + " is a Senior.");
        } else if (this.numberOfCredits >= 60) {
            return(this.name + " is a Junior.");
        } else if (this.numberOfCredits >= 30) {
            return(this.name + " is a Sophomore.");
        } else {
            return(this.name + " is a Freshman.");
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = this.gpa * this.numberOfCredits;
        double totalQualityScore = (grade * courseCredits) + currentQualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
        this.gpa = Math.round(this.gpa * 10) / 10.0;
    }

    @Override
    public String toString() {
        return name + " (Student Id: " + studentId + ", Number of Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

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
        System.out.println(sally.studentInfo());
        sally.addGrade(12, 3.5);
        System.out.println(sally.studentInfo());
        sally.addGrade(25, 3.8);
        System.out.println(sally.studentInfo());

        System.out.println(sally.getGradeLevel());

        System.out.println(sally.toString());
        Student hannah = new Student("hannah", 1, 50, 4.0);
        System.out.print(sally.equals(hannah));
    }
}
