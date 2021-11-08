package com.Activities;

import Database.cab;
import Database.user;
import Hacks.hack;
import Threads.FindCabThread;
import Threads.FindCityThread;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookCabFragment {
    user uid ;
    BookCabFragment(user uid)
    {
        this.uid = uid;
        onCreate();
    }

    private void onCreate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people: ");
        int passengerCount = hack.TakeArithemeticInput();
        System.out.print("From: ");
        String fromCity = hack.FormatString(sc.next());
        FindCityThread fromThread = new FindCityThread(fromCity);
        fromThread.start();
        FindCabThread fc = new FindCabThread(fromCity,passengerCount);
        fc.start();
        System.out.print("To: ");
        String toCity = hack.FormatString(sc.next());
        FindCityThread toThread = new FindCityThread(toCity);
        toThread.start();
        System.out.print("How many Days: ");
        int days = hack.TakeArithemeticInput();
        int frindex = fromThread.index;
        int toindex = toThread.index;
        int dist = Math.abs(frindex-toindex);
        List<cab> results = fc.results;
        if (results.size() == 0)
        {
            System.out.println("\nNo Cabs From Given Location..");
            return;
        }

        System.out.println("\nAvailable cabs:\n");
        int i=1;
        int price;
        for(cab result :results)
        {
             price = result.pricePerKm*(dist%10)*(days*100);
            System.out.println(i+". From: "+result.from+"  To: "+toCity+"  Type: "+result.type+"  Price: "+price+"  Capacity: "+result.capacity);
            i++;
        }
        System.out.println(i+". Go back");
        int option = hack.TakeArithemeticInput();
        if(option==i)
            return;
        uid.bookedCabs.add(results.get(option-1));
//        results.get(option-1).bookedByUser=uid;

        price = results.get(option-1).pricePerKm*(dist%10)*(days*100);
        results.get(option-1).book(uid,days,price);
    }
}
