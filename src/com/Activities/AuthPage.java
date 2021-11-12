package com.Activities;

import Database.UserList;
import Database.User;
import Hacks.Hack;
import Threads.CheckUserThread;
import Threads.LoginThread;

import java.util.Scanner;

import static Hacks.Hack.*;

public class AuthPage {

    void chooseOption() {
        System.out.println("Choose An Option To Continue");
        System.out.println("1.Login\n2.Signup");
        Scanner sc = new Scanner(System.in);
        int option = Hack.TakeArithemeticInput();
        if (option == 1) {
            login();
        } else if (option == 2) {
            newsignup();
        }
        else {
            invalidOption();
            }
        }
    private void newsignup() {
        bigLine();
        giveLine();
        giveSpaces(3);
        System.out.print("Sign Up Page");
        giveLine();
        bigLine();
        giveLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String SignUpUsername = (sc.next());
        CheckUserThread checkSameUsername = new CheckUserThread(SignUpUsername);
        checkSameUsername.start();
        System.out.print("Enter First Name: ");
        String SignUpFname = sc.next();
        System.out.print("Enter Last Name: ");
        String SignUpLname = sc.next();
        System.out.print("Enter Phone No: ");
        String SignUpPhone = sc.next();
        try {
            checkSameUsername.join();
        }
        catch (InterruptedException e)
        {

        }
        //checkSameUsername thread completed execution
        if (checkSameUsername.result) {
            SignUpUsername = validateUsername(SignUpUsername);
        }
        String SignUpPassword = createPassword();
        User newUser = createUser(SignUpUsername, SignUpPassword, SignUpFname, SignUpLname, SignUpPhone);
        System.out.println("\nsigned up successfully");
        System.out.print("Redirecting You to HomePage");
        showDots(3,600);
        giveLine(3);
        new UserActivity(newUser);
    }
    private String validateUsername(String SignUpUsername)
    {
        System.out.print("\nUsername " + SignUpUsername + " already exists....\nPlease Enter another username: ");
        Scanner sc = new Scanner(System.in);
        SignUpUsername = sc.next();
        User temp = UserList.head;
        boolean result=false;
        while(temp!=null)
        {
            if(temp.getUsername().equals(SignUpUsername))
            {
                result=true;
                break;
            }
            temp = temp.next;
        }
        if (result) {
           SignUpUsername = validateUsername(SignUpUsername);
        }
        return SignUpUsername;
    }
    private User createUser(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone) {
        return UserList.addNewUser(signUpUsername, signUpPassword, signUpFname, signUpLname, signUpPhone);
    }

    private String createPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create Password: ");
        String pass = sc.next();
        System.out.print("Re-enter Password: ");
        String repass = sc.next();
        if (!pass.equals(repass)) {
            System.out.println("Both Passwords should be same...");
            pass = createPassword();
        }
        return pass;
    }


    private void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.next();
        LoginThread loginThread = new LoginThread(username);
        loginThread.start();
        System.out.print("Enter Password: ");
        String pass = sc.next();
        try {
            loginThread.join();
        }catch (InterruptedException e)
        {

        }
//        System.out.println("uid: "+loginThread.getUid());
        if(loginThread.getUid()!=null)
        {
            User uid = loginThread.getUid();
            if(uid.Authenticate(pass))
            {
                System.out.println("logged in Successfully...");
                System.out.print("Redirecting You to HomePage");
                Hack.showDots(3,700);
                System.out.println("\n\n");
                new UserActivity(uid);
            }
            else
            {
                System.out.println("Incorrect Credentials..");
                System.out.print("Redirecting You to Login Page");
                Hack.showDots(3,700);
            }
        }
        else {
            System.out.println("Incorrect Credentials..");
            System.out.print("Redirecting You to Login Page");
            Hack.showDots(3,700);
        }
    }
}