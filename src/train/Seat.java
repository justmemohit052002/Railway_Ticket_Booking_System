package train;

import exception.SeatNotAvailabilityException;

public class Seat {

    int[] seat_no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    String[] reservation = new String[seat_no.length];

    public int[] availableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < reservation.length; i++) {
            if (reservation[i] == null) { // checking reservation array has null value stored in any index
                //if yes true, display seat no
                System.out.print(seat_no[i] + " ");
            }
        }
        System.out.println();
        return seat_no;
    }

    public boolean bookSeat(int seatNumber, String passengerName) {

        int index = seatNumber - 1;

        if (index < 0 || index >= reservation.length) {
            //if index is negative or user enter more then seat then actual seat capacity
            throw new SeatNotAvailabilityException("Invalid Seat Number");
        }

        if (reservation[index] != null) {
            throw new SeatNotAvailabilityException("Seat Already Booked");
        }

        reservation[index] = passengerName;

        System.out.println("Seat " + seatNumber + " booked successfully for " + passengerName);

        return true;
    }

    public boolean cancelSeat(int seatNumber) {

        int index = seatNumber - 1;

        if (index < 0 || index >= reservation.length) {
            throw new SeatNotAvailabilityException("Invalid Seat Number");
        }

        if (reservation[index] == null) {
            try{
                throw new SeatNotAvailabilityException("Seat is vacant, cannot cancel");
            }
            catch(SeatNotAvailabilityException e){
                System.out.println(e.getMessage());
            }
//            throw new SeatNotAvailabilityException("Seat is vacant, cannot cancel");
        }
        else {
            reservation[index] = null;

            System.out.println("Seat " + seatNumber + " cancelled successfully");
        }

        return true;
    }

    public void displayBookedTickets() {
        System.out.println("Booked Tickets:");
        for (int i = 0; i < reservation.length; i++) {
            if (reservation[i] != null) {
                System.out.println("Seat " + seat_no[i] + " reserved by " + reservation[i]);
            }
        }
    }
}
