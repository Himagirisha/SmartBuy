package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Customer cus=new Customer();

    Scanner cust = new Scanner(System.in);
    System.out.println("Enter Customer Name:");
    cus.setCustomerName(cust.next());



    Scanner email=new Scanner(System.in);
    System.out.println("Enter EmailID:");
    cus.setemailId(email.next());


    Scanner ph=new Scanner(System.in);
    System.out.println("Enter Phone number:");
    cus.setContactNumber(Long.parseLong(ph.next()));


    Scanner ag=new Scanner(System.in);
    System.out.println("Enter Age:");
    cus.setAge(Integer.parseInt(ag.next()));


        System.out.println("Name:"+" "+cus.getCustomerName());
        System.out.println("ContactNumber:" +" "+cus.getContactNumber());
        System.out.println("EmailID :"+" "+cus.getemailId());            //check for attribute also
        System.out.println("Age :"+" "+cus.getAge());
    }
}
