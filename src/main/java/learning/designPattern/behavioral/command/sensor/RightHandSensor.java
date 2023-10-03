package learning.designPattern.behavioral.command.sensor;

import learning.designPattern.behavioral.command.HandsDownCommand;

public class RightHandSensor implements MotionSensor{
    @Override
    public void onRecognition() {
        HandsDownCommand handsDownCommand = new HandsDownCommand();
        handsDownCommand.execute();
    }
}
