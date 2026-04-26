import java.awt.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Odd length string :");
        String input=scanner.nextLine();
        int indexOfMiddleChar= (int)Math.ceil(input.length()/2);

        System.out.println(input.charAt(indexOfMiddleChar));
    }
}