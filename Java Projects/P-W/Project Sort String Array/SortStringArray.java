/*Aman Ibrahim
 * October 16, 2014
 * 4A Block
 */
import java.util.*;
import java.io.*;

public class SortStringArray
{
    public static void main (String args[])
    {
 String names[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra","Herman"};
 //these are the names in the array
 int namelen = 10; //states the number of names in the array
 Arrays.sort(names); //this sorts the array in an alphabetical order
 for(int i = 0; i < namelen; i++)//This is the for loop for the array. This states if the integer "i" equals zero or is lower than 10, then add to the integer "i". 
    { 
     System.out.println(names[i]); //Prints out the newly sorted array.         
    }
}
}
