package Threads;

import Database.cities;

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
        List<String> list = cities.citiesList;
       for(int i=0;i<list.size();i++)
       {
           if(list.get(i).equals(city))
           {
               index=i;
               return;
           }
       }
       cities.syncCity(city);
//       cities.citiesList.add(city);
       index=list.size();
    }
}
