package com.Activities;

import Database.User;
import Database.*;
import Hacks.Hack;
import java.util.Scanner;

import static Hacks.Hack.*;

public class UserActivity {
    User uid = null;

    UserActivity(User uid) {
        this.uid = uid;
        onCreate();
    }

    private void onCreate() {
        System.out.println("\n\n--------------------------------------------\n--------------------------------------------");
        System.out.println("Logged in as " + uid.getUsername());
        showBookedCabs();
        chooseOption();
    }

    private void showBookedCabs() {
        if (uid.bookedCabs.size() == 0) {
            System.out.println("\n--------------------------\nBooked cabs will show here\n--------------------------");
        } else {
            System.out.println("\n--------------------------\nBooked Cabs:\n");
            int i=1;
            for (Cab result : uid.bookedCabs) {
//                System.out.println(i + ".From:" + result.getFromCity() + " || Type: " + result.type + " || Price: " + result.bookingPrice + " || Booked for "+result.bookedForDays+" Days");
                System.out.println(i + ".From:" + result.getFromCity() + " || Type: " + result.getType() + " || Price: " + result.getBookingPrice() + " || Booked for "+result.getBookedForDays()+" Days");

//                System.out.println(i+".From:" + result.from + "  Type: " + result.type + "  Price: " + result.bookingPrice + "   Days: " + result.bookedForDays);
                i++;
            }
            System.out.println("--------------------------\n");
        }
    }

    public void chooseOption() {
        System.out.println("1.Book a Cab\n2.Cancel a Cab\n3.Check/Edit your Data\n4.Logout");
        System.out.print("Choose An Option To Continue:");

        Scanner sc = new Scanner(System.in);
        int option = Hack.TakeArithemeticInput();
        if (option == 1) {
            uid.bookCab();
            onCreate();
        } else if (option == 4) {
            logout();

        } else if (option == 3) {
            new UserDataFragment(uid);
            onCreate();
        } else if (option == 2) {
            CancelCab(uid);
            onCreate();
        } else {
            invalidOption();
            onCreate();
        }
    }

    private void CancelCab(User uid) {
        System.out.println("\n--------------------------\nCancel a Cab:\n");
        int i = 1;

        for (Cab result : uid.bookedCabs) {
            System.out.println(i + ".From:" + result.getFromCity() + " || Type: " + result.getType() + " || Price: " + result.getBookingPrice() + " || Booked for "+result.getBookedForDays()+" Days");
            i++;
        }
        System.out.println(i + ".Go back");
        System.out.println("--------------------------\n");
        System.out.print("Choose an option:");
        Scanner sc = new Scanner(System.in);
        int option = Hack.TakeArithemeticInput();
        if (option == i)
            return;
        uid.unBookCab(option - 1);
    }

    private void logout() {
        System.out.print("logging out");
        showDots(3,500);
        System.out.println("\n");
    }
}

