package com.company;

import Database.userslist;
import Database.*;
import Threads.CheckUserThread;

import java.util.Scanner;

public class AuthPage extends userslist {

//
//    void showOptins() {
//        System.out.println("1.Login\n2.Signup");
//    }

    void chooseOption()
    {        System.out.println("1.Login\n2.Signup");
        Scanner sc = new Scanner(System.in);
        int option= sc.nextInt();
        if(option==1)
        {
            login();
        }
        else
        if(option==2)
        {
            signUp();
        }
        else
        {
            System.out.println("please select a valid option...");
        }
    }

    private int signUp() {
       userslist li = new userslist();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username : ");
        li.setUsername(sc.next());
        /// add fields like full name, contact number, etc ==> user will be entering these fileds and a
        // background thread will check the usernames from the userlist class
        /// and at the end before setting up the password he will be prompted the username alredy exists
        CheckUserThread checkSameUsername = new CheckUserThread(li.getUsername());
        checkSameUsername.start();
        System.out.print("Create Password: ");
        li.setPassword(sc.next());
       if(userslist.head==null){
           userslist.head=li;
           userslist.tail = li;
       }
       else
       {
           userslist.tail.next=li;
           userslist.tail = li;
       }

       System.out.println("signed up successfully...\n\n\n\n");
       li.uid = li;
       userMainActivity newactivity = new userMainActivity(li.uid);
        return 0;
    }

    private int login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.next();
        userslist temp = userslist.head;
        boolean userfound = false;
        while(temp!=null)
        {
            if(temp.getUsername().equals(username))
            {
                userfound = true;
                System.out.print("Enter Password: ");
                String pass = sc.next();
                if(temp.Authenticate(pass))
                {
                    userslist uid = temp;
                    userMainActivity newactivity = new userMainActivity(uid);
                }
                break;
            }
            temp = temp.next;

        }
        if(!userfound)
            System.out.println("No user with this username");
        return 0;
    }
}
