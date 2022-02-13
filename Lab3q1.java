import java.util.Scanner;

public class Lab3q1 {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = scan_value.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int years = scan_value.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmt = scan_value.nextDouble();

        Loan Reagan = new Loan(interestRate, years, loanAmt);
        System.out.println("The loan was created on " + Reagan.getLoanDate());
        System.out.printf("The monthly payment is %.2f ", Reagan.getMonthlyPayment());
        System.out.printf("\n The total payment is %.2f ", + Reagan.getTotalPayment());
        scan_value.close();
    }    
}
