package Threads;

import Database.Cities;

import java.util.List;

public class FindCityThread extends Thread{
    private final String city;
    public int index;
   public FindCityThread(String city)
    {
        this.city=city;
    }
    public void run()
    {
        List<String> list = Cities.citiesList;
       for(int i=0;i<list.size();i++)
       {
           if(list.get(i).equals(city))
           {
               index=i;
               return;
           }
       }
       Cities.syncCity(city);
//       cities.citiesList.add(city);
       index=list.size();
    }
}
