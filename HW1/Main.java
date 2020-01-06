package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.print("Name : ");
        Scanner s1 = new Scanner(System.in);
        String Name = s1.nextLine();

        System.out.print("Account : ");
        Scanner s2 = new Scanner(System.in);
        String Account = s2.nextLine();

        Account account = new Account(Name, Account);

        while(true) {
            String[] Menu = new String[]{"1 : Deposit\r\n 2 : Withdraw\n 3 : Print Info\n 0 : Exit\n Select : "};
            System.out.print(Arrays.toString(Menu));

            Scanner s3 = new Scanner(System.in);
            int number = s3.nextInt();

           switch(number) {

               case 1 :
                    System.out.print("Amount : ");
                    Scanner dmoney = new Scanner(System.in);
                    account.deposit(dmoney.nextInt());
                    break;

               case 2 :
                    System.out.print("Amount : ");
                    Scanner wmoney = new Scanner(System.in);
                    account.withdraw(wmoney.nextInt());
                    break;

               case 3 :
                    account.printInfo();
                    break;
           }

            if(number == 0) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
