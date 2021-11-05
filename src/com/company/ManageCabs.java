package com.company;

import Database.cabList;

import java.util.Scanner;

public class ManageCabs {

    public void addCab()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("From: ");
        String from = sc.next();
        System.out.print("Type: ");
        String type = sc.next();
        cabList newcab = new cabList(from,type);
        if(cabList.head==null)
        {
            cabList.head=newcab;
            cabList.tail=newcab;
        }
        else{
            cabList.tail.next=newcab;
            cabList.tail=newcab;
        }
    }

    public void addCab(String from,String type,int pricePerKm,String driverName,int capacity)
    {
        Scanner sc = new Scanner(System.in);
//        System.out.print("From: ");
//         from = sc.next();
//        System.out.print("Type: ");
//         type = sc.next();
//         System.out.println("Price Per Km: ");
//         pricePerKm = sc.nextInt();
//         System.out.println("Driver Name: ");
//         driverName = sc.next();
        cabList newcab = new cabList(from,type,pricePerKm,driverName,capacity);
        if(cabList.head==null)
        {
            cabList.head=newcab;
            cabList.tail=newcab;
        }
        else{
            cabList.tail.next=newcab;
            cabList.tail=newcab;
        }
    }

}
