package learning;

public class CountDigit {

    public static void main(String[] args) {
        int number = 123450;
        int length =0;

        while(number!=0){
            length++;
            number = number/10;
        }
        System.out.println("Length: "+length);
    }
}
