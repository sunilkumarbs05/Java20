package learning.designPattern.creational.singleton;

import java.io.Serializable;

//https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
public class SingletonSerializable implements Serializable {

    // public instance initialized when loading the class
    public static SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable()
    {
        // private constructor
    }

    // implement readResolve method
    protected Object readResolve() { return instance; }
}
