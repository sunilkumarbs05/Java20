package learning.designPattern.structural.adapter;

public class ColleageStudent implements  Student{
    private String name;
    private String surname;
    private String email;

    public ColleageStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String toString() {
        return "ColleageStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
