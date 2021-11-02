package Database;

public class cabList {
    public static cabList head;
    public static cabList tail;
    public cabList next;
    public String from;
    public String type;
    protected userslist bookedByUser = null;
    public cabList(String from,String type)
    {
        this.from = from;
        this.type = type;
    }
}
