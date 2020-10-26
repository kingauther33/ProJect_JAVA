package Ex2;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        number = 0;
        destination = "";
    }

    public Flight(int number, String destination) {
        setNumber(number);
        this.destination = destination;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else throw new IllegalArgumentException("You input an negative number!!!");
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display() {
        System.out.println("Number of the flight: " + number);
        System.out.println("Destination of the flight: " + destination);
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }
}
