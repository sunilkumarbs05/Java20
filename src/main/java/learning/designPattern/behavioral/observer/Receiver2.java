package learning.designPattern.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Receiver2 implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("-----------Receiver2---------");

    }
}
