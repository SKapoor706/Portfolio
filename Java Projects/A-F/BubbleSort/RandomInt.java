
import java.io.*; 
import java.util.*;

public class RandomInt
{
public static void main( String args[] ) throws IOException
{
    Random r = new Random();
    int i = r.nextInt(10000) + 1; 
   FileWriter fw = new FileWriter("E:\\11th Grade\\IB CS\\temp_Aman\\RandomInt.txt");
   PrintWriter output = new PrintWriter(fw);
    for (int x=0; x<200001; x++)
    {
        output.println(r.nextInt(10000)+1);
    }

}
}
