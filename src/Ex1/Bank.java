package Ex1;

public class Bank {
    private double balance;
    private double rate;

    public Bank() {
        balance = 0;
        rate = 0;
    }

    public Bank(double balance, double rate) {
        setBalance(balance);
        setRate(rate);
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else throw new IllegalArgumentException("You input the negative number to balance");
    }

    public void setRate(double rate) {
        if (rate > 0) {
            this.rate = rate;
        } else throw new IllegalArgumentException("You input the negative number to rate");
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public double calculateInterest() {
        return balance * (rate / 1200);
    }
}
