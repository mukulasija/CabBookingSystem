package com.Activities;

import Database.UserList;
import Database.user;
import Hacks.hack;

import java.util.Scanner;

public class UserDataManageFragment {
    user uid;
    public UserDataManageFragment(user uid)
    {
        this.uid = uid;
        onCreate();
    }
    private void onCreate()
    {
        System.out.println("username:"+uid.getUsername()+" First Name: "+uid.getFname()+" Last Name: "+uid.getLname()+" Phone No: "+uid.getPhone());
        System.out.println("\n1.Change Username\n2.Change First Name\n3.Change Last Name\n4.Change Phone No\n5.Go back");
        Scanner sc = new Scanner(System.in);
        int option= hack.TakeArithemeticInput();
        switch (option)
        {
            case 1:
                ChangeUsername();
                break;
            case 2:
                ChangeFname();
                break;
            case 3: 
                ChangeLname();
                break;
            case 4:
                ChangePhone();
                break;
            case 5:
                return;
            default:
                System.out.println("Please Select a valid option....");

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

}
