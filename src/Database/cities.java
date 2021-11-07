package Database;

import Hacks.hack;

import java.util.ArrayList;
import java.util.List;

public class cities {
    public static List<String> citiesList = new ArrayList<String>();
    public static void addCity(String name)
    {
      citiesList.add(hack.FormatString(name));
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
