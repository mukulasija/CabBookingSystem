package Database;

public class Cab {
    public Cab next;
    public String from;
    public String driverName;
    public int pricePerKm;
    public String type;
    public int capacity;
    public User bookedByUser = null;
    public int bookedForDays=0;
    public int bookingPrice=0;
    public void book(User uid, int days, int price)
    {
        this.bookedByUser=uid;
        this.bookedForDays=days;
        this.bookingPrice=price;
    }
    public void unbook()
    {
        this.bookedForDays=0;
        this.bookingPrice=0;
        this.bookedByUser=null;
    }
    public Cab(String from, String type, int pricePerKm, String driverName, int capacity)
    {
        this.from = from;
        this.type = type;
        this.pricePerKm=pricePerKm;
        this.driverName=driverName;
        this.capacity=capacity;
    }
}
