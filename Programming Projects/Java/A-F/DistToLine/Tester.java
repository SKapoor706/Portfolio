import java.util.*;
import java.io.*;

public class Tester
{
    public static void main (String args[])
    {
        Scanner reader = new Scanner (System.in); 
        System.out.println("Input the value for A: ");
        DistToLine.A = reader.nextDouble(); //when you say DistToLine.A, the A variable from
        //the other class is being called. This is the same for all the other variables
        System.out.println("Input the value for B: ");
        DistToLine.B = reader.nextDouble();
        System.out.println("Input the value for C: ");
        DistToLine.C = reader.nextDouble();
        System.out.println("Input the x coordinate: ");
        double x = reader.nextDouble(); //unlike the other variables, this variable must be declared in this class
        System.out.println("Input the y coordinate: ");
        double y = reader.nextDouble();
        System.out.println("Distance from point to line: ");
        System.out.print(DistToLine.getDist(x, y)); 
    }
}

