/*To the already defined EMPLOYEE class, add two subclasses FullTimeEmp and
PartTimeEmp and implement the following:
i) Include the following data members to the PartTimeEmp class-hoursWorked (int)
that represents the number of hours worked by the part-time employee and
hourlyRate (double, static and final) that represents the hourly rate at which the parttime employee is paid. Also, override calculateSalary() and
displayEmployeeDetails() splayEmployeeDetails() method of the base class to
display the part-time employee's details, including the hours worked and hourly rate.
73
ii) The FullTimeEmployee subclass includes the data members bonus and
deductions as additional data members and are of type double and overrides the
calculateSalary() and displayEmployeeDetails() methods to incorporate these
factors.
In main(), create various objects to illustrate the functionality of all the classes */

import java.util.Scanner;

class EMPLOYEE{
    String Ename;
    int Eid, Basic;
    double DA, Gross_Sal, Net_Sal;

    EMPLOYEE(){
        Ename = "Unknown";
        Eid = 0;
        Basic = 0;
        compute_net_sal();
    }

    EMPLOYEE(String Ename, int ID, int basic){
        this.Ename = Ename;
        Eid = ID;
        Basic = basic;
        compute_net_sal();
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

public class Employee_Main {
    
}
