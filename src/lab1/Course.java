/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mattkirchner
 */
public abstract class Course {
    String courseName;
    String courseNumber;
    double credits;
    String prerequisites;
    
    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);
    
    public abstract void setCredits(double credits);
    
    public double getCredits(){
        return credits;
    }

    public String getCourseName(){
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public String getCourseNumber(){
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);
}
