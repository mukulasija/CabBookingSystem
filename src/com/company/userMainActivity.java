package com.company;

import java.util.Scanner;

public class userMainActivity {
    int uid = 0;
    userMainActivity(int uid)
    {
        this.uid = uid;
        showBookedCabs();
        chooseOption();
    }

    private void showBookedCabs() {
        System.out.println("--------------------------\nBooked cabs will show here\n--------------------------\n");
    }

    public void showOptions()
    {
        System.out.println("1.Logout");
    }
    public void chooseOption()
    {
        System.out.println("1.Logout");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1)
        {
            logout();
        }
        else
        {
            System.out.println("Please select a valid option...");
            chooseOption();
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

