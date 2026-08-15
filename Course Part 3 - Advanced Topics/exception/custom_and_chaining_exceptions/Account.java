package exception.custom_and_chaining_exceptions;

class Account {
    public static String[] usedEmails = {"umair@gmail.com", "umair@roamistan.com"};
    private int amount = 0;

    public Account(String email) throws AccountException {
        for (int i = 0; i < usedEmails.length; i++) {
            if (usedEmails[i].equals(email)) 
                throw new AccountException(new DuplicateUserException());
        }
    }

    public void deposit(int val) throws IllegalArgumentException {
        if (val <= 0) 
            throw new IllegalArgumentException("Please enter a positive amount");

        this.amount += val;
    }
    public void withdraw(int val) throws AccountException {
        
        if (val <= 0) 
            throw new IllegalArgumentException("Please enter a positive amount");
        
        if (val > amount) 
            throw new AccountException(new InsufficientFundsException());

        this.amount -= val;
    }
    public void printBalance() {
        System.out.println("Balance: " + this.amount);
    }
}