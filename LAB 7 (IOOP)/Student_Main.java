/*To the already defined STUDENT class, add two subclasses ScienceStudent and
ArtsStudent and implement the following:
i) Add a data member practicalMarks (int) to the ScienceStudent class that
represents the marks obtained by the student in the laboratory subject. The
ScienceStudent class should override the compute() method to include the
practical marks in the total marks and average marks calculation. Additionally,
the ScienceStudent class should provide a method displayPracticalMarks() to
display the practical marks obtained by the science student.
ii) Add a data member electiveSubject (String): to the ArtsStudent class that
represents the elective subject chosen by the arts student. Also, add appropriate
constructors to the subclasses.
In main(), create objects of STUDENT, ScienceStudent, and ArtsStudent, and
demonstrate the keyword ‘super’ and other functionalities of the classes by assigning
values, computing marks, and displaying the information of the students. Also,
demonstrate dynamic polymorphism. */

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

class ScienceStudent extends STUDENT{
    int practicalMarks;

    ScienceStudent(String sname, int m1, int m2, int m3, int practicalMarks){
        super(sname, m1, m2, m3);
        this.practicalMarks = practicalMarks;
    }

    void compute(){
        total = 0;
        for(int mark : marks_array){
            total += mark;
        }
        total += practicalMarks;
        avg= (float)(total/4.0);
    }

    void display(){
        super.display();
        System.out.println("The practical marks of " + sname + " is : " + practicalMarks);
    }
}

class ArtsStudent extends STUDENT{
    String subject_elective;
    ArtsStudent(String sname, int m1, int m2, int m3, String subject_elective){
        super(sname, m1, m2, m3);
        this.subject_elective = subject_elective;
    }

    void display(){
        super.display();
        System.out.println("The elective subject of " + sname + " is : " + subject_elective);
    }
}


public class Student_Main {
    public static void main(String[] args) {
        STUDENT student = new STUDENT("Aman", 20, 30, 50);
        ScienceStudent science = new ScienceStudent("Aman", 20, 30, 50, 30);
        ArtsStudent arts = new ArtsStudent ("Arvind", 20, 40, 60, "History");
        student.compute();
        student.display();
        System.out.println();
        science.compute();
        science.display();
        System.out.println();
        arts.compute();
        arts.display();
        System.out.println();

        STUDENT ref;
        ref = science;
        ref.display();
        ref = arts;
        ref.display();
    }
}
