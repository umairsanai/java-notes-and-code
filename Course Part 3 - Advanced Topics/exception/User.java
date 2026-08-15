package exception;

// DEMO FOR THROWING EXCEPTIONS

public class User {
    public static void main(String[] args) {
        Account myAccount = null;
        try {
            myAccount = new Account();
            myAccount.deposit(-1);
            myAccount.deposit(1000);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            if (myAccount != null)
                myAccount.printBalance();
        }
    }   
}