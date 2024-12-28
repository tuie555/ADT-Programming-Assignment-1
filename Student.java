
public class Student {
    private final String SID;
    private final String firstName;
    private final String lastName;

    public Student(String SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastname() {
        return lastName;
    }
    public String getSID() {
        return SID;
    }
    @Override
    public String toString() {
        return this.SID + " " + this.firstName + " " + this.lastName;
    }
}