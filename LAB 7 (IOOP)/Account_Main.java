/*Create an Account class that stores customers name, acc-no and type of account.
From this derive class current account and savings bank account. Include necessary
methods to achieve following tasks
i) Accept the deposit from a customer and update the balance
ii) Display the balance
iii) Compute and deposit interest
iv) Permit withdraw and update the balance
v) Check for minimum balance impose penalty if necessary and update the balance
For savings bank account, the facilities provided include computing interest and
withdrawal. No interest can be computed on current bank account and a minimum
balance must always be maintained. In any instance when it goes below this level,
service tax must be imposed.
 */

class Account{
    String name, account;
    int acc_no;
    double balance;
    
    Account(String name, String account, int no, double balance){
        this.name = name;
        this.account = account;
        acc_no = no;
        this.balance = balance;
    }

    void accept(double deposit){
        balance += deposit;
    }

    void display(){
        System.out.println("Name of account holder : " + name);
        System.out.println("Type of Account : " + account);
        System.out.println("Account number : " + acc_no);
        System.out.println("Current Balance : " + balance);
    }
}

class SavingsAccount extends Account{
    SavingsAccount(String name, String type, int accNo, double balance){
        super(name, type, accNo, balance);  
    }
    void interest(){
        balance += balance*0.05;
    }
    
    void withdraw(double amount){
        balance -= amount;
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String name, String type, int accNo, double balance){
        super(name, type, accNo, balance);  
    }
    void withdraw(double amount){
        balance -=amount;
        if(balance<1000){
            balance -=100;
        }
    }
}

public class Account_Main {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount("Aman", "Savings", 101, 10000);
        saving.display();
        System.out.println();
        saving.accept(1000);
        saving.display();
        System.out.println();
        saving.interest();
        saving.withdraw(2000);
        saving.display();
        System.out.println();
        CurrentAccount current = new CurrentAccount("Aman", "Current", 101, 10000);
        current.accept(2000);
        current.withdraw(10000);
        current.display();

    }

}
