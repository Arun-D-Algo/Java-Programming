/*Design an interface called Series with the following methods
i) getNext (returns the next number in series)
ii) reset(to restart the series)
iii) setStart (to set the value from which the series should start)
Design a class named ByTwos that implements Series such that it generates a series
of numbers, each two greater than the previous one. Also design a class which will
include the main method for referencing the interface */

interface Series{
    abstract int getNext();
    abstract void reset();
    abstract void SetStart(int x);
}

class ByTwos implements Series{
    int start;
    int value;
    
    ByTwos(){
        start = 0;
        value = 0;
    }


    public void SetStart(int x){
        start = x;
        value = x;
    }

    public int getNext(){
        value += 2;
        return value;
    }

    public void reset(){
        value = start;
    }
}

public class Series_Main {
    public static void main(String[] args) {
        Series s = new ByTwos();
        System.out.println("Series Starting from 0 : ");
        for(int i=0; i<5; i++){
            System.out.print(s.getNext() + " ");
        }
        System.out.println("\n");
        System.out.println("Resetting :");
        s.reset();
        for(int i = 0; i < 5; i++) {
            System.out.print(s.getNext() + " ");
        }

        System.out.println("\nStarting from 10...");
        s.SetStart(10);

        for(int i = 0; i < 5; i++) {
            System.out.print(s.getNext() + " ");
        }
    }
}
