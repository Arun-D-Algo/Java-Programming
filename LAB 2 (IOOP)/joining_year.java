/*For given a 9-digit registration number of a CSE student, identify the year of
joining. Assuming the first two digits specify the year of joining.*/

import java.util.Scanner;

public class joining_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long reg_no;
        int year_of_join;

        System.out.println("Enter a registration number : ");
        reg_no = scanner.nextLong();

        while(reg_no >= 1000000000L){
            System.out.println("INVALID REGISTRATION NUMBER!");
            System.out.println("TRY AGAIN");
            System.out.println("Enter a registration number : ");
            reg_no = scanner.nextLong();
        }

        year_of_join = (int)(reg_no / 10000000);

        System.out.println("The year of joining is : 20" + year_of_join);
    }
}
