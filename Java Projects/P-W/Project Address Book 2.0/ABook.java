import java.io.*;
import java.util.*;

public class ABook
{
   public static void main (String args[])
   {
       LinkedList addressBook = new LinkedList(); //creates linked list
       Scanner input = new Scanner(System.in);
       int n = 1; //this will be used for the loop to act as a counter for the loop
       do{
       System.out.println("Would you like to add a friend? (Say Y or N)"); 
       String reply = input.nextLine();
       if(reply.equals("Y"))
       {
        System.out.println("What is the name of your friend?");
        String name = input.nextLine();
        System.out.println("What is the age of your friend?");
        int age = input.nextInt();
        Friend newFriend = new Friend(name,age);
        addressBook.add("Name: " + newFriend.name + "; " + "Age: " + newFriend.age);
        Collections.sort(addressBook);
        System.out.println("This is your Address Book so far: " + addressBook);
        n++; //adds to the counter every "Y" loop
    }     
   

       else if(reply.equals("N")){
        System.out.println("Thank you for your time");
        System.out.println("Would you like to know who is in your Address Book? (Say Y or N)");
        String userinput = input.nextLine();
         if(userinput.equals("Y"))
       {
        System.out.println("This is your Address Book so far: " + addressBook);
        System.out.println("Goodbye!");
    }     
        else if(userinput.equals("N")){
        System.out.println("Okay! Goodbye!");
    }
        n = 1; //causes the loop to stop
    }
    }while (n > 1); //technically means you have a 100 friend limit 
}
}
 