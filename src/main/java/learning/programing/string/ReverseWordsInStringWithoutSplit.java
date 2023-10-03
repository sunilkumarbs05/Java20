package learning.programing.string;

public class ReverseWordsInStringWithoutSplit {
    public static void main(String[] args) {
        String message = "Java is an Ocean";

        char oldArray[] = message.toCharArray();
        // Print the above string as "Ocean an is Java"

        int index = -1, currentIndex = -1;
        char newArray[] = new char[message.length()];
        int j = 1;

        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] == ' ') {
                while (index != currentIndex) {
                    newArray[message.length() - j] = oldArray[currentIndex--];
                    j++;

                }
                newArray[message.length() - j++] = ' ';
                index = i;
                currentIndex = i;

            } else {
                currentIndex++;
            }

        }
        while (index != currentIndex) {
            newArray[message.length() - j] = oldArray[currentIndex--];
            j++;
        }
        System.out.println((new String(newArray)).toString());
    }
}
