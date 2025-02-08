//design super class Customer (name, phone-number). Derive a class depositor(accno, balance)from customer.
//Again, derive a class Borrower (loan-no, loan-amt) from depositor. write necessary member functions to read and
//display the details of the 'n' customer


import java.util.*;
class Customer
{
    String name;
    long phone;
    Customer(String name,long phone)
    {
        this.name=name;
        this.phone=phone;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
    }
}
class Depositor extends Customer
{
    int acno;
    double balance;
    Depositor(String name,long phone,int acno,double balance)
    {
        super(name,phone);
        this.acno=acno;
        this.balance=balance;
    }
    void display()
    {
        super.display();
        System.out.println("Account Number: "+acno);
        System.out.println("Balance: "+balance);
    }
}
class Borrower extends Depositor
{
    int loan_no;
    double loan_amt;
    Borrower(String name,long phone,int acno,double balance,int loan_no,double loan_amt)
    {
        super(name,phone,acno,balance);
        this.loan_no=loan_no;
        this.loan_amt=loan_amt;
    }
    void display()
    {
        super.display();
        System.out.println("Loan Number: "+loan_no);
        System.out.println("Loan Amount: "+loan_amt);
    }
}
class CustomerDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of customers");
        int n=sc.nextInt();
        Borrower b[]=new Borrower[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of customer "+(i+1));
            System.out.println("Enter name");
            String name=sc.next();
            System.out.println("Enter phone number");
            long phone=sc.nextLong();
            System.out.println("Enter account number");
            int acno=sc.nextInt();
            System.out.println("Enter balance");
            double balance=sc.nextDouble();
            System.out.println("Enter loan number");
            int loan_no=sc.nextInt();
            System.out.println("Enter loan amount");
            double loan_amt=sc.nextDouble();
            b[i]=new Borrower(name,phone,acno,balance,loan_no,loan_amt);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Details of customer "+(i+1));
            b[i].display();
        }
        sc.close();
    }
}