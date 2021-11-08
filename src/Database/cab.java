package Database;

public class cab {
//    public static cab head;
//    public static cab tail;
    public cab next;
    public String from;
    public String driverName;
    public int pricePerKm;
    public String type;
    public int capacity;
    public user bookedByUser = null;
    public int bookedForDays=0;
    public int bookingPrice=0;
    public void book(user uid,int days,int price)
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
//    public cab(String from, String type)
//    {
//        this.from = from;
//        this.type= type;
//    }
    public cab(String from, String type, int pricePerKm, String driverName, int capacity)
    {
        this.from = from;
        this.type = type;
        this.pricePerKm=pricePerKm;
        this.driverName=driverName;
        this.capacity=capacity;
    }
}
