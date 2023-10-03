package learning.designPattern.structural.adapter;

public class SchoolStudent {

    private String fistName;
    private String lastName;
    private String email;

    public SchoolStudent(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
