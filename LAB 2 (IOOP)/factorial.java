//Write a Java programs to print factorial of a given no recursively

import java.util.Scanner;

public class factorial {

    public static int factorial (int x){
        if(x==0){
            return 1;
        }
        else{
        return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number to compute its factorial : ");
        n = scanner.nextInt();
        System.out.println("The factorial of the given number is : " + factorial(n));
    }
}
