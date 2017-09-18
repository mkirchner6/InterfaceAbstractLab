package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Must be filled in");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Must be filled in");
        }
        this.setCredits(credits);
    }
    
    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
}
