import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the count you want to try: ");
        final int LIMIT = input.nextInt();

        for (int i = 0; i < LIMIT; i++) {

            System.out.print("\n\nNumber: ");
            int num = input.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }

        }

        input.close();
    }
}
