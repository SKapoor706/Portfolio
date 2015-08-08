import java.io.*;
import java.util.*;

public class Reader
{
  public static void main(String args[]) throws IOException
{
    Scanner sf = new Scanner(new File("E:\\11th Grade\\IB CS\\temp_Aman\\RandomInt.txt"));
    int maxIndx = -1;
    int size = 20;
    int array[] = new int[size];
    while(sf.hasNext( )) //this allows the program to assign each line in the text file a variable
    {
        maxIndx++;
        array[maxIndx] = sf.nextInt( );
    }
    sf.close();
}
}

/*public static void main (String args[])
{
        int x;
        int array[]= {5,4,8,1,3,2,6,7,0,9};
        System.out.println("This is the array before it's bubble sorted.");
        for ( x = 0; x < 10; x++)
        {
            
            System.out.print(array[x] + " "); 
        }
        System.out.println(" ");
        BubbleSort.sort(array);
        System.out.println("This is the array after it's bubble sorted.");
        for ( int i = 0; i < 10; i++)
        {
            System.out.print(array[i] + " "); 
        }
        System.out.println("  ");
    }*/