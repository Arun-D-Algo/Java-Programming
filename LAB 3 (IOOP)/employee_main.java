/*Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA,
Gross_Sal, Net_Sal and following methods:
a. read(): to read N employee details
b. display(): to display employee details
c. compute_net_sal(): to compute net salary
Write a Java program to read data of N employee and compute and display net salary
of each employee 
Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of
the gross salary) */

import java.util.Scanner;

class EMPLOYEE{
    String Ename;
    int Eid, Basic;
    double DA, Gross_Sal, Net_Sal;


    void read(Scanner scanner){
        System.out.println("Enter Employee Name : ");
        Ename = scanner.next();
        System.out.println("Enter Employee ID : ");
        Eid = scanner.nextInt();
        System.out.println("Enter basic salary : ");
        Basic = scanner.nextInt();
    }

    void compute_net_sal(){
        DA = 0.52f*Basic;
        Gross_Sal = Basic + DA;
        float IT = (float)(0.30f*Gross_Sal);
        Net_Sal = Gross_Sal - IT;
    }

    void display(){
        System.out.println("Employee Name : " + Ename);
        System.out.println("Employee ID : " + Eid);
        System.out.println("Basic Salary : " + Basic);
        System.out.println("Gross Salary : " + Gross_Sal);
        System.out.println("Net Salary : " + Net_Sal);
    }
}

public class employee_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.println("Enter Number of Employees : ");
        N = scanner.nextInt();
        EMPLOYEE[] employee = new EMPLOYEE[N];
        for(int i =0; i<N; i++){
            employee[i] = new EMPLOYEE();
            System.out.println("Enter details for Employee " + (i+1));
            employee[i].read(scanner);
            employee[i].compute_net_sal();
        }
        System.out.println("Employee Details : ");
        for(int i=0; i<N; i++){
            employee[i].display();
            System.out.println();
        }
    }
}
