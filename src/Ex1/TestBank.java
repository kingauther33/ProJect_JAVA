package Ex1;

public class TestBank {
    public static void main(String[] args) {
        Bank b1;
        try {
            b1 = new Bank(1000, -1);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("Balance is set to 0, rate is set to 0\n");
            b1 = new Bank();
        }
        System.out.printf("Balance is: %.2f\n", b1.getBalance());
        System.out.printf("Rate is: %.2f\n", b1.getRate());
        System.out.printf("The interest you need to pay is: %.2f", b1.calculateInterest());
    }
}
