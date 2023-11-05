import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        Bus bus = new Bus(50,"4548","ac","dubleseater"); // Assuming the bus has 50 seats
        bus.busInfo();

        System.out.println("Passenger details for seat number: " + (bus.getTotalSeats() - bus.getAvailableSeats() + 1));

        // Get passenger details from user input (similar to what you have in your original code)
        String name= sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String emailid=sc.nextLine();
        String contact_number=sc.nextLine();
        String aadhar_number=sc.nextLine();
        String boarding_point=sc.nextLine();
        String destination_point=sc.nextLine();
         Passenger passenger = new Passenger(name, age, emailid, contact_number, aadhar_number, boarding_point, destination_point);
        double prize=bus.calculateBookingPrice(destination_point);
        Reservation reservation = new Reservation(bus, passenger,34,prize);
        //reservation seat info
        System.out.println();
        
        reservation.reservationInfo();
        reservation.bookSeat();
       if( bus.seatbooked==1){
         try {
            // System.out.println("Attempting to save passenger details to file...");
            FileWriter myWriter = new FileWriter("Passenger_output.txt", true);
            myWriter.write("\n payment received successfully"+reservation.bookingPrice);
            myWriter.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred while saving passenger details.");
            e.printStackTrace();
        }
       }
       else{
        System.out.println("payment failed");
       }
        reservation.savePassengerDetailsToFile();
        sc.close();
    }
}
