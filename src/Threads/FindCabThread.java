package Threads;
import Database.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class FindCabThread extends Thread{
    String from;
    public List<cabList> results = new ArrayList<cabList>();
    public FindCabThread(String from)
    {this.from=from;
    }

    public void run()
    {
//       userslist head = userslist.head;
//       userslist temp = head;
       cabList temp = cabList.head;
       while(temp!=null)
       {
           if(temp.from.equals(this.from))
           {
               results.add(temp);
           }
           temp= temp.next;
       }
    }

}
