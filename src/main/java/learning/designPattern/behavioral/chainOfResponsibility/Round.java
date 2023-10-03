package learning.designPattern.behavioral.chainOfResponsibility;

public abstract class Round {

    protected Round next;

    abstract boolean validate(Candidate candidate);


    public void setNext(Round round) {
        this.next = round;
    }
}
