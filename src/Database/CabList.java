package Database;

import Hacks.hack;

public class CabList extends cab {
    public static cab head =null;
    public static cab tail =null;

    public CabList(String from, String type, int pricePerKm, String driverName, int capacity) {
        super(from, type, pricePerKm, driverName, capacity);
    }

    public static void addNewCab(String from,String type,int pricePerKm,String driverName,int capacity)
    {
       from= hack.FormatString(from);
       type= hack.FormatString(type);
       driverName = hack.FormatString(driverName);
       cities.addCity(from);
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
