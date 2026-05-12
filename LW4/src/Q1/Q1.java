package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fisrt number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter third number: ");
        int c = input.nextInt();
        int smallest = a;

        if(smallest < b){
            smallest = a;
        }
        if(smallest > c){
            smallest = c;
        }
        System.out.println("The smallest number is: " + smallest);

    }
}