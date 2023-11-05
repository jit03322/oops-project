public  class Passenger extends BusreservationAbstract {
    private String name;
    private int age;
    private String emailId;
    private String contactNumber;
    private String aadharNumber;
    private String boardingPoint;
    private String destinationPoint;

public Passenger(String name, int age, String emailId, String contactNumber, String aadharNumber, String boardingPoint, String destinationPoint) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.aadharNumber = aadharNumber;
        this.boardingPoint = boardingPoint;
        this.destinationPoint = destinationPoint;
    }
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
}
