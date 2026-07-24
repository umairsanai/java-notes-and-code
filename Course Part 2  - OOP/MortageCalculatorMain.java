public class MortageCalculatorMain {
    
    public static void main(String[] args) {
        MortageCalculator calculator = new MortageCalculator();
        calculator.initialize();
        calculator.printMonthlyPayemnt();
        calculator.printPaymentSchedule();    
    }
}
