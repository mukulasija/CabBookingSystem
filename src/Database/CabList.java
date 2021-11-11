package Database;

import Hacks.Hack;

public class CabList{
    public static Cab head =null;
    public static Cab tail =null;

    public static void addNewCab(String from,String type,int cabPrice,int capacity)
    {
       from= Hack.FormatString(from);
       type= Hack.FormatString(type);
       Cities.addCity(from);
        Cab newcab = new Cab(from,type,cabPrice,capacity);
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
