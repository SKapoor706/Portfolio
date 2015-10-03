import java.util.*;
import java.io.*;

public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList list = new LinkedList();
      // add elements to the linked list
      list.add("M");
      list.add("A");
      list.add("N");
      list.add("is");
      list.add("#");
      list.addLast("1");
      list.addFirst("A");
      list.add(0, "A2");
      System.out.println("The contents of the linked list are: " + list); 
    }
}