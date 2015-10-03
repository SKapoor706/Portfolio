
/*Aman Ibrahim
 * October 2nd, 2014
 */

public class Crypto
{
   public String str; //creates str variable
   
   public String encrypt(String s) //creates encrypt method
    {
       str = s.replace("v", "ag,r"); //replaces v with ag,r
       
       str = str.replace("m", "ssad");
       
       str = str.replace("g", "jeb..w");
       
       str = str.replace("b", "dug>?/");
       
       return str;
    }
   public String decrypt(String s) //creates decrypt method 
   {
      
        
       
       str = s.replace("dug>?/", "b"); //changes dug>/ back to b
        str = str.replace("jeb..w", "g");
         str = str.replace("ssad", "m");
         str = str.replace("ag,r","v");
       
       
       
       return str;
    }
}
