package com.Activities;

import Database.AllCabsDataFile;
import Database.AllCitiesDataFile;
import Database.User;

public class Main {

    public static void main(String[] args) {
          new AllCabsDataFile();
          new AllCitiesDataFile();
        AuthPage a1 = new AuthPage();
        while(true)
        {

            System.out.println("\n-----------------------\nCAB BOOKING SOFTWARE\n-----------------------\n");
            a1.chooseOption();
        }
    }
}
