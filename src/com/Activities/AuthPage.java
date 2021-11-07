package com.Activities;

import Database.UserList;
import Database.user;
import Hacks.hack;
import Threads.CheckUserThread;
import Threads.LoginThread;

import java.util.Scanner;

public class AuthPage {

    void chooseOption() {
        System.out.println("1.Login\n2.Signup");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            login();
        } else if (option == 2) {
            newsignup();
        } else {
            System.out.println("please select a valid option...");
        }
    }

    private void newsignup() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set Username: ");
        String SignUpUsername =
                (sc.next());
        CheckUserThread checkSameUsername = new CheckUserThread(SignUpUsername);
        checkSameUsername.start();
        System.out.print("First Name: ");
        String SignUpFname = sc.next();
        System.out.print("Last Name: ");
        String SignUpLname = sc.next();
        System.out.print("Phone No: ");
        String SignUpPhone = sc.next();
        if (checkSameUsername.result) {
            System.out.print("\nUsername " + SignUpUsername + " already exists....\nPlease Enter another username: ");
            SignUpUsername = sc.next();
        }
        String SignUpPassword = createPassword();
        //userslist newUser = new userslist(SignUpUsername,SignUpPassword,SignUpFname,SignUpLname,SignUpPhone);
        user newUser = createUser(SignUpUsername, SignUpPassword, SignUpFname, SignUpLname, SignUpPhone);
        System.out.println("signed up successfully...\n\n\n\n");
        new userMainActivity(newUser);

    }

    private user createUser(String signUpUsername, String signUpPassword, String signUpFname, String signUpLname, String signUpPhone) {
        return UserList.addNewUser(signUpUsername, signUpPassword, signUpFname, signUpLname, signUpPhone);
//        return new user(signUpUsername,signUpPassword,signUpFname,signUpLname,signUpPhone);
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

//    private int signUp() {
//       userslist li = new userslist();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Username : ");
//        li.setUsername(sc.next());
//        /// add fields like full name, contact number, etc ==> user will be entering these fileds and a
//        // background thread will check the usernames from the userlist class
//        /// and at the end before setting up the password he will be prompted the username alredy exists
//        CheckUserThread checkSameUsername = new CheckUserThread(li.getUsername());
//        checkSameUsername.start();
//        System.out.print("Create Password: ");
//        li.setPassword(sc.next());
//       if(userslist.head==null){
//           userslist.head=li;
//           userslist.tail = li;
//       }
//       else
//       {
//           userslist.tail.next=li;
//           userslist.tail = li;
//       }
//
//       System.out.println("signed up successfully...\n\n\n\n");
//       li.uid = li;
//       userMainActivity newactivity = new userMainActivity(li.uid);
//        return 0;
//    }

    private void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.next();
        LoginThread loginThread = new LoginThread(username);
        loginThread.start();
        System.out.print("Enter Password: ");
        String pass = sc.next();
//        System.out.println("uid: "+loginThread.getUid());
        if(loginThread.getUid()!=null)
        {
            user uid = loginThread.getUid();
            if(uid.Authenticate(pass))
            {
                new userMainActivity(uid);
            }
            else
            {
                return;
            }
        }
        else {
            System.out.println("Wrong username...");
        }
//        if (pass.equals(loginThread.getPass())) {
//            new userMainActivity(loginThread.getUid());
//        }
//        else
//        {
//            System.out.println("Wrong username or password..");
//        }
//        user temp = UserList.head;
//        boolean userfound = false;
//        while(temp!=null)
//        {
//            if(temp.getUsername().equals(username))
//            {
//                userfound = true;
//                System.out.print("Enter Password: ");
//                String pass = sc.next();
//                if(temp.Authenticate(pass))
//                {
//                    new userMainActivity(temp);
////                    user uid = temp;
////                    userMainActivity newactivity = new userMainActivity(uid);
//                }
//                break;
//            }
//            temp = temp.next;
//
//        }
//        if(!userfound)
//            System.out.println("No user with this username");
//    }
    }
}