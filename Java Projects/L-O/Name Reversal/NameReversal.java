import java.util.Scanner;
public class NameReversal
{
    public static void main(String args[])
    {
        Scanner scnnr= new Scanner(System.in);
        System.out.println("Please enter your name...");
        String name= scnnr.nextLine();
      
        int len=name.length();
        String rev=""; 
        for (int x = len - 1; x>=0; x--)
        {
            char letter= name.charAt(x);
            rev= rev + letter;
        }
        System.out.println(rev);
    }
}
           
     