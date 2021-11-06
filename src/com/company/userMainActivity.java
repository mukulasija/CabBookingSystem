package com.company;

import Database.user;
import Database.*;

import java.util.Scanner;

public class userMainActivity {
    user uid = null;
    userMainActivity(user uid)
    {
        this.uid = uid;
        onCreate();
    }

    private void onCreate() {
        System.out.println("\n\n--------------------------------------------\n--------------------------------------------");
        System.out.println("Logged in as "+uid.getUsername());
        showBookedCabs();
        chooseOption();
    }

    private void showBookedCabs() {
        if(uid.bookedCabs.size()==0)
        {
            System.out.println("\n--------------------------\nBooked cabs will show here\n--------------------------");
        }
        else
        {
            System.out.println("\n--------------------------\nBooked Cabs:\n");
            for(cab result : uid.bookedCabs)
            {
                System.out.println("From:"+result.from+" Type: "+result.type+" Price: "+result.pricePerKm+"(per km)");
            }
            System.out.println("--------------------------\n");
        }
    }

    public void showOptions()
    {
        System.out.println("1.Logout");
    }
    public void chooseOption()
    {
        System.out.println("1.Book a Cab\n2.Logout");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1)
        {
            uid.bookNewCab();
            onCreate();
        }
        else
        if(option==2)
        {
            logout();
        }
        else
        {
            System.out.println("Please select a valid option...");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {

            }
            onCreate();
        }
    }
    private void logout()
    {
        System.out.print("logging out");
        for(int i=0;i<3;i++)
        {
            try{System.out.print(".");Thread.sleep(500);}catch (InterruptedException e){
            }
        }
        System.out.println("\n");
        return;
    }
}

