import java.io.*; //necessary for File and IOException
import java.util.*; //necessary for Scanner
public class InputNumData
{
public static void main( String args[] ) throws IOException
{
Scanner sf = new Scanner(new File("D:\\IB CS\\temp_Aman\\NumData.in.txt"));
int maxIndx = -1;
String text[] = new String[1000];
while(sf.hasNext( ))
{
maxIndx++;
text[maxIndx] = sf.nextLine( );
System.out.println(text[maxIndx]); 
}
String answer = ""; 
int sum; //accumulates sum of integers
for(int j =0; j <= maxIndx; j++)
{
Scanner sc = new Scanner(text[j]);
sum = 0; //important to set to 0; otherwise it will remember the last sum
answer = ""; //otherwise it will remember last answer String
while( sc.hasNext( ) ) //We could also have used hasNextInt( ) here
{
int i = sc.nextInt( );
answer = answer + " + " + i;
sum = sum + i;
}
answer = answer + " = " + sum;
System.out.println(answer);
}
}
}