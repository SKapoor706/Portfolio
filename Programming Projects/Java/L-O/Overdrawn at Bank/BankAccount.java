 
 //Aman Ibrahim
 
 
public class BankAccount {
       
 
       
        public BankAccount(double b, String n) 
        {
                name = n; //creates variables
                balance = b;
                               
       
        }
       
        public void deposit(double d)
        {
               
                 balance += d; //this means the deposit will add into the balance
 
               
        }
        public void withdraw(double w)
        {
               
                 balance -= w; //this means the withdraw removes from the balance
 
        }
 
        public double balance;
        public String name;
       
}
 
