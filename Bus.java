public class Bus extends BusreservationAbstract {
    private int totalSeats;
    private int availableSeats;
    String busNumber;
    String busType;
    String seatType;
    int seatbooked=0;
    public Bus(int totalSeats,String busNumber,String busType,String seatType) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.busNumber=busNumber;
        this.busType=busType;
        this.seatType=seatType;
    }
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
}
