/*Write a Java program to display non diagonal elements and find their sum.
[Hint: Non Principal diagonal: The diagonal of a diagonal matrix from the top
right to the bottom left corner is called non principal diagonal.]*/

import java.util.Scanner;

public class ndiag_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter square array dimension : ");
        n = scanner.nextInt();
        System.out.println("Enter array elements : ");
        int[][] arr = new int [n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("The array entered is : ");
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                if(j==n-i-1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of the non principal diagonal elements of the given matrix is : " + sum);
    }
}
