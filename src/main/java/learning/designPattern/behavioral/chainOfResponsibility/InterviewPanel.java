package learning.designPattern.behavioral.chainOfResponsibility;

public class InterviewPanel {
    private Round firstRound;
    public InterviewPanel() {
        TechnicalRound technicalRound = new TechnicalRound();
        ManageRound manageRound = new ManageRound();
        HrRound hrRound = new HrRound();
        firstRound = technicalRound;
        technicalRound.setNext(manageRound);
        manageRound.setNext(hrRound);
    }

    public boolean hire(Candidate candidate){
        return firstRound.validate(candidate);
    }
}
