package Database;

import Hacks.hack;
import Threads.FindCityThread;

import java.util.ArrayList;
import java.util.List;

public class cities {
    public static List<String> citiesList = new ArrayList<String>();
    public static void addCity(String name)
    {

        for(int i=0;i<citiesList.size();i++)
        {
            if(citiesList.get(i)==name)
            {
                return;
            }
        }
        citiesList.add(name);
        return;
    }
//    public int index;
//    public static List<cities> citiesList;
//    public void addCity(String cityName)
//    {
//        this.name = cityName;
//        this.index= citiesList.size();
//        citiesList.add(this);
//    }
}
