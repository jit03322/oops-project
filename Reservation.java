import java.io.FileWriter;
import java.io.IOException;
 public class Reservation extends BusreservationAbstract{
    private Bus bus;
    private Passenger passenger;
      int emptySeat;
     double bookingPrice;

        public Reservation(Bus bus, Passenger passenger,int emptySeat,double prize) {
        this.bus = bus;
        this.passenger = passenger;
        this.emptySeat=emptySeat;
        this.bookingPrice=prize;
    }
    
    public void reservationInfo(){
       try {
            // System.out.println("Attempting to save passenger details to file...");
            FileWriter myWriter = new FileWriter("Passenger_output.txt", true);
            myWriter.write("\n no. of seats are remaining for reservation "+emptySeat );
            myWriter.write("\n booking prise of one seat is "+bookingPrice);
            myWriter.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred while saving passenger details.");
            e.printStackTrace();
        }
    }
    public void bookSeat() {
        bus.bookSeat();
    }
  
    public void savePassengerDetailsToFile() {
        try {
            // System.out.println("Attempting to save passenger details to file...");
            FileWriter myWriter = new FileWriter("Passenger_output.txt", true);
            myWriter.write("\n Booked Seat Passenger details: " + passenger.toString());
            myWriter.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred while saving passenger details.");
            e.printStackTrace();
        }
    }
    
}
