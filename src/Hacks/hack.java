package Hacks;

public class hack{
    public static String FormatString(String string)
    {
        String firstLetStr = string.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = string.substring(1);
        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
        remLetStr = remLetStr.toLowerCase();
        // concantenate the first letter and remaining string
        string = firstLetStr + remLetStr;
        return string;
    }

}
