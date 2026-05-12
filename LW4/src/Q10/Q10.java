package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Word or pharse: ");
    String text = scanner.nextLine();

        int left = 0;
        int right = text.length()-1;

        boolean isPalindrome = true;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}