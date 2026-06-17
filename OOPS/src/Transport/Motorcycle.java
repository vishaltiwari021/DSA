package Transport;

public class Motorcycle extends Vehicles{
    //attributes:
    public String handleBarType;
    public String suspensionType;
    //Constructor of motorcycle:
    Motorcycle(String name, String modal, int numberOfTyres,String handleBarType, String suspensionType){
        super(name, modal, numberOfTyres);
        this.handleBarType = handleBarType;
        this.suspensionType = suspensionType;

    }
    //behaviour:
    public void wheelie(){
        System.out.println("Motorcycle is wheeeling" + name);
    }
}
