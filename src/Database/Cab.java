package Database;

public class Cab {
    public Cab next;
    private String from;
    private int cabPrice;
    private String type;
    private int capacity;
    private User bookedByUser = null;
    private int bookedForDays=0;
    private int bookingPrice=0;
    private String bookedFinalcity;
    public User getBookedByUser()
    {
        return bookedByUser;
    }
    public String getType()
    {
        return type;
    }
    public String getBookedFinalcity()
    {
        return bookedFinalcity;
    }
    public String getFromCity()
    {
        return from;
    }
    public int getPrice()
    {
        return cabPrice;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public int getBookingPrice()
    {
        return bookingPrice;
    }
    public int getBookedForDays()
    {
        return bookedForDays;
    }
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
