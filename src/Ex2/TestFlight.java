package Ex2;

public class TestFlight {
    public static void main(String[] args) {
        Flight g1;
        try {
             g1 = new Flight(-3, "Toronto");
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println("The Number and Destination is set to default\n");
            g1 = new Flight();
        }
        g1.display();
    }
}
