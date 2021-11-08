package Hacks;

import java.util.InputMismatchException;
import java.util.Scanner;

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

    public static int TakeArithemeticInput()
    {
        Scanner sc = new Scanner(System.in);
        int answer;
        try {
            answer = sc.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Input type Mismatch...");
            System.out.print("Please Enter Again: ");
            answer = TakeArithemeticInput();
        }
        return answer;
    }
}
