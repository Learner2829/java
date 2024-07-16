class BankAccount{
    long acnumber;
    double balance;
   String Name;
   
   void set(long t_acnumber,double t_balance,String t_Name) {
      acnumber=t_acnumber;
      balance=t_balance;
      Name=t_Name;
   }
   void deposit(double amout){
        balance=amout+balance;
        System.out.println("Your Account is creadited:"+amout);
        System.out.println("Your Account Balance is :"+balance);
   }
      void withdraw(double amout){
        if(amout>balance){
            System.out.println("Your Account is not sufficent balance");
        }
        else
        {
            balance=balance-amout;
            System.out.println("Your Account is debited:"+amout);
            System.out.println("Your Account Balance is :"+balance);
        }

   }
}
public class Assignment_2_two {
//Write a BankAccount class with the following properties: accountNumber, balance, 
// and owner. Implement methods to deposit, withdraw, and check the account balance
            public static void main(String args[]){
                BankAccount b1=new BankAccount();
                b1.set(929292929, 70000,"Ashish");
                b1.deposit(1000);            
                b1.withdraw(1000);
            }
}
