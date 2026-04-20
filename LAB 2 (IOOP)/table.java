//Write a Java program to print table of number entered by user.

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to print its table : ");
        num = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" x "+i+" = " + (num*i));
        }
    }
}
