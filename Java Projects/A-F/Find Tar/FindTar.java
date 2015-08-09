
public class FindTar
{
    public static void main (String args [])
    {
        int i = 0;
        int n = 5;
        int target = 3;
         
        
        int[] Array = {0, 1, 2, 3, 4};
        
        System.out.println("The number three is the target within an array of five positions.");
        System.out.println(" ");
       
        for(i = 0; i < n; i++)
        {
            if(Array[i] == target)
            {
              System.out.println( i + " was found in this position.");
            }
            else
            System.out.println("Target was not found in this position.");

    }
}
}
