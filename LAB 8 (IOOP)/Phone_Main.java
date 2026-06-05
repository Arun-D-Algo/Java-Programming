/*Create a class Phone{string brand, int memCapacity}, which contains an interface
(Nested interface) Callable{makeAudioCall(string cellNum), makeVideoCall(string
cellNum)}. Create subclasses BasicPhone and SmartPhone and implement the
methods appropriately. Demonstrate the creation of both subclass objects by calling
appropriate constructors which accept values from the user. Using these objects call
the methods of the interface. */


class Phone{
    String brand;
    int memCapacity;

    Phone(String brand, int memCapacity){
        this.brand = brand;
        this.memCapacity = memCapacity;
    }

    interface CallLable{
        abstract void makeAudioCall(String cellNum);
        abstract void makeVideoCall(String cellNum);
    }
}

class BasicPhone extends Phone implements Phone.CallLable{
    String cellNum;
    BasicPhone(String brand, int memCapacity, String cellNum){
        super(brand, memCapacity);
        this.cellNum = cellNum;
    }
    public void makeAudioCall(String cellNum){
        System.out.println("Calling " + cellNum);
    }

    public void makeVideoCall(String cellNum){
        System.out.println("Cant make a video call using basic phone to " + cellNum);
    }
}

class SmartPhone extends Phone implements Phone.CallLable{
    String cellNum;
    SmartPhone(String brand, int memCapacity, String cellNum){
        super(brand, memCapacity);
        this.cellNum = cellNum;
    }
    public void makeAudioCall(String cellNum){
        System.out.println("Calling " + cellNum);
    }

    public void makeVideoCall(String cellNum){
        System.out.println("Making a video call to " + cellNum);
    }
}


public class Phone_Main {
    public static void main(String[] args) {
        BasicPhone bp = new BasicPhone("Nokia", 10,"920501945");
        System.out.println("BASIC PHONE :");
        System.out.println("Company Name : " + bp.brand);
        System.out.println("Memory of Phone : "+ bp.memCapacity + " MB");
        bp.makeAudioCall(bp.cellNum);
        bp.makeVideoCall(bp.cellNum);

        System.out.println();

        SmartPhone sp = new SmartPhone("APPLE", 102400,"920501923");
        System.out.println("SMART PHONE :");
        System.out.println("Company Name : " + sp.brand);
        System.out.println("Memory of Phone : "+ sp.memCapacity + " MB");
        sp.makeAudioCall(sp.cellNum);
        sp.makeVideoCall(sp.cellNum);
    }
    
}
