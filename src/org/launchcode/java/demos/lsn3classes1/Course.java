package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String courseName;
    private int courseNum;
    private ArrayList<Student> roster;

    public Course(String courseName, int courseNum, ArrayList<Student> roster) {
        this.courseName = courseName;
        this.courseNum = courseNum;
        this.roster = roster;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseNum + ") Roster: " + roster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseNum() == course.getCourseNum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseNum());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}

