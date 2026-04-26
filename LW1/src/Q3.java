import java.util.Scanner;
public class Q3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your  first name: ");
        String firstName = scanner.next();

        System.out.println("Enter your middle name: ");
        String middleName = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        String fullName = firstName+" "+middleName.substring(0,1)+". "+lastName;

        System.out.println(fullName);
    }
}
