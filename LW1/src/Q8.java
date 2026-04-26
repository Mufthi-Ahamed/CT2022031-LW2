import java.util.Scanner;

public class Q8 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter with exclamation:");
        input = scanner.nextLine();

        int index = input.indexOf("!");

        String str1 = input.substring(0,index);
        String str2 = input.substring(index+1);

        System.out.println(str1);
        System.out.println(str2);
    }
}
