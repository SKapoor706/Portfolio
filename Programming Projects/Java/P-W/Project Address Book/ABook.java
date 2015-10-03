
/**
 * Aman Ibrahim
 * 9 April 2015
 */
import java.io.*;
import java.util.*;

public class ABook
{
    public static void main (String args[])
    {
        LinkedList addressBook = new LinkedList();
        System.out.println("This was my contact list before I was cool: " + addressBook + "-dust-");
        addressBook.add("Bobby McBob - 26 years old");
        addressBook.add(0, "Bobert - 17 years old");
        addressBook.addLast("Bobby Bobert McBobben II - 49 years old");
        addressBook.add(0, "Bobby - 12 years old");
        addressBook.addFirst("Bob - 8 years old");
        System.out.println("This was my contact list once I became cool: " + addressBook);
        addressBook.remove(4);
        System.out.println("This is my current contact list: " + addressBook);
    }
}
