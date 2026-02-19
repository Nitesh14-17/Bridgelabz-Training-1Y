public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public double calculateTotalCost() {
        double pricePerNight = 0;
        if (roomType.equals("Standard")) {
            pricePerNight = 1000;
        } else if (roomType.equals("Deluxe")) {
            pricePerNight = 2000;
        } else if (roomType.equals("Suite")) {
            pricePerNight = 3000;
        }
        return pricePerNight * nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        System.out.println("Total Cost: Rs. " + calculateTotalCost());
    }
}
