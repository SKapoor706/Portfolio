
import java.io.*;
import java.util.*;

public class Tester
{
    private static Friend headFriend = null;
    private static Friend tailFriend = null;
    public static void main (String args[])
    {
      //add some friends to my list
      append("Bob", 9);
      append("Bobby", 11);
      append("Bobert", 20);
      append("Bobby Bobert McBob", 22);
      append("Sam", 1);
      //print out friends
      traverseAndPrint();
    }
    public static void append (String name, int age)
    {
      Friend newFriend = new Friend(name,age, null);
      if(headFriend == null)
      {
          headFriend = newFriend;
          tailFriend = headFriend; 
        }
        else
        {
            tailFriend.nextFriend = newFriend; 
            tailFriend = newFriend;
        }
    }
    public static void traverseAndPrint( )
    {
      if (headFriend == null)
      {
          System.out.println("You have no friends.");
        }
        else //in this situation, i have one friend
        {
            //System.out.print(headFriend.name + " is ");
            //System.out.println(headFriend.age + " year(s) old.");
            Friend currentFriend = headFriend;
            int pos = 1;
            do
            {
                System.out.println("Position: " + pos++);
                System.out.println("Name: " + currentFriend.name);
                System.out.println("Age: " + currentFriend.age);
                currentFriend = currentFriend.nextFriend;
            }while(currentFriend != null);
                    
            
        } 
    }
}