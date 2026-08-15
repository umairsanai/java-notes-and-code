
// PURPOSE:
// This "advanced" package contains the code to make custom exceptions and chain multiple exceptions

package exception.custom_and_chaining_exceptions;

public class User {
    public static void main(String[] args) {
        Account myAccount = null;
        try {
            myAccount = new Account("unused_email@gmail.com");
            myAccount.deposit(-1);
            myAccount.deposit(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (myAccount != null)
                myAccount.printBalance();
        }
    }   
}