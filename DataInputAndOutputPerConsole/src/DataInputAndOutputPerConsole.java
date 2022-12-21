import java.util.Scanner;

public class DataInputAndOutputPerConsole {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("Typing a number: ");
            number = input.nextInt();
            System.out.println("The number is: " + number);

            float decimal;
            System.out.println("Typing a decimal: ");
            decimal = input.nextFloat();
            System.out.println("The number is: " + decimal);

            String chain;
            System.out.println("Typing a chain: ");
            chain = input.next();
            System.out.println("The chain is: " + chain);

            char character;
            System.out.println("Typing a character: ");
            character = input.next().charAt(1);
            System.out.println("The character is: " + character);
        }
    }
}