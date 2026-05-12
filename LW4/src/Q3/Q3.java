package Q3;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an power of 10: ");
        int power = scanner.nextInt();

        switch (power) {
            case 6:
                System.out.print("Enter an Million: ");
                break;
            case 9:
                System.out.print("Enter an Billion: ");
                break;
            case 12:
                System.out.print("Enter an Trillion: ");
            case 15:
                System.out.println("Quadrillion");
                break;

            case 18:
                System.out.println("Quintillion");
                break;

            case 21:
                System.out.println("Sextillion");
                break;

            case 30:
                System.out.println("Nonillion");
                break;

            default:
                System.out.println("No corresponding word for this power of 10.");
        }

    }
}