/*Create a Swapper class with two integer instance variables x and y
and a constructor with two parameters that initialize the two variables.
Also include three methods: a getX( ) method that returns x, a getY( )
method that returns y, and a void swap( ) method that swaps the values
of x and y. Then create a SwapperDemo class that tests all the methods */


class Swapper{
    private int x, y;

    Swapper(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    void swap(){
        System.out.println("Before swapping : X = " + x + ", Y = "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swapping : X = " + x + ", Y = "+y);
    }
}
public class Swapper_Main {
    public static void main(String[] args) {
        Swapper swapper = new Swapper (1, 2);
        swapper.swap();
    }
}
