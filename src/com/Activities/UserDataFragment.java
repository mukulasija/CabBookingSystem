package com.Activities;

import Database.User;
import Hacks.Hack;

import java.util.Scanner;

import static Hacks.Hack.*;

public class UserDataFragment {
    User uid;

    public UserDataFragment(User uid) {
        this.uid = uid;
        onCreate();
    }

    private void onCreate() {
        giveLine(3);
        bigLine(30);
        giveLine();
        giveSpaces(3);
        System.out.print("Showing " + uid.getFname() + "'s Profile");
        giveLine();
        bigLine(30);
        giveLine();
        System.out.println("username:" + uid.getUsername() + " || First Name: " + uid.getFname() + "\nLast Name: " + uid.getLname() + " || Phone No: " + uid.getPhone());
        System.out.println("\n1.Change Phone No\n2.Change First Name\n3.Change Last Name\n4.Go back");
        Scanner sc = new Scanner(System.in);
        int option = Hack.TakeArithemeticInput();
        switch (option) {
            case 1:
                ChangePhone();
                break;
            case 2:
                ChangeFname();
                break;
            case 3:
                ChangeLname();
                break;
            case 4:
                return;
            default:
                invalidOption();
                break;
        }
        onCreate();
    }

    private void ChangePhone() {
        uid.ChangePhoneWithPass();
    }

    private void ChangeLname() {
        uid.ChangeLnameWithPass();
    }

    private void ChangeFname() {
        uid.ChangeFnameWithPass();
    }

    private void ChangeUsername() {
        uid.ChangeUsernameWithPass();
    }
    //TODO username should be unique

}
