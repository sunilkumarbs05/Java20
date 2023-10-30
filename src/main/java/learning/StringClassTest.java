package learning;

public class StringClassTest {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("1234");
//       stringBuilder.delete(0,2);
//        System.out.println(stringBuilder.toString());
//        stringBuilder.replace(0,3,"S");

        System.out.println(stringBuilder.substring(1, 3) + " SubString of" + stringBuilder.toString());

    }

}
