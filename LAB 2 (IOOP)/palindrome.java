//Write a program to check whether a number is palindrome or not

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = scanner.nextInt();
        int rev=0, rem;
        int original_num = num;
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10; 
        }
        if(rev==original_num){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
    
}
