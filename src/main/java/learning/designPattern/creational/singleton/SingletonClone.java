package learning.designPattern.creational.singleton;

public class SingletonClone implements Cloneable {

    public static SingletonClone instance = new SingletonClone();

    private SingletonClone()
    {
        // private constructor
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
