package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
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
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0){
            throw new IllegalArgumentException("Must be filled in");
        }
        this.prerequisites = prerequisites;
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
