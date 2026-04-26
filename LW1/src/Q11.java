import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, firstName, lastName, middleName;
        System.out.println("Enter your Full Name:");
        name = scanner.nextLine();

        String[] parts = name.split(" ");
        firstName = parts[0];
        middleName = parts[1];
        lastName = parts[2];
        System.out.println(lastName+", "+ firstName +" "+ middleName.charAt(0));

    }
}
