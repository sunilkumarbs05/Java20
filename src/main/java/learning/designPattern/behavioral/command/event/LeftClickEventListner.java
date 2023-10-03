package learning.designPattern.behavioral.command.event;

import learning.designPattern.behavioral.command.RaiseHandsCommand;

public class LeftClickEventListner implements EventListner {
    @Override
    public void onEvent() {
        RaiseHandsCommand raiseHandsCommand = new RaiseHandsCommand();
        raiseHandsCommand.execute();
    }
}
