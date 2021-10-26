package com.company;
import  users.*;

import java.util.Scanner;

public class AuthPage {

    void showOptins() {
        System.out.println("1.Login\n2.Signup");
    }

    void chooseOption(int option)
    {
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
        li.uid=userslist.tail.uid+1;
       System.out.println("signed up successfully...\n\n\n\n");
       int uid = li.uid;
       userMainActivity newactivity = new userMainActivity(uid);
//       newactivity.showOptions();
//       newactivity.chooseOption();
        return 0;
    }

    private int login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.next();
        userslist temp = userslist.head;
        while(temp!=null)
        {
            if(temp.getUsername().equals(username))
            {
                System.out.print("Enter Password: ");
                String pass = sc.next();
                if(temp.Authenticate(pass))
                {
                    int uid = temp.uid;
                    userMainActivity newactivity = new userMainActivity(uid);
                    newactivity.showOptions();
                    newactivity.chooseOption();
                }

                break;
            }
            temp = temp.next;
        }
        return 0;
    }
}
