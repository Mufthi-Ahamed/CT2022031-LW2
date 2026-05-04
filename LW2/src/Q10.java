import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        final int MONTH_IN_YEAR = 12;

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period: ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate/100.0/MONTH_IN_YEAR;
        int numberOfPayments = loanPeriod*MONTH_IN_YEAR;

        double monthlyPayment =
                (loanAmount*monthlyInterestRate)/
                        (1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment*numberOfPayments;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}
