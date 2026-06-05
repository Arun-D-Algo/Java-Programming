/*Define a class to represent a complex number called Complex.
Provide the following member functions:-
i. To assign initial values to the Complex object (using constructor).
ii. To display a complex number in a+ib format.
iii. To add 2 complex numbers. (the return value should be complex)
Write a main function to test the class.*/

class Complex{
    double re, im;

    Complex(){
        re = 0;
        im = 0;
    }

    Complex(double re, double im){
        this.re = re;
        this.im = im;
    }

    void display(){
        System.out.println("The complex number is : " + re + " + " + "i" + im);
    }

    Complex addComplex( Complex c2){
        Complex c = new Complex();
        c.re = this.re + c2.re;
        c.im = this.im + c2.im;
        return c;
    }
}


public class Complex_Main {
    public static void main(String[] args) {
        Complex c1 = new Complex (1, 2);
        c1.display();
        Complex c2 = new Complex (2, 3);
        c2.display();
        Complex result = c1.addComplex(c2);
        result.display();
    }
}
