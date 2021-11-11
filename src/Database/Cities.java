package Database;

import Hacks.Hack.*;

import java.util.ArrayList;
import java.util.List;
import static Hacks.Hack.*;
public class Cities {
    public static List<String> citiesList = new ArrayList<String>();
    synchronized public static void syncCity(String name)
    {
        citiesList.add(name);
    }
    public static void addCity(String name)
    {
        name=FormatString(name);
        for (String s : citiesList) {
            if (s.equals(name)) {
                return;
            }
        }
        citiesList.add(name);
    }
}
