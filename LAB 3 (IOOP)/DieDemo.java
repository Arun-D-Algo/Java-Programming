/*Create a Die class with one integer instance variable called sideUp. Give it a
getSideUp() method that returns the values of sideUp and a void roll() method that
changes sideUpto a random value from 1 to 6.Then create a DieDemo class with a
method that creates two Die objects, rolls them, and prints the sum of the two sides
up. */

import java.util.Random;

class DIE{
    int sideUp;

     void roll(){
        Random random = new Random();
        sideUp = random.nextInt(6)+1;
    }

    int getSideUp(){
        return sideUp;
    }

}

public class DieDemo{
    public static void main(String[] args) {
        
        DIE d1 = new DIE();
        DIE d2 = new DIE();
        d1.roll();
        d2.roll();
        int sum = d1.getSideUp()+d2.getSideUp();
        System.out.println("Die 1 : " + d1.getSideUp());
        System.out.println("Die 2 : " + d2.getSideUp());
        System.out.println("The sum of both dies : " + sum);
    }
}