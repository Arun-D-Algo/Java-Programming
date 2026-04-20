/*Create a Building class with two subclasses namely, House and School. The Building
class contains fields for square footage and stories. The House class contains
additional fields for number of bedrooms and baths. The School class contains
additional fields for number of classrooms and grade level (for example, elementary
or junior high). All the classes contain appropriate overloaded constructors and
methods to display the details. In a separate class that contains main(), demonstrate
the working of this hierarchy.*/

import java.util.Scanner;

class Building{
    int squarefeet, stories;
    Building(int sf, int st){
        squarefeet = sf;
        stories = st;
    }

    void display(){
        System.out.println("Square Feet : " + squarefeet);
        System.out.println("Number of Stories : " + stories);
    }
}

class House extends Building{
    int bedrooms, baths;
    House(int sf, int st, int bd, int bt){
        super(sf, st);
        bedrooms = bd;
        baths = bt;
    }

    void display(){
        super.display();
        System.out.println("Number of Bedrooms " + bedrooms);
        System.out.println("Number of Bathrooms : " + baths);
    }
}

class School extends Building{
    int classrooms;
    String gradelvl;
    School(int sf, int st, int cl, String gr){
        super(sf, st);
        classrooms = cl;
        gradelvl = gr;
    }

    void display(){
        super.display();
        System.out.println("Number of classrooms : " + classrooms);
        System.out.println("Grade Level : " + gradelvl);
    }
}
public class Building_Main {
    public static void main(String[] args) {
        System.out.println("Building Details : ");
        Building building = new Building(1200, 24);
        building.display();
        System.out.println();
        System.out.println("House Details :");
        House house = new House(1200, 2, 4, 3);
        house.display();
        System.out.println();
        System.out.println("Schhol Details :");
        School school = new School (1200, 10, 300, "Junior High");
        school.display();
    }
    
}
