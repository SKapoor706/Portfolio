
/**
Aman Ibrahim
October 18, 2014
*/
import java.util.*;
public class AscendDescend
{

    public static void main(String args[])
    {
        String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        int namelen = 10; //the number of names in the array
        Arrays.sort(ss); //Sorts array in aplhabetical order
        System.out.println("Ascend" + "   " + "Descend"); //Prints the headers
        System.out.println(" "); //Prints space to make program look "neater".
        for(int i = 0; i < namelen; i++) //creates i integer for the 'for loop' 
        {

        System.out.println(ss[i] + "       " + ss[9-i]); //Prints the two columns of names. 
        //First one is ascending order and the next in descending order.
    }
}
}
