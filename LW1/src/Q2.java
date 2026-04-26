import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your  first name: ");
        String firstName = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        String fullName = firstName+" "+lastName;

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(fullName);
        myWindow.setVisible(true);


    }
}
