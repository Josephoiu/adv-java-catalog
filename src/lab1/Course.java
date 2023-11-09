package lab1;

import javax.swing.*;

public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private double creditMin;
    private double creditMax;

    public Course(String courseName, String courseNumber, double creditMin, double creditMax) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.creditMin = creditMin;
        this.creditMax = creditMax;
    }
    public String getCourseName() {
        return courseName;
    }
    private void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    private void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < creditMin || credits > creditMax) {
            System.out.println(
                    "Error: credits must be in the range " + creditMin + " to " + creditMax);
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", credits=" + credits +
                '}';
    }
}
