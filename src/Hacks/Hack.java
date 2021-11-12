package Hacks;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hack {
    public static void giveSpaces(int spaces) {
        for (int i = 0; i < spaces; i++)
            System.out.print(" ");
    }

    public static void bigLine(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
    }

    public static void sleep(int millisec)
    {
        try {
            Thread.sleep(millisec);
        }
        catch (InterruptedException e)
        {

        }
    }
    public static void invalidOption()
    {
        System.out.println("Please select a valid option...");
        Hack.sleep(1000);
    }
    public static void showDots(String message, int dots, int millisec)
    {
        System.out.print(message);
        showDots(dots,millisec);
    }
    public static void showDots(int dots, int millisec) {
        for (int i = 0; i < dots; i++) {
            try {
                System.out.print(".");
                Thread.sleep(millisec);
            } catch (InterruptedException e) {
            }
        }
    }

    public static String FormatString(String string) {
        String firstLetStr = string.substring(0, 1);
        String remLetStr = string.substring(1);
        firstLetStr = firstLetStr.toUpperCase();
        remLetStr = remLetStr.toLowerCase();
        string = firstLetStr + remLetStr;
        return string;
    }

    public static void bigLine() {
        for (int i = 0; i < 20; i++)
            System.out.print("-");
//        System.out.println("");
    }
    public static void giveLine()
    {
        System.out.println();
    }
    public static void giveLine(int n)
    {
        for(int i=0;i<n;i++)
        System.out.println();
    }
    public static int TakeArithemeticInput() {
        Scanner sc = new Scanner(System.in);
        int answer;
        try {
            answer = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input type Mismatch...");
            System.out.print("Please Enter Again: ");
            answer = TakeArithemeticInput();
        }
        return answer;
    }
}
