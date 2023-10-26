package ie.atu;

public class Student {
    private String Name;
    private String Email;
    private String Course;

    public Student() {
        this.Name = "";
        this.Email = "";
        this.Course = "";
    }

    public Student(String name, String email, String course) {
        this.Name = name;
        this.Email = email;
        this.Course = course;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setCourse(String course) {
        this.Course = course;
    }
}
