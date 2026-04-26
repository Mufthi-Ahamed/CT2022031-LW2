import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        JFrame jFrame = new JFrame();
        jFrame.setSize(width,height);
        jFrame.setTitle(title);
        jFrame.setVisible(true);
    }
}
