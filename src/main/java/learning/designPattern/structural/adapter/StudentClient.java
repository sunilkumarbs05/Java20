package learning.designPattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {

        SchoolStudent schoolStudent = new SchoolStudent("Sunil", "Kumar", "sunil@gamil.com");
        ColleageStudent colleageStudent = new ColleageStudent("Anil", "kumar", "Anil@gmail.com");

        List<Student> students = new ArrayList<>();
        students.add(colleageStudent);
        students.add(new SchoolAdapter(schoolStudent));

        return students;
    }
}
