import java.util.Scanner;

class company_hours{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hours, rate, salary;
        System.out.println("Enter number of hours worked : ");
        hours = scanner.nextInt();
        System.out.println("Enter hourly rate of pay : ");
        rate = scanner.nextInt();
        if(hours<=40){
            salary = hours*rate;
        }
        else {
            salary = 40*rate + (hours-40)*rate/2;
        }
        System.out.println("The final salary of the employee is : " + salary);
    }
}