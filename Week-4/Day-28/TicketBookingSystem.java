import java.util.*;

public class TicketBookingSystem {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, TicketInfo> map = new HashMap<>();

    static class TicketInfo {
        String movieName;
        String customerName;
        int seatCount;
        double totalPrice;

        TicketInfo(String movieName, String customerName, int seatCount, double ticketPrice) {
            this.movieName = movieName;
            this.customerName = customerName;
            this.seatCount = seatCount;
            this.totalPrice = seatCount * ticketPrice;
        }
        public String toString() {
            return "| Movie: " + movieName + " | Customer: " + customerName + " | Seats: " + seatCount + " | Total: Rs. " + totalPrice;
        }
    }

    public static void main(String[] args) {
        map.put(1001, new TicketInfo("Inception", "Adam Silvenia", 2, 250.0));
        map.put(1004, new TicketInfo("Interstellar", "Cam Silvenia", 4, 300.0));
        map.put(1002, new TicketInfo("Inception", "Sierra Karinton", 1, 250.0));
        map.put(1003, new TicketInfo("Avatar", "Rora Monabell", 3, 350.0));

        while (true) {
            System.out.println("Enter 0 to print all booked tickets");
            System.out.println("Enter 1 to book a new ticket");
            System.out.println("Enter 2 to update booking details");
            System.out.println("Enter 3 to find a booking record");
            System.out.println("Enter 4 to cancel a booking");
            System.out.println("Enter 5 to stop");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    for (Map.Entry<Integer, TicketInfo> e : map.entrySet()) {
                        System.out.println("Booking ID: " + e.getKey() + " " + e.getValue());
                    }
                    break;
                }
                case 1: {
                    bookTicket();
                    break;
                }
                case 2: {
                    updateBooking();
                    break;
                }
                case 3: {
                    findBooking();
                    break;
                }
                case 4: {
                    cancelBooking();
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Wrong input");
                    break;
                }
            }
        }
    }

    public static void bookTicket() {
        System.out.println("Enter Booking ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Booking ID already exists.");
            return;
        }

        System.out.println("Enter movie name:");
        String movie = sc.nextLine();
        System.out.println("Enter customer name:");
        String customer = sc.nextLine();
        System.out.println("Enter number of seats:");
        int seats = sc.nextInt();
        System.out.println("Enter ticket price per seat (in Rs):");
        double price = sc.nextDouble();
        sc.nextLine();

        map.put(id, new TicketInfo(movie, customer, seats, price));
        System.out.println("Ticket booked successfully!");
    }

    public static void cancelBooking() {
        System.out.println("Enter Booking ID:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Booking ID not found.");
            return;
        }
        map.remove(id);
        System.out.println("Booking cancelled successfully!");
    }

    public static void findBooking() {
        System.out.println("Enter Booking ID to find:");
        int id = sc.nextInt();
        sc.nextLine();

        if (map.containsKey(id)) {
            System.out.println("Booking ID: " + id + " " + map.get(id));
        } else {
            System.out.println("Booking ID not found.");
        }
    }

    public static void updateBooking() {
        System.out.println("Enter Booking ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!map.containsKey(id)) {
            System.out.println("Booking ID not found.");
            return;
        }

        TicketInfo ticket = map.get(id);

        System.out.println("What do you want to update?");
        System.out.println("1. Customer Name\n2. Movie Name\n3. Change Seat Count");
        int updateChoice = sc.nextInt();
        sc.nextLine();

        switch (updateChoice) {
            case 1:
                System.out.println("Enter new Customer Name:");
                ticket.customerName = sc.nextLine();
                break;
            case 2:
                System.out.println("Enter new Movie Name:");
                ticket.movieName = sc.nextLine();
                break;
            case 3:
                double currentPricePerSeat = ticket.totalPrice / ticket.seatCount;
                System.out.println("Enter new Seat Count:");
                ticket.seatCount = sc.nextInt();
                sc.nextLine();
                ticket.totalPrice = ticket.seatCount * currentPricePerSeat;
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Booking updated successfully!");
    }
}