package learning.programing.string;

public class CapitalizeWords {

    public static String capitalizeEachWord(String input) {
        // Split the string into words
        String[] words = input.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and add the rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Remove the trailing space
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "java program to capitalize each word";
        String result = capitalizeEachWord(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + result);
    }
}
