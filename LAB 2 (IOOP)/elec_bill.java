/*Write a Java program to compute the electricity bill for an industry using a
switch-case statement. The program should take the daily consumption in units
for 7 days as input. Based on the total consumption, the program should
calculate and display the total electricity bill according to the following pricing
table:
Units Price per Unit (INR)
0 - 100 7.00
101 - 200 8.00
>= 201 10.00*/

import java.util.Scanner;

public class elec_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units=0;
        int[] days = new int[7];
        int i=0;
        while(i<7){
            System.out.println("Enter units of electricity consumed on day " + (i+1) + " : ");
            days[i]= scanner.nextInt();
            i++;
        }
        System.out.println("Units consumed every day of the week are : ");
        for (int unit : days){
            System.out.print(unit + " ");
        }
        for(int j=0; j<7;j++){
            units += days[j];
        }
        int bill=0;
        switch(units/100){
            case(0):
                bill = units*7;
                break;
            case(1):
                bill = 700 + (units-100)*8;
                break;
            case(2):
                bill = 1500 + (units-200)*10;
                break;
        }
        System.out.println("The final electricity bill for the entire week is : " + bill);
    } 
}
