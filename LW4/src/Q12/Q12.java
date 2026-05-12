package Q12;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to replace");
        String oldWord = scanner.nextLine();

        System.out.println("Enter new word");
        String newWord = scanner.nextLine();

        String result = sentence.replace(oldWord,newWord);

        System.out.println("new sentance"+result);

    }
}
