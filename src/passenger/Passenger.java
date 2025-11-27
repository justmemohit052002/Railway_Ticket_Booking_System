package passenger;

public class Passenger {
    private String name;
    private int age;
    private int seatNumber;
    private boolean ticketHolder;

    // ----------- Getters & Setters --------------

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isTicketHolder() {
        return ticketHolder;
    }

    public void setTicketHolder(boolean ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

}
