package Database;

public class cabList {
    public static cabList head;
    public static cabList tail;
    public cabList next;
    public String from;
    public String driverName;
    public int pricePerKm;
    public String type;
    public int capacity;
    public userslist bookedByUser = null;

    public cabList(String from, String type)
    {
        this.from = from;
        this.type= type;
    }
    public cabList(String from,String type,int pricePerKm,String driverName,int capacity)
    {
        this.from = from;
        this.type = type;
        this.pricePerKm=pricePerKm;
        this.driverName=driverName;
        this.capacity=capacity;
    }
}
