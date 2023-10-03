package learning.designPattern.behavioral.chainOfResponsibility;

public class ManageRound extends Round {
    @Override
    boolean validate(Candidate candidate) {
        var score = 8;
        if (score > 7 && next != null)
            return next.validate(candidate);
        return false;
    }
}
