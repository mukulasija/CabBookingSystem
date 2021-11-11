package Threads;
import Database.*;

import java.util.ArrayList;
import java.util.List;

public class FindCabThread extends Thread{
    String from;
    int passengerCount;
    public List<Cab> results = new ArrayList<Cab>();
    public FindCabThread(String from,int passengerCount)
    {this.from=from;
        this.passengerCount=passengerCount;
    }

    public void run()
    {
//       userslist head = userslist.head;
//       userslist temp = head;
       Cab temp = CabList.head;
       while(temp!=null)
       {
           if(temp.getBookedByUser()==null && temp.getFromCity().equals(this.from) && temp.getCapacity()>=passengerCount)
           {
               results.add(temp);
           }
           temp= temp.next;
       }
    }

}
