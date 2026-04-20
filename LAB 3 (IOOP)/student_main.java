/*Define a Class STUDENT having following
Members: sname, marks_array, total, avg and provide the following methods:
a. assign(): to assign initial values to the STUDENT object
b. display(): to display the STUDENT object
c. compute(): to Compute Total, Average marks
Write a Java program Illustrating Class Declarations, Definition, and Accessing Class
Members to test the class defined. */

import java.util.Scanner;

class STUDENT{
    String sname;
    int[] marks_array = new int[3];
    int total=0;
    float avg;
    
    void assign(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name : ");
        sname = scanner.next();
        System.out.println("Enter marks of student in 3 subjects : ");
        for(int i=0; i<3; i++){
            marks_array[i]= scanner.nextInt();
        }
    }

    void compute(){
        for(int mark : marks_array){
            total += mark;
        }
        avg= (float)(total/3.0);
    }

    void display(){
        System.out.println("The name of the student is : " + sname);
        System.out.println("The marks of " + sname + " in 3 subject are : ");
        for(int mark : marks_array){
            System.out.println(mark);
        }
        System.out.println("The total marks of "+ sname + " is : " + total);
        System.out.println("The average score of " + sname + " is : " + avg);

    }

}

public class student_main {
    public static void main(String[] args) {
        STUDENT s = new STUDENT ();
        s.assign();
        s.compute();
        s.display();
    }
    
}
