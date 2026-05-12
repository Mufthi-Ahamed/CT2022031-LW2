package Q11;
import java.util.Scanner;
import java.util.Random;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if(guess < number){
                System.out.println("higher");
            }else if(guess > number){
                System.out.println("lower");
            }else{
                System.out.println("Correct");
            }
        }while(guess != number);
    }
}
