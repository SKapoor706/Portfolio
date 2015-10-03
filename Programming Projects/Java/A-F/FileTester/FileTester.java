import java.util.*;
import java.io.*;
public class FileTester
{
public static void main(String args[])throws IOException
{
    Scanner input = new Scanner(new File("D:\\IB CS\\temp_Aman\\MyData.in.txt"));
    int maxIndx = -1; //-1 so when we increment below, first index is 0
String text[] = new String[1000]; //to be safe, declare more than we need
while(input.hasNext( ))
{
maxIndx++;
text[maxIndx] = input.nextLine( ) ;
}
//maxIndx is now the highest index of text[], -1 if no text lines
input.close( ); //We opened a file above so close it when finished.
for(int j = 0; j <= maxIndx; j++)
{
System.out.println( text[j] );
}
    
}
}
