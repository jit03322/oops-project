interface BusreservationInterface {
//    public BusreservationInterface(int totalSeats,String busNumber,String busType,String seatType);
    public double calculateBookingPrice(String destination) ;
    public int getTotalSeats() ;

    public int getAvailableSeats();

    public void bookSeat() ;
    public void busInfo();

    // public Passenger(String name, int age, String emailId, String contactNumber, String aadharNumber, String boardingPoint, String destinationPoint) ;
    // Getters
    public String getName() ;
    public int getAge();
    public String getEmailId();

    public String getContactNumber();

    public String getAadharNumber() ;

    public String getBoardingPoint() ;

    public String getDestinationPoint() ;
    // Setters
    public void setName(String name) ;
    public void setAge(int age);

    public void setEmailId(String emailId) ;

    public void setContactNumber(String contactNumber) ;

    public void setAadharNumber(String aadharNumber);
    public void setBoardingPoint(String boardingPoint);
    public void setDestinationPoint(String destinationPoint);    
    // public Reservation(Bus bus, Passenger passenger,int emptySeat,double prize);
    
    public void reservationInfo();
    // public void bookSeat();
  
    public void savePassengerDetailsToFile() ;
}
