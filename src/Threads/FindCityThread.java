package Threads;

import Database.cities;

import java.util.List;

public class FindCityThread extends Thread{
    private String city;
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
           if(list.get(i)==city)
           {
               index=i;
               return;
           }
       }
       cities.citiesList.add(city);
       index=list.size();
       return;
    }
}
