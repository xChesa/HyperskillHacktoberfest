import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello and welcome to the Hyperskill Hacktoberfect program!\n");
        int selection;
        do {
            System.out.println("Please enter the number of a selection:\n" +
                    "1. Calculator\n" +
                    "2. Word Functions\n" +
                    "0. Exit\n"); // Add any new selections here!

            try {
                selection = handleSelection(Integer.parseInt(scanner.nextLine()));
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid selection number!");
                selection = -1;
            }

        } while (selection != 0);
        System.out.println("Goodbye!");
    }

    private static int handleSelection(int selection) {
        switch (selection) {
            case 1:
                calculator();
                break;
            case 2:
                wordFunctions();
                break;
            /*
            Make sure to add new functions to the selection manager, example above!
             */
        }
        return selection;
    }

    private static void calculator() {
        // Implement me!
    }

    /*
    If you would like to add a new function, feel free to make a new method below.
    Make sure to add it to the handleSelection method and add it to the list!
     */

    /** All kinds of functions to be implemented on a user input string.
     * How long is the word?
     * How many of x letter in the word?
     * Is it a palindrome (the same backwards)?
     * Please add more! :) */
    private static void wordFunctions() {
        System.out.println("Enter the word you would like details about:");
        String word = scanner.nextLine().trim().toLowerCase();
        String choice = displayWordMenu();

        while (!"0".equals(choice)) {
            switch (Integer.parseInt(choice)) {
                case 1: // word length
                    System.out.printf("The length of %s is: %d\n", word, word.length());
                    break;
                case 2: // count letter appearance
                    System.out.printf("Letter appeared %d times\n",countChars(word));
                    break;
                case 3: // is palindrome
                    System.out.println(isPalindrome(word) ? "It is!\n" : "It is not!\n");
                    break;
                case 4: // display the ASCII for each character in word
                    displayASCII(word);
                    break;
                case 5: // natural order sort characters
                    System.out.printf("In alphabetical order: %s\n", naturalOrderSort(word));
                    break;
            }
            choice = displayWordMenu();
        }
    }

    private static String displayWordMenu() {
        System.out.println("\nPlease enter a choice:\n" +
                "1: The length of the word\n" +
                "2: Count appearance of letter\n" +
                "3: Is it a palindrome?\n" +
                "4: Display the ASCII for each letter\n" +
                "5: Display word in alphabetical order\n" +
                "0: Exit");
                /* Please add any others */

        return scanner.nextLine().trim();
    }

    private static long countChars(String word) {
        System.out.println("Input the character to count:");
        char c = scanner.nextLine().trim().toLowerCase().charAt(0);
        return word.chars()
                .filter(letter -> letter == c)
                .count();
    }

    private static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }

    private static void displayASCII(String word) {
        word.chars().forEach(c -> System.out.printf("Letter: %s ASCII: %d\n", (char) c, c));
    }

    private static String naturalOrderSort(String word) {
        return word.chars()
                .mapToObj(e -> (char) e)
                .sorted()
                .collect(Collectors.toList())
                .toString()
                .replaceAll("[\\[,\\] ]", "");
    }

}
