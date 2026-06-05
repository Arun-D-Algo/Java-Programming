/*Create an abstract class Figure with an abstract method area and two integer variables
that represent x and y dimensions. Create three more classes Rectangle, Triangle and
Square that extend Figure and implement the area method appropriately. Illustrate
how the method area can be computed at run time for Rectangle, Square and Triangle
to achieve dynamic polymorphism.*/

abstract class Figure{
    int x, y;
    Figure(int x, int y){
        this.x =x;
        this.y = y;
    }
    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(int x, int y){
        super(x,y);
    }
    public double area(){
        return x*y;
    }
}

class Triangle extends Figure{
    Triangle(int x, int y){
        super(x,y);
    }
    public double area(){
        return x*y*0.5;
    }
}

class Square extends Figure{
    Square(int x){
        super(x,x);
    }
    public double area(){
        return x*x;
    }
}


public class Figure_Main {
    public static void main(String[] args) {
        Figure f;
        f= new Rectangle(10,50);
        System.out.println("The area of Rectangle : " + f.area());
        f= new Triangle(10,50);
        System.out.println("The area of Triangle : " + f.area());
        f= new Square(10);
        System.out.println("The area of Square : " + f.area());
    }
}
