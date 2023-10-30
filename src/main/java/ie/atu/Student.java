package ie.atu;

public class Student {
    //private variables
    private String Name;
    private String Email;
    private String Course;

    //default constructor
    public Student() {
        this.Name = "";
        this.Email = "";
        this.Course = "";
    }

    //constructors
    public Student(String name, String email, String course) {
        this.Name = name;
        this.Email = email;
        this.Course = course;
    }

    public Student(String name) {
        this.Name = name;
    }

    //setters used to pass values to the privates variables
    public void setName(String name) {
        this.Name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setCourse(String course) {
        this.Course = course;
    }

    //getters used to retrieve the values of the private variables
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getCourse() {
        return Course;
    }
}
