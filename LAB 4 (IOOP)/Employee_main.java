/*Consider the already defined EMPLOYEE class. Provide a default constructor, and
parameterized constructor. Also provide a display method. Illustrate all the
constructors as well as the display method by defining EMPLOYEE objects */

import java.util.Scanner;

class EMPLOYEE{
    String Ename;
    int Eid, Basic;
    double DA, Gross_Sal, Net_Sal;

    EMPLOYEE(){
        Ename = "Unknown";
        Eid = 0;
        Basic; 0;
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

public class Employee_main {
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