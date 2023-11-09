package lab1;

public class Driver {
    public static void main(String[] args) {
        Course introToProgramming = new IntroToProgrammingCourse("Intro to Programming", "L432", 0.5, 4.0);
        introToProgramming.setCredits(2);
        System.out.println(introToProgramming);
    }
}
