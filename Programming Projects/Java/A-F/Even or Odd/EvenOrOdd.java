import java.util.Scanner;
public class EvenOrOdd{

     public static void main(String []args){
        int x;
        System.out.print("Enter an integer to check if it is even or odd: ");
        Scanner in= new Scanner(System.in);
        x=in.nextInt();
        int z=0;
        System.out.println(x);
        if ( x % 2 == 0)
        System.out.println("You have entered an even number");
        else
        System.out.println("You have entered an odd number");
        if (x==z)
        System.out.println("You entered zero");
        
     }
}