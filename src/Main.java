import train.Train;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        boolean flag = true;

        while (flag) {

            System.out.println("===============================================");
            System.out.println("        > RAILWAY TICKET REGISTRATION <        ");
            System.out.println("===============================================");
            System.out.println("               MAIN MENU OPTIONS              ");
            System.out.println("-----------------------------------------------");
            System.out.println("   1. Show Available Seats");
            System.out.println("   2. Book a Seat");
            System.out.println("   3. Cancel a Seat");
            System.out.println("   4. Display All Booked Tickets");
            System.out.println("   5. Exit");
            System.out.println("-----------------------------------------------");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    train.getSeatManager().availableSeats();
                    break;

                case 2:
                    System.out.print("Enter passenger name: ");
                    String name = sc.next();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter seat number to book: ");
                    int seatNumber = sc.nextInt();

                    train.getSeatManager().bookSeat(seatNumber, name);
                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelSeatNo = sc.nextInt();

                    train.getSeatManager().cancelSeat(cancelSeatNo);
                    break;

                case 4:
                    train.getSeatManager().displayBookedTickets();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
