package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        final int pass = 1234;
        int in;
        boolean doCont = true;
        BankAccounts bankAccounts = new BankAccounts();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To State Bank Of Saylani");
        System.out.println("Enter Your Pass to Check YOu Account Detail ...?");
        in = input.nextInt();
        if (in == pass) {
            do {

                System.out.println("Enter 1 for Deposit");
                System.out.println("Enter 2 for WithDraw");
                System.out.println("Enter 3 for Display Balance");
                in = input.nextInt();
                switch (in) {
                    case 1:
                        bankAccounts.deposit();
                        break;
                    case 2:
                        bankAccounts.withDraw();
                        break;
                    case 3:
                        bankAccounts.display();
                        break;
                    default:
                        System.out.println("YOu Enter a wrong Option !");
                        break;
                }

                char option;
                System.out.println("Do You want to Continue?");
                option = input.next().charAt(0);
                if (option == 'n' || option == 'N') {
                    System.out.println("Thank You.. Have a nice Day..");
                    break;
                }

            } while (doCont);

        }else {
                System.out.println("You enter an incorrect password");
            }


    }
}
