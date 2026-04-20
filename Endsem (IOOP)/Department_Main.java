/*Department Management

a) Create an interface PersonInfo with a method displayInfo().

b) Create an abstract class Person with attributes name and id, an appropriate constructor, and an abstract method showRole().

c) Create classes Student and Faculty that extend Person and implement PersonInfo.
- Student class should have additional attributes year and course.
- Faculty class should have additional attributes designation and specialization.
- Both classes should use method overriding/overloading to display all details.

d) Create a class Department with attribute departmentName and arrays to store Student objects and Faculty objects.

e) In the main class, create multiple Student and Faculty objects and store them in their respective arrays.
Create a Department object and display all details of students and faculty. */

interface PersonInfo{
    void displayInfo();
}

abstract class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id = id;  
    }

    abstract void showrole();

}

class Student extends Person implements PersonInfo{
    int year;
    String course;
    Student(String name, int id, int year, String course){
        super(name, id);
        this.year = year;
        this.course = course;
    }
    public void showrole(){
        System.out.println("Role : STUDENT");
    }
    public void displayInfo(){
        System.out.println("STUDENT DETAILS : \n");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
        System.out.println("Student Year : " + year);
        System.out.println("Student Course : " + course);
    }

    public void displayInfo(String extra){
        displayInfo();
        System.out.println("Extra Subject : " + extra);
    }
}

class Faculty extends Person implements PersonInfo{
    String designation;
    String specialization;
    Faculty(String name, int id, String designation, String specialization){
        super(name, id);
        this.designation = designation;
        this.specialization = specialization;
    }
    public void showrole(){
        System.out.println("Role : FACULTY");
    }

    public void displayInfo(){
        System.out.println("FACULTY DETAILS : \n");
        System.out.println("Faculty Name : " + name);
        System.out.println("Faculty ID : " + id);
        System.out.println("Faculty Designation : " + designation);
        System.out.println("Faculty Specialization : " + specialization);
    }
}

class Department{
    String departmentName;
    Student[] students;
    Faculty[] faculties;

    Department(String departmentName, Student[] students, Faculty[] faculties){
        this.departmentName=departmentName;
        this.students=students;
        this.faculties=faculties;
    }

    void displayallInfo(){
        System.out.println("Department Name : " + departmentName);
        System.out.println("\n");
        System.out.println("Student Details : ");
        for(Student s : students){
            s.showrole();
            s.displayInfo();
            System.out.println();
        }
        System.out.println("Faculty Details : ");
        for(Faculty f : faculties){
            f.showrole();
            f.displayInfo();
            System.out.println();
        }
    }

}

public class Department_Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 10, 2, "Science");
        Faculty f1 = new Faculty("Arun", 19, "Senior", "AIML");

        Faculty[] faculties = {f1};
        Student[] students = {s1};

        Department d = new Department("CSE", students, faculties);
        d.displayallInfo();
    }
}
