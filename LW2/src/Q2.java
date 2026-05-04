import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter Length in centimeter:");
        double cm = scanner.nextDouble();

        double in = cm/2.54;
        int feet = (int)(in/12);
        double remaining = in%12;

        System.out.println("Feet: " +feet);
        System.out.println("Inches: " +remaining);

    }
}
