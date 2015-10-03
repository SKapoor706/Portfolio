//Aman Ibrahim
//September 18, 2014


import java.util.*;
 
import java.io.*;

public class tester {
 
        public static void main(String args[])
        {
            
                Scanner reader = new Scanner(System.in);//Creates Scanner
                System.out.println("How much money is in your account?"); //Prints inital question
                double b = reader.nextDouble();//Allows user to interacte with program/ input info
                System.out.println("What is the name attached to your account?");
                String n = reader.next();
                double balance;
                     BankAccount myAccount = new BankAccount(b, n);
                     //Creates object called myAccount
                     myAccount.setBalance(balance);
                int g;
                do
                {
                    System.out.println("Would you like to deposit or withdraw?");
                    System.out.print("\nPress d or w: \n");
                    String k= reader.next();
                    char ch=k.charAt(0);
                    switch(ch)
                    {
                        case 'w':
                        case 'W':
                        System.out.print("\nHow much?");
                        double w = reader.nextDouble();
                        myAccount.setBalance(myAccount.balance-w);
                        System.out.print("\nThe " + n + " account balance is, $" + myAccount.balance+"\n");
                        break;
                        case 'd':
                        case 'D':
                        System.out.print("\nHow much? ");
                        double de = reader.nextDouble();
                        myAccount.setBalance(myAccount.balance+de);
                        System.out.println("The " + n + " account balance is $" +myAccount.balance);
                    }
                    System.out.println("Would you like to continue? \n1.Yes\n2.No\n");
                    g= reader.nextInt();
                }
                while(g==1);
            }
                BankAccount myAccount = new BankAccount(b, n); //Creates object called myAccount
               
        }
       
