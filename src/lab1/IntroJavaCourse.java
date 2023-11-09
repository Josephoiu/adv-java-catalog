package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course implements Prerequisite {
    private String prerequisites;
    public IntroJavaCourse(String courseName, String courseNumber, double creditMin, double creditMax) {
        super(courseName, courseNumber, creditMin, creditMax);
    }
    @Override
    public String getPrerequisites() {
        return this.prerequisites;
    }
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

//    String courseName;
//    double credits;
//    String prerequisites;
//    private String courseNumber;
//
//    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
//    }
//
//    public String getCourseNumber() {
//        return courseNumber;
//    }
//
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
//
//    public double getCredits() {
//        return credits;
//    }
//
//    public void setCredits(double credits) {
//        if (credits < 0 || credits > 5.0) {
//            System.out.println(
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }
//
//    public String getPrerequisites() {
//        return prerequisites;
//    }
//
//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }

}
