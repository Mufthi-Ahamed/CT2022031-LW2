import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter radius:");
        double r = scanner.nextDouble();

        double volume = (4.0/3)*Math.PI*Math.pow(r,3);
        System.out.println("volume of a sphere: " + volume);
    }
}
