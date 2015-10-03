//Aman Ibrahim
//November 13, 2014

import java.io.*; 
import java.util.*;

public class StudentAverages
{
    public static void main( String args[] ) throws IOException
{
Scanner sf = new Scanner(new File("D:\\IB CS\\temp_Aman\\StudentsScores.in.txt"));
int maxIndx = -1;
String text[] = new String[1000];
while(sf.hasNext( )) //this allows the program to assign each line in the text file a variable
{
maxIndx++;
text[maxIndx] = sf.nextLine( );
}
for(int j=0; j<= 4; j++)
{
    Scanner sc = new Scanner (text[j]);
    String name = sc.next(); //this helps identify the Strings, which are the names of students, in each line
    double sum = 0.0; //it starts the sum and count variables with zero because they change as they move along with the while loop
    int count = 0;
    while (sc.hasNext())
    {
        sum = sum + sc.nextDouble(); //this while loop helps find out the number of integers in the line and adds all of these numbers as well
        count = count + 1;
        
    }
    double avg = sum/count ; 
    int y = (int)Math.round(avg); //this converts the double variable avg to an integer
    System.out.println(name + "," + " average = " + y);
}
}
}