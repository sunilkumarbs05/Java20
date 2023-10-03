package learning.programing.string;

// Input = aabbccccd   Output= a2b2c4d
public class StringProgram_aabbccccd {
    public static void main(String[] args) {

        String value = "aabbcccccd";
        System.out.println("Input: " + value + " Output: " + StringProgram_aabbccccd.parse(value));
    }

    public static String parse(String value) {
        char array[] = value.toCharArray();
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    stringBuilder.append(array[i] + "" + count);
                } else {
                    stringBuilder.append(array[i]);
                }
                count = 1;
            }
        }
        if (count > 1) {
            stringBuilder.append(array[array.length - 1] + "" + count);
        } else {
            stringBuilder.append(array[array.length - 1]);
        }
        return stringBuilder.toString();
    }
}
