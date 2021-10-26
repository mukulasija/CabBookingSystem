package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        AuthPage a1 = new AuthPage();
        while(true)
        {
            a1.showOptins();
            Scanner scr = new Scanner(System.in);
            int option = scr.nextInt();
            if(option==0)
                break;
            a1.chooseOption(option);
        }

    }

    private static void onCreate() {
    }
}
