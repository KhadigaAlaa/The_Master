package main_account;
public class Main_account 
{
    public static void main(String[] args) 
    {
        Account a1 = new Account(1122, 20000);
        a1.set_AnnualInterestRate(4.5);
        a1.withdraw(2500.0);
        a1.deposit(3000.0);
        
    }
    
}
