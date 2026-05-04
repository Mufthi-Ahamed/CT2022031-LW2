import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter principal: " );
        double p = scanner.nextDouble();

        System.out.print("Enter rate: ");
        double r = scanner.nextDouble();

        System.out.print("Enter years: ");
        int n = scanner.nextInt();

        double amount = p*Math.pow(1+(r/100),n);

        System.out.println(" Amount of money earned after " + n + " years " + amount);
    }
}
