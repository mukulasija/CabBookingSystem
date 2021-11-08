package Hacks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hack{
    public static void giveSpaces(int spaces)
    {
        for(int i=0;i<spaces;i++)
            System.out.print(" ");
    }
    public static void bigUpLine(int n)
    {
        System.out.println("");
        for(int i=0;i<n;i++)
            System.out.print("-");
        System.out.println("");
    }
    public static void bigLine(int n)
    {
        for(int i=0;i<n;i++)
        System.out.print("-");
    }
    public static void showDots(int n,int millisec)
    {
        for(int i=0;i<n;i++)
        {
            try{System.out.print(".");Thread.sleep(millisec);}catch (InterruptedException e){
            }
        }
    }
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

    public static void bigLine()
    {
        for(int i=0;i<20;i++)
            System.out.print("-");
        System.out.println("");
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
