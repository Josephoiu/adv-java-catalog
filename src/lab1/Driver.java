package lab1;

public class Driver {
    public static void main(String[] args) {
        Course introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "L432", 0.5, 4.0);
        introToProgramming.setCredits(2);

        //Noticed that my interface methods wouldn't apply when I created objects via the abstract type. That is a flaw.
        IntroJavaCourse introToJava = new IntroJavaCourse("Intro to Java", "L213", 0.5, 4.0);
        introToJava.setCredits(3);
        introToJava.setPrerequisites("Must have done Intro to Programming.");

        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse("Software Engineering", "L412", 0.5, 4.0);
        advancedJavaCourse.setCredits(3);
        advancedJavaCourse.setPrerequisites("Must have done Intro to Java.");

    }
}
