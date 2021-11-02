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
}
