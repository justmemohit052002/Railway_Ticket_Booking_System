package train;

import exception.SeatNotAvailabilityException;

public class Seat {

    int[] seat_no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    String[] reservation = new String[seat_no.length];
    // name of the person will be store here
    // if thier is no one who reserve seat,
    // null will be shown


    public int[] Available_Seats() {
        int count = 0;
        int[] temp = new int[seat_no.length];

        for (int i = 0; i < seat_no.length; i++) {
            if (reservation[i] == null) {
                temp[count++] = seat_no[i];
            }
        }

        int[] available = new int[count];
        for (int i = 0; i < count; i++) {
            available[i] = temp[i];
        }

        return available;
    }

    public boolean bookSeat(int seatNumber, String passengerName) {

        int index = seatNumber - 1;

        if (index < 0 || index >= reservation.length) {

            // conditions check only 1-20 seats available
            // not acceptable 0 or below 0
            // not acceptable greater then 20
            //if condition true thorw exception such seat are not available

            throw new SeatNotAvailabilityException("Seat Not Available");
        }

        if (reservation[index] != null) {
            // if reservation[index] is not null , then seat is hold by any person, it throw seat already booked
            throw new SeatNotAvailabilityException("Seat Already Booked");
        }

        reservation[index] = passengerName;// person name will be used here to reseve seat

        System.out.println("Seat " + seatNumber + " booked successfully for " + passengerName);

        return true;
    }

    public boolean cancelSeat(int seatNumber, String passengerName) {

        int index = seatNumber - 1;
        if (index < 0 || index >= reservation.length) {
            throw new SeatNotAvailabilityException("Seat Not Available");
        }
        if (reservation[index] != null) {
            throw new SeatNotAvailabilityException("Seat Already Booked");
        }
        reservation[index] = null;
        System.out.println("Seat " + seatNumber + " cancelled successfully for " + passengerName);
        return true;
    }
}
