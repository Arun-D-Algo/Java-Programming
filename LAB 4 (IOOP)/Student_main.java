/*Consider the already defined STUDENT class. Provide a default constructor and
parameterized constructor to this class. Also provide a display method. Illustrate all
the constructors as well as the display method by defining STUDENT objects.*/

import java.util.Scanner;

class STUDENT{
    String sname;
    int[] marks_array = new int[3];
    int total;
    float avg;

    STUDENT(){
        sname = "unknown";
        for(int i=0; i<3; i++){
            marks_array[i]=0;
        }
        compute();
    }

    STUDENT(String name, int m1, int m2, int m3){
        sname = name;
        marks_array[0]=m1;
        marks_array[1]=m2;
        marks_array[2]=m3;
        compute();
    }

    void compute(){
        total = 0;
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
public class Student_main {
    public static void main(String[] args) {
        System.out.println("STUDENT WITH DEFAULT CONSTRUCTOR :");
        STUDENT s1 = new STUDENT ();
        s1.compute();
        s1.display();
        System.out.println();
        System.out.println("STUDENT WITH PARAMETERIZED CONSTRUCTOR :");
        STUDENT s2 = new STUDENT ("Arun", 20, 30, 50);
        s2.compute();
        s2.display();
    }
}
