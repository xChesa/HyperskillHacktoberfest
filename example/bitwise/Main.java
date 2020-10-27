package example.bitwise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Example:\n" +
                "Enter a binary number (blank quits):\n" +
                "> 1101 0111 1000 1110 0100\n" +
                "Enter a bit mask:\n" +
                "> 0000 0000 0010 0000 0010\n" +
                "Enter mode (on/off)\n" +
                "> on\n\n" +
                "Resulting binary:\n" +
                "1101 0111 1010 1110 0110\n" +
                "-------------------------------\n");
        
        while (true) {
            
            System.out.println("Enter a binary number (blank quits):");
            String input = scn.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            int bin = Integer.parseInt(input.replaceAll("\\s", ""), 2);
            
            System.out.println("Enter a bit mask:");
            int mask = Integer.parseInt(scn.nextLine().replaceAll("\\s", ""), 2);
            
            mask = ~mask; // NOT the mask '~' is the bitwise NOT (or one's complement) operator.
            
            System.out.println("Enter mode (on/off)");
            String mode = scn.nextLine().toLowerCase();
            switch (mode) {
                case "on":
                    bin = bin ^ mask; //'^' is the bitwise XOR operator.
                    // bin ^= mask; has the same effect. Same as doing a += b;
                    
                    bin = ~bin; // We NOT the result of the XOR operation above.
                    break;
                
                case "off":
                    bin &= mask; // Same as bin = bin & mask;. '&' is the bitwise AND operator
                    break;
                default:
                    continue;
            }
            
            String result = Integer.toString(bin, 2);
            System.out.println(result);
            int padding = 4 - result.length() % 4;
            
            result = ("0".repeat(padding) + result)
                    .replaceAll("(.{" + 4 + "})", "$0 ").trim();
            
            System.out.println("Resulting binary:\n" + result + "\n");
        }
        
        System.out.println("Goodbye! :)");
    }
}
