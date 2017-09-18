package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends Course{

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0){
            throw new IllegalArgumentException("Must be filled in");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Must be filled in");
        }
        this.setCredits(credits);
    }


    @Override
    public String getPrerequisites() {
        return null;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    
}
