package learning.designPattern.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Bean {
    private String name;
    private String city;
    PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public Bean(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        propertyChangeSupport.firePropertyChange("name", this.name, name);
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        propertyChangeSupport.firePropertyChange("City", this.city, city);
        this.city = city;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {

        propertyChangeSupport.addPropertyChangeListener(listener);

    }

}
