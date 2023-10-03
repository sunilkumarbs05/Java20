package learning.designPattern.structural.adapter;

public class SchoolAdapter implements Student {

    private SchoolStudent schoolStudent;

    public SchoolAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String name() {
        return this.schoolStudent.getFistName();
    }

    @Override
    public String surname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String email() {
        return this.schoolStudent.getEmail();
    }

    @Override
    public String toString() {
        return "SchoolAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
