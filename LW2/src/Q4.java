import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter body weight:");
        double weight = scanner.nextDouble();

        double calories = weight*19;

        System.out.println("number of calories the person needs in one day: " + calories);
    }
}
