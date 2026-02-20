import java.util.Scanner;
import java.util.Random;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int investmentID = 10000 + random.nextInt(90000);

        System.out.println("Enter the Principal amount : ");
        double principal = scanner.nextDouble();

        while(principal<=0){
            System.out.println("ENTER A POSITIVE PRINCIPAL VALUE FOR INTEREST TO BE COMPOUNDED !");
            System.out.println("Enter the Principal amount : ");
            principal = scanner.nextDouble();
        }


        System.out.println("Enter the Annual Rate of Interest : ");
        double rate = scanner.nextDouble();

        while(rate<0){
            System.out.println("ENTER A NON NEGATIVE VALUE FOR INTEREST TO BE COMPOUNDED !");
            System.out.println("Enter the Annual Rate of Interest : ");
            rate = scanner.nextDouble();
        }


        System.out.println("Enter the Number of Years : ");
        int years = scanner.nextInt();

        while(years<=0){
            System.out.println("ENTER A POSITIVE VALUE FOR INTEREST TO BE COMPOUNDED !");
            System.out.println("Enter the Number of Years : ");
            years = scanner.nextInt();
        }


        System.out.println("Enter the Number of Times interest is compounded per year : ");
        int time = scanner.nextInt();

        while(time<=0){
            System.out.println("ENTER A POSITIVE VALUE FOR INTEREST TO BE COMPOUNDED !");
            System.out.println("Enter the Number of Times interest is compounded per year : ");
            time = scanner.nextInt();
        }
        
        double amount = CalculateAmount(principal, rate, years, time);
        double interest = CalculateInterest(amount, principal);
        DisplayResult(investmentID, amount, interest, principal, rate, time, years);

        
        
        scanner.close();
    }

    public static double CalculateAmount(double principal, double rate, int years, int time){
        rate = rate/100;
        double amount = principal*Math.pow((1+ (rate/time)), (years*time));
        return amount;
    }

    public static double CalculateInterest(double amount, double principal){
        double interest = amount - principal;
        return interest;
    }

    public static void DisplayResult(int investmentID, double amount, double interest, double principal, double rate, int time, int years){
        System.out.println("\n-------------------------COMPOUND INTEREST REPORT-------------------------\n");
        System.out.println();
        System.out.println("Investment ID : " + investmentID);
        System.out.println();
        System.out.printf("Principal Amount:     %.2f\n", principal);
        System.out.printf("Annual Interest Rate:     %.2f%%\n", rate);
        System.out.printf("Compounding Frequency:     %d\n", time);
        System.out.printf("Investment Duration:     %d years\n", years);

        System.out.println("\n-----------------------------------------\n");

        System.out.printf("Final Amount:     %.2f\n", amount);
        System.out.printf("Total Interest Earned:     %.2f\n", interest);

        System.out.println("\n-----------------------------------------");
    }
}
