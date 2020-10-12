package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to the Hyperskill Hacktoberfect program!\n");
        int selection;
        do {
            System.out.println("Please enter the number of a selection:\n" +
                    "1. Calculator\n" +
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

}
