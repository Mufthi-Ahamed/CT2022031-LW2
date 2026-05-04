import java.util.Scanner;
import java.time.Year;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enyer birth year: ");
        int birthYear = scanner.nextInt();

        int curretYear = Year.now().getValue();
        int age = curretYear-birthYear;

        System.out.println("You were born in " + birthYear +
                " and will be (are) " + age + " this year.");
    }
}
