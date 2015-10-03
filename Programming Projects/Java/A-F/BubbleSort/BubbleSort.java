import java.io.*;
import java.util.*;

public class BubbleSort
{

     public static void main(String args[]) throws IOException
{
    Scanner sf = new Scanner(new File("E:\\11th Grade\\IB CS\\temp_Aman\\RandomInt.txt"));
    int maxIndx = 0;
    int size = 200000;
    int arr[] = new int[size];
    while(sf.hasNext( ) && maxIndx < size) //this allows the program to assign each line in the text file a variable
    {
        arr[maxIndx] = sf.nextInt( );
        maxIndx++;
    }
    sf.close();
    
    System.out.println("This is the array before it's bubble sorted.");
        for ( int x = 0; x < size; x++)
        {
            
            System.out.print(arr[x] + " "); 
        }
        System.out.println(" ");
        long startTime = System.currentTimeMillis();
        BubbleSort.sort(arr);
        long endTime = System.currentTimeMillis();
        long elapsedTime= endTime-startTime;
        System.out.println("The Bubble Sort Algorithm took about " + (elapsedTime)/1000.0 + " to run.");
        System.out.println(" ");
        System.out.println("This is the array after it's bubble sorted.");
        for ( int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " "); 
        }
        System.out.println("  ");
       
}

    public static void sort (int array[])
    {
        int n = 10;
        int swap;
    for(int y = array.length-1; y > 0; y--)
        {
            for (int z = 0; z < y; z++)
            {
                if(array[z] > array[z + 1])
                {
                    swap = array[z];
                    array[z]=array[z + 1];
                    array[z + 1] = swap;
                
            }
        }
        
    }
}
}
