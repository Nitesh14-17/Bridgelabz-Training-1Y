public class MovieTicket {
    String movie;
    int seat;
    double price;
    boolean booked;
    
    public MovieTicket(String movie, double price) {
        this.movie = movie;
        this.price = price;
        this.seat = -1;
        this.booked = false;
    }
    
    public void book(int seatNum) {
        if (!booked) {
            seat = seatNum;
            booked = true;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("Ticket already booked");
        }
    }
    
    public void display() {
        System.out.println("Movie: " + movie);
        if (booked) {
            System.out.println("Seat: " + seat);
        } else {
            System.out.println("Seat: Not booked");
        }
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Avatar", 250);
        t1.display();
        
        System.out.println();
        t1.book(15);
        t1.display();
        
        System.out.println();
        
        MovieTicket t2 = new MovieTicket("Inception", 300);
        t2.display();
        System.out.println();
        t2.book(20);
        t2.display();
    }
}
