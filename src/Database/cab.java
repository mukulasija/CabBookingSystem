package Database;

public class cab {
    public static cab head;
    public static cab tail;
    public cab next;
    public String from;
    public String driverName;
    public int pricePerKm;
    public String type;
    public int capacity;
    public user bookedByUser = null;

    public cab(String from, String type)
    {
        this.from = from;
        this.type= type;
    }
    public cab(String from, String type, int pricePerKm, String driverName, int capacity)
    {
        this.from = from;
        this.type = type;
        this.pricePerKm=pricePerKm;
        this.driverName=driverName;
        this.capacity=capacity;
    }
}
