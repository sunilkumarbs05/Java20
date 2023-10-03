package learning.designPattern.creational.factory;

public class BankFactory {

    public Bank getBank(String value) {
        return switch (value) {
            case "ICICI" -> new Icici();
            case "SBI" -> new Sbi();
            case "YES" -> new Yes();
            default -> new Sbi();
        };
    }
}
