/*Create a class called Counter that contains a static data member to count the number
of Counter objects being created. Also define a static member function called
showCount() which displays the number of objects created at any given point of
time. Illustrate this. */

class COUNTER{
    static int count=0;
    
    COUNTER(){
        count++;
        System.out.println("Object Created, Current count : " + count);
    }
    static void showCount(){
        System.out.println("Total Objects created : " + count);
    }
}

public class Counter_main {
    public static void main(String[] args) {
        COUNTER.showCount();
        COUNTER c1 = new COUNTER();
        COUNTER c2 = new COUNTER();
        COUNTER c3 = new COUNTER();
        COUNTER.showCount();
    }
}
