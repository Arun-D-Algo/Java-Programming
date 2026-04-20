/* Create a class with integer array of size 10 and write methods to perform following. Use
Switch case to accept choice from the user.
a. Input values into an array
b. Display the values
c. Display the largest value
d. Display the average
e. Sort the array in ascending order */

import java.util.Scanner;
import java.util.Arrays;

class ARRAY{
    int[] arr = new int[10];

    void read(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
    }

    void display(){
        for(int num : arr){
            System.out.print(num + " ");
            System.out.println();
        }
    }

    void largest(){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest Number : " + max);
    }

    void average(){
        double average, sum=0;
        for(int num : arr){
            sum += num;
        }
        average = (sum/10);
        System.out.println("Average of all numbers : " + average);
    }

    void sort(){
        Arrays.sort(arr);
        System.out.println("The sorted array is : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
    }
}

public class array_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ARRAY array = new ARRAY();
        int choice=0;
        while(choice != 6){
        System.out.println("Enter your choice out of the following : ");
        System.out.println("""
                1. Input values into an array
                2. Display the values
                3. Display the largest value
                4. Display the average
                5. Sort the array in ascending order
                6. Exit
                """);
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                array.read();
                break;
            case 2: 
                array.display();
                break;
            case 3:
                array.largest();
                break;
            case 4:
                array.average();
                break;
            case 5: 
                array.sort();
                break;
            case 6:
                System.out.println("Exiting program...");
        }
        }
    }
}
