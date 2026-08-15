package exception;

class Account {
    private int amount = 0;

    public void deposit(int val) throws IllegalArgumentException {
        if (val <= 0) {
            throw new IllegalArgumentException("Please enter a positive amount");
        }
        this.amount += val;
    }
    public void withdraw(int val) {
        if (val <= 0) {
            throw new IllegalArgumentException("Please enter a positive amount");
        }
        this.amount -= val;
    }
    public void printBalance() {
        System.out.println("Balance: " + this.amount);
    }
}