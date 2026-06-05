/*Create an interface InfInterest with rate of interest, r and calculateInterest() as its
members. Implement two classes SimpleInterest and CompoundInterest that suitably
implement InfInterest. Provide parameterized constructor to initialize the data
members of the classes, if any. Also, create a class InterestDemo that determines
either of the interest amounts (based on user’s choice) by invoking calculateInterest()
only once. */

import java.util.Scanner;

interface InfInterest{
    double r  = 0.0;
    abstract double calculateInterest();
}

class SimpleInterest implements InfInterest{
    double p, r, t;

    SimpleInterest(double p, double r, double t){
        this.p = p;
        this.r = r;
        this.t = t;
    }

    public double calculateInterest(){
        return (p*t*r)/100;
    }
}

class CompoundInterest implements InfInterest{
    double p,t,r;

    CompoundInterest(double p, double r, double t){
        this.p = p;
        this.r = r;
        this.t = t;
    }

    public double calculateInterest(){
        return p*Math.pow((1+r/100), t)-p;
    }
}

public class InterestDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principle, time, rate;
        System.out.println("Enter Principle amount : ");
        principle = scanner.nextDouble();
        System.out.println("Enter Time of interest : ");
        time = scanner.nextDouble();
        System.out.println("Enter Rate of Interest : ");
        rate = scanner.nextDouble();
        System.out.println();
        System.out.println("Enter choice of Interest :");
        System.out.println("""
                1. Simple Interest 
                2. Compound Interest 
                """);
        int choice = scanner.nextInt();
        InfInterest obj;
        if(choice==1){
            obj = new SimpleInterest(principle, rate, time);
        }
        else{
            obj = new CompoundInterest(principle, rate, time);
        }

        double interest = obj.calculateInterest();
        System.out.println("TOTAL INTEREST : " + interest);

        scanner.close();

    }
}