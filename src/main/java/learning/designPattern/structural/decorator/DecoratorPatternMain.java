package learning.designPattern.structural.decorator;

interface Dress {
    void assemble();
}

class BaseDress implements Dress {

    @Override
    public void assemble() {
        System.out.println("Base dress features");
    }
}

class DressDecorator implements Dress {
    protected Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}


class CasualDress extends DressDecorator {

    public CasualDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Casual dress feature added");
    }
}


class SportsDress extends DressDecorator {

    public SportsDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Spots dress feature added");
    }
}


public class DecoratorPatternMain {
    public static void main(String[] args) {

        Dress dress = new BaseDress();
        dress.assemble();
        System.out.println("\n");

        Dress casulDress = new CasualDress(new BaseDress());
        casulDress.assemble();
        System.out.println("\n");

        Dress spportCasualBase = new SportsDress(new CasualDress(new BaseDress()));
        spportCasualBase.assemble();

    }
}
