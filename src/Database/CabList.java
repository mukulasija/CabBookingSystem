package Database;

import java.util.Scanner;

public class CabList {
    public static cab head =null;
    public static cab tail =null;

    public static void addNewCab(String from,String type,int pricePerKm,String driverName,int capacity)
    {
        cab newcab = new cab(from,type,pricePerKm,driverName,capacity);
        if(CabList.head==null)
        {
            CabList.head=newcab;
        }
        else{
            CabList.tail.next=newcab;
        }
        CabList.tail=newcab;
    }
}
