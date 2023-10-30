package learning.designPattern.behavioral.command.event;

import learning.designPattern.behavioral.command.Command;
import learning.designPattern.behavioral.command.HandsDownCommand;
import learning.designPattern.behavioral.command.RaiseOneHandCommand;

public class RightClickEventListner implements EventListner {

    @Override
    public void onEvent() {
        Command command = null;
        // if client A
        command = new HandsDownCommand();
//      else
        command = new RaiseOneHandCommand();

        command.execute();

    }
}
