/*Design a class Student with the methods, getRollNum() and putRollNum() to read
and display the Roll No. of each student; and getMarks() and putMarks() to read and
display their marks. Create an interface called Sports with a method putSportsScore()
that will set the score obtained by a student in physical education examination. Design
a class called Result that will implement this interface to generate the result by
considering both the marks and sports score.*/

import java.util.Scanner;

interface Sports{
    abstract void putSportsScore();
}

class Student{
    int roll;
    int marks;
    Scanner scanner = new Scanner(System.in);
    void getRollNum(){
        System.out.println("Enter Roll number of Student : ");
        roll = scanner.nextInt();
    }

    void putRollNum(){
        System.out.println("The roll number of Student is : " + roll);
    }

    void getMarks(){
        System.out.println("Enter total marks of the Student : ");
        marks = scanner.nextInt();
    }

    void putMarks(){
        System.out.println("The total marks of the Student is : " + marks);
    }
}

class Result extends Student implements Sports{
    Scanner scanner = new Scanner(System.in);
    int sports;
    void getSportsScore(){
        System.out.println("Enter the Sports Score of the Student : ");
        sports = scanner.nextInt();
    }
    public void putSportsScore(){
        System.out.println("The Sports Score of the Student is : " + sports);
    }

    void display(){
        putRollNum();
        putMarks();
        putSportsScore();
        System.out.println("The total marks of the Student (Academics + Sports) is : " + (marks+sports));
    }
}
public class Student_Main {
    public static void main(String[] args) {
        Result result = new Result();
        result.getRollNum();
        result.getMarks();
        result.getSportsScore();
        System.out.println("\nRESULTS : ");
        result.display();
    }
}
