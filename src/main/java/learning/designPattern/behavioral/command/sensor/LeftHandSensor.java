package learning.designPattern.behavioral.command.sensor;

import learning.designPattern.behavioral.command.RaiseHandsCommand;

public class LeftHandSensor implements MotionSensor{

    @Override
    public void onRecognition() {
        RaiseHandsCommand raiseHandsCommand = new RaiseHandsCommand();
        raiseHandsCommand.execute();
    }
}
