import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();

        char firstCharacter, lastCharacter;
        firstCharacter = str.charAt(0);
        lastCharacter = str.charAt(str.length()-1);
        int lengthOfString = str.length();

        System.out.println(lengthOfString);
        System.out.println(firstCharacter);
        System.out.println(lastCharacter);
    }
}
