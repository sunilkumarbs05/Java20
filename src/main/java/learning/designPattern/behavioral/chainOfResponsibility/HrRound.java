package learning.designPattern.behavioral.chainOfResponsibility;

public class HrRound extends Round {
    @Override
    boolean validate(Candidate candidate) {

        var score = 8;
        if (score > 6) {
            if (next != null) {
                return next.validate(candidate);
            } else {
                return true;
            }
        }
        return false;
    }
}
