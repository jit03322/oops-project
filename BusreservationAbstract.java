import java.io.FileWriter;
import java.io.IOException;

public abstract class BusreservationAbstract  {
    private int totalSeats;
    private int availableSeats;
    String busNumber;
    String busType;
    String seatType;
    int seatbooked=0;
    // public Bus(int totalSeats,String busNumber,String busType,String seatType) {
    //     this.totalSeats = totalSeats;
    //     this.availableSeats = totalSeats;
    //     this.busNumber=busNumber;
    //     this.busType=busType;
    //     this.seatType=seatType;
    // }
    public double calculateBookingPrice(String destination) {
        // Define pricing based on destinations
        double price;
        switch (destination) {
            case "destination1":
                price = 50.0; 
                break;
            case "destination2":
                price = 60.0; 
                break;
            case "destination3":
                price = 70.0; 
                break;
            default:
                price = 0.0; // Invalid destination, return 0.0
                break;
        }
        return price;
    }
    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            seatbooked=1;
        } else {
            System.out.println("No available seats.");
            seatbooked=0;
        }
    }
    public void busInfo(){
        System.out.println("details of bus :");
        System.out.println("total no. of seats in bus:"+totalSeats);
        System.out.println("bus type (ac or non ac):"+busType);
        System.out.println("type of seat in bus(single or double seater)):"+seatType);
    }

    private String name;
    private int age;
    private String emailId;
    private String contactNumber;
    private String aadharNumber;
    private String boardingPoint;
    private String destinationPoint;

// public Passenger(String name, int age, String emailId, String contactNumber, String aadharNumber, String boardingPoint, String destinationPoint) {
//         this.name = name;
//         this.age = age;
//         this.emailId = emailId;
//         this.contactNumber = contactNumber;
//         this.aadharNumber = aadharNumber;
//         this.boardingPoint = boardingPoint;
//         this.destinationPoint = destinationPoint;
//     }
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }
     public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + emailId + ", contactnumber:"+contactNumber+""; // Add other attributes as needed
    }
    // private Bus bus;
    private Passenger passenger;
      int emptySeat;
     double bookingPrice;

    //     public Reservation(Bus bus, Passenger passenger,int emptySeat,double prize) {
    //     this.bus = bus;
    //     this.passenger = passenger;
    //     this.emptySeat=emptySeat;
    //     this.bookingPrice=prize;
    // }
    
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
    // public void bookSeat() {
    //     bus.bookSeat();
    // }
  
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
