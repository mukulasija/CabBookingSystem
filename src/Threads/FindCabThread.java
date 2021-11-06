package Threads;
import Database.*;

import java.util.ArrayList;
import java.util.List;

public class FindCabThread extends Thread{
    String from;
    int passengerCount;
    public List<cab> results = new ArrayList<cab>();
    public FindCabThread(String from,int passengerCount)
    {this.from=from;
        this.passengerCount=passengerCount;
    }

    public void run()
    {
//       userslist head = userslist.head;
//       userslist temp = head;
       cab temp = CabList.head;
       while(temp!=null)
       {
           if(temp.from.equals(this.from) && temp.bookedByUser==null && temp.capacity>=passengerCount)
           {
               results.add(temp);
           }
           temp= temp.next;
       }
    }

}
