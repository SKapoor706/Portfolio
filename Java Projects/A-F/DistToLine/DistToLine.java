import java.util.*;
import java.io.*;

public class DistToLine
{
   static double A; //declares static variables, which allows the variables to used outside this class without an object
   static double B;
   static double C;
   static double dist;
   public static double getDist(double a, double b) //these parameters will be the x and y coordinates in the program
    {
        double Aa = ( A * a );
        double Bb = ( B * b );
        double part1 = (Aa + Bb + C); 
        if (part1 < 1) //this works as an absolute value
        {
            part1= part1 * -1;
        }
        double A2 = (A * A);
        double B2 = (B * B);
        double A2B2 = (A2 + B2);
        double part2 = Math.sqrt(A2B2); //this squares the addition A2 + B2
        dist = part1 / part2; //this is the same thing as |Aa+Bb+C| ÷ √(A^2 + B^2)
        return dist;
    }
}
