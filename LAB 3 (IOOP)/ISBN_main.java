/*The International Standard Book Number (ISBN) is a unique numeric book identifier
which is printed on every book. The ISBN is based upon a 10-digit code. The ISBN is
legal if:
1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8
+ 9xdigit9 + 10xdigit10 is divisible by 11.
example: For an ISBN 1401601499:
Sum=1×1 + 2×4 + 3×0 + 4×1 + 5×6 + 6×0 + 7×1 + 8×4 + 9×9 + 10×9 = 253 which
is divisible by 11.

Write a program to implement the following methods:
inputISBN( ) to read the ISBN code as a 10-digit integer.
checkISBN() to perform the following check operations:
a. If the ISBN is not a 10-digit integer, output the message “ISBN should be
a 10 digit number” and terminate the program.
b. If the number is 10-digit, extract the digits of the number and compute the
sum as explained above. If the sum is divisible by 11, output the message,
“Legal ISBN”; otherwise output the message, “Illegal ISBN” */

import java.util.Scanner;

class ISBN{
    long code;

    void inputISBN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 10 digit ISBN code : ");
        code = scanner.nextLong();
    }

    void checkISBN(){
        long temp = code;
        int count = 0;

        while(temp > 0){
        count++;
        temp /= 10;
        }

        if(count != 10){
        System.out.println("ISBN should be a 10 digit number");
        System.exit(0);
        }
        else{
            int sum = 0;
            long rem;
            int i=10;
            while(code>0){
                rem = code%10;
                sum += rem*i;
                code = code/10;
                i--;
            }
            if(sum%11==0){
                System.out.println("LEGAL ISBN!");
            }
            else{
                System.out.println("ILLEGAL ISBN!");
            }
        }
    }

}


public class ISBN_main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN();
        isbn.inputISBN();
        isbn.checkISBN();
    }
    
}
