package learning.designPattern.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        InterviewPanel interviewPanel = new InterviewPanel();
        System.out.println(interviewPanel.hire(candidate));

    }
}
