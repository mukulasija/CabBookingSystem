package Database;

public class Cab {
    public Cab next;
    public String from;
    public String driverName;
    public int cabPrice;
    public String type;
    public int capacity;
    public User bookedByUser = null;
    public int bookedForDays=0;
    public int bookingPrice=0;
    public String bookedFinalcity;
    public void book(User uid, int days, int price,String tocity)
    {
        this.bookedByUser=uid;
        this.bookedForDays=days;
        this.bookingPrice=price;
        this.bookedFinalcity=tocity;
    }
    public void unbook()
    {
        this.bookedForDays=0;
        this.bookingPrice=0;
        this.bookedByUser=null;
    }
    public Cab(String from, String type, int pricePerKm, int capacity)
    {
        this.from = from;
        this.type = type;
        this.cabPrice =pricePerKm;
        this.capacity=capacity;
    }
}
