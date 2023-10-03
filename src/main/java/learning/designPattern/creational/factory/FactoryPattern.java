package learning.designPattern.creational.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        BankFactory bankFactory = new BankFactory();

        Bank bank = bankFactory.getBank("ICICI");
        System.out.println(bank.getBalance());

        bank = bankFactory.getBank("SBI");
        System.out.println(bank.getBalance());


    }
}
