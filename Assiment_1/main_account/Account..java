package main_account;
public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
     
   public Account()
   {
        dateCreated = new java.util.Date();
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
   }
   
   public Account(int Id, double Balance) 
   {
        id = Id;
        balance = Balance;
   }
   public void set_Id(int Id)
   {
       id=Id;
   }
   public int get_Id()
   {
      return id;
   }
   public void set_Balance(double Balance)
   {
        balance = Balance;
    }
   public double get_Balance()
   {
        return balance;
   }
   public void set_AnnualInterestRate(double AnnualInterest_Rate) 
   {
        annualInterestRate = AnnualInterest_Rate;
    }
    public double get_AnnualInterestRate()
    {
        return annualInterestRate;
    }

    public String get_DateCreated() 
    {
        return this.dateCreated.toString();
    }

    public double getMonthlyInterestRate() 
    {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() 
    {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double value)
    {
        this.balance -= value;
    }

    public void deposit(double value) 
    {
        this.balance += value;
    }
    public void print()
    {
        System.out.println("Balance: " + get_Balance());
        System.out.println("Monthly Interest: " + getMonthlyInterest());
        System.out.println("Date Created: " + get_DateCreated());
    }
}
