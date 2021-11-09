package Database;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static List<String> citiesList = new ArrayList<String>();
    synchronized public static void syncCity(String name)
    {
        citiesList.add(name);
    }
    public static void addCity(String name)
    {

        for (String s : citiesList) {
            if (s.equals(name)) {
                return;
            }
        }
        citiesList.add(name);
    }
}
