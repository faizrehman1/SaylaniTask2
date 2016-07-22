package com.company;

import java.util.Scanner;

public class BankAccounts {

    private double Balance=1000;

    Scanner input = new Scanner(System.in);
    public void deposit(){
      System.out.println("Enter Amount You want to Deposit");
        double in;
        in = input.nextInt();
        Balance +=in;
        System.out.println("Your Current Balance is "+Balance);

    }

    public void withDraw(){
        System.out.println("Enter Amount You want to withDraw");
        double in;
        in = input.nextInt();
        Balance -=in;
        System.out.println("Your Current Balance is "+Balance);

    }
    public void display(){
        System.out.print("YOur Balance is"+Balance);
    }

}
