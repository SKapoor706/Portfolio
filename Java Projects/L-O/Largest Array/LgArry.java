

public class LgArry
{
     public static void main (String args [])
    {
   int Array[] = {1,2,3,4,5,6,7,8};
   int largest = Array[0];
   int i = 0;    
   int n = 8;
       
        for(i = 0; i < n; i++)
        {
       if(largest < Array[i])
           {
               largest = Array[i];
            }
        }

}
}
