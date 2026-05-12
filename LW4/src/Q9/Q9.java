package Q9;

import java.util.Scanner;

public class Q9 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = scanner.nextInt();

        for (int i=1; i<=row; i++){
            for(int j=1; j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
