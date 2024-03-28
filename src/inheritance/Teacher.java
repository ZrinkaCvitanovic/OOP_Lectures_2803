package inheritance;

public class Teacher extends Person {
    private String email;
    private String subject;
    private double salary;
    private short academicYear;
    //no need to write name, surname and age attributes since they are all inherited from Person class

    public Teacher(String Vorname, String Zuname, int Alter, String email, String subject, double salary, short academicYear) {
        super(Vorname, Zuname, Alter); //I don't need to know the meaning of these attributes
        this.email = email;
        this.subject = subject;
        this.salary = salary;
        this.academicYear = academicYear;
    }
    public String toString() {
        //return this.name + this.surname + this.email + this.subject
        //uncomment the line and see the error
        //->  Teacher class cannot see the attribute "name" and "surname"
        return this.subject + ", " + this.email;
    }

    public static void main(String[] args) {
        //Teacher t = new Teacher("email", "subject", 23.1, (short) 2024);
        // -> this wouldn't work because a teacher also has a name, surname and age
        Teacher t = new Teacher("name", "surname", 32, "email", "subject", 23.1, (short) 2024);
        System.out.println(t);
    }
}
