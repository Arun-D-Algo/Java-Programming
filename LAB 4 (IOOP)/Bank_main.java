/*Define a class to represent a Bank account. Include the following members.
Data members:
a. Name of the depositor
b. Account number.
c. Type of account.
d. Balance amount in the account.
e. Rate of interest (static data)

Provide a default constructor and parameterized constructor to this class. Also
provide Methods:
a. To deposit amount.
b. To withdraw amount after checking for minimum balance.
c. To display all the details of an account holder.
d. Display rate of interest (a static method)
Illustrate all the constructors as well as all the methods by defining objects.*/

class BANK{
    String dname;
    long accno;
    String acctype;
    double balance;
    static double roi = 6.5;

    BANK(){
        dname = "Unknown";
        accno = 0;
        acctype = "Unknown";
        balance = 0.0;
    }

    BANK(String dname, long accno, String acctype, double balance){
        this.dname = dname;
        this.accno = accno;
        this.acctype = acctype;
        this.balance = balance;
    }

    void deposit(int num){
        balance += num;
        System.out.println("Amount deposited : " + num);
        System.out.println("Current Balance : " + balance);
    }

    void withdraw(int num){
        balance -= num;
        System.out.println("Amount withdrawn : " + num);
        System.out.println("Current Balance : " + balance);
    }

    void display_roi(){
        System.out.println("The rate of interest is : " + roi);
    }

    void display(){
        System.out.println("ACCOUNT DETAILS OF USER : ");
        System.out.println("Name of Account Holder : " + dname);
        System.out.println("Account Number : " + accno);
        System.out.println("Type of Account : " + acctype);
        System.out.println("Current Balance of Account : " + balance);
    }
}

public class Bank_main {
    public static void main(String[] args) {
        System.out.println("BANK ACCOUNT WITH DEFAULT CONSTRUCTOR : ");
        System.out.println();
        BANK b1 = new BANK();
        b1.display();
        System.out.println();
        System.out.println("BANK ACCOUNT WITH PARAMETERIZED CONSTRUCTOR : ");
        System.out.println();
        BANK b2 = new BANK("Arun", 10232, "Fluid", 20000);
        b2.display();
        System.out.println();
        b2.deposit(3000);
        System.out.println();
        b2.withdraw(4000);
    }
}
