package learning.designPattern.structural.adapter;

import java.util.List;

public class AdapterDesignPatternMain {
    public static void main(String[] args) {

        StudentClient studentClient = new StudentClient();
        List<Student> students = studentClient.getStudentList();
        System.out.println(students);
    }
}
