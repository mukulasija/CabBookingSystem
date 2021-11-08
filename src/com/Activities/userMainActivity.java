package com.Activities;

import Database.user;
import Database.*;
import Hacks.hack;

import java.util.Scanner;
public class userMainActivity  {
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
                System.out.println("From:"+result.from+"  Type: "+result.type+"  Price: "+result.bookingPrice+"   Days: "+result.bookedForDays);

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
        System.out.println("1.Book a Cab\n2.Logout\n3.Your Data\n4.Cancel Cab");
        System.out.print("Choose An Option To Continue:");

        Scanner sc = new Scanner(System.in);
        int option = hack.TakeArithemeticInput();
        if(option==1)
        {
            new BookCabFragment(uid);
//            uid.bookNewCab();
            onCreate();
        }
        else
        if(option==2)
        {
            logout();
        }
        else
        if(option==3)
        {
            new UserDataManageFragment(uid);

            onCreate();
        }
        else
            if(option==4)
            {
                CancelCab(uid);
                onCreate();
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

    private void CancelCab(user uid) {
        System.out.println("\n--------------------------\nBooked Cabs:\n");
        int i=1;
        for(cab result : uid.bookedCabs)
        {
            System.out.println(i+".From:"+result.from+" Type: "+result.type+" Price: "+result.pricePerKm+"(per km)");
            i++;
        }
        System.out.println(i+".Go back");
        System.out.println("--------------------------\n");
        Scanner sc = new Scanner(System.in);
        int option = hack.TakeArithemeticInput();
        if(option==i)
            return;
        uid.unBookCab(option-1);
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

