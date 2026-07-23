import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    private long principal = 0;
    private long years = 0;
    private double interestRate = 0;
    private double mortage = 0;

    public void initialize() {

        System.out.println("\n\n");
 
        Scanner input = new Scanner(System.in);
        this.principal = (long) takeInput("Principal ($1K - $1M): ", 1_000, 1_000_000, input);
        this.interestRate = takeInput("Annual Interest Rate: ", 0, 30, input);
        this.interestRate = (this.interestRate / 100.00) / 12.00;
        this.years = (long) takeInput("Period (Years): ", 1, 30, input);
        this.mortage = calculateMortage();
        input.close();
    }

    private double takeInput(String prompt, int min, int max, Scanner inputScanner) {
        double input;

        while (true) {

            System.out.print(prompt);
            input = inputScanner.nextDouble();

            if (input >= min && (!prompt.contains("Annual Interest Rate") || input != min) && input <= max)
                break;
            
            System.out.println("Enter a number between " + min + " and " + max);
        }

        return input;        
    } 

    private String formatCurrency(double amount) {
        return NumberFormat.getCurrencyInstance().format(amount);
    }

    private double calculateMortage() {
 
        long months = this.years * 12;
        double numerator = (Math.pow(1 + this.interestRate, months) * this.interestRate);
        double denominator = (Math.pow(1 + this.interestRate, months)) - 1;

        return (numerator / denominator) * ((double) this.principal);
    }

    private double calculateRemainingBalance(long paymentsMade) {
        long months = this.years * 12;
        double numerator = Math.pow(1 + this.interestRate, months) - Math.pow(1 + this.interestRate, paymentsMade);
        double denominator = Math.pow(1 + this.interestRate, months) - 1;

        return ((double) principal) * (numerator / denominator);
    }

    public void printMonthlyPayemnt() {
        System.out.println("\nMORTAGE\n-------\nMonthly Payments: " + formatCurrency(this.mortage) + "\n");
    }

    public void printPaymentSchedule() {
        long months = this.years * 12;

        System.out.println("\nPAYMENT SCHEDULE\n----------------");

        for (int i = 1; i <= months; i++) {
            double remainingBalance = calculateRemainingBalance(i);
            String formattedRemainingBalanceString = formatCurrency(remainingBalance);
            System.out.println(formattedRemainingBalanceString);
        }

        System.out.println("\n----------------\n\n");
    }

}



/*
Basic code after using this class in another class. This file is designed to be used as a module/library in another file.

        MortageCalculator calculator = new MortageCalculator();
        calculator.initialize();
        calculator.printMonthlyPayemnt();
        calculator.printPaymentSchedule();

*/