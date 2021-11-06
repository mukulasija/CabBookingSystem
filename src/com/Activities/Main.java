package com.Activities;

import Database.AllCabsDataFile;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        System.out.println("Add Cabs");
//        int a=1;
          new AllCabsDataFile();
//        while(a==1)
//        {
//            admin.addCab();
//            System.out.print("To Add Another cab press 1");
//            a=sc.nextInt();
//        }
        AuthPage a1 = new AuthPage();
        while(true)
        {
            a1.chooseOption();
        }
    }
}
