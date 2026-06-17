package Transport;

public class Car extends Vehicles{
    public int numberOfDoors;
    public String transmissionType;

    Car(String name, String model, int numberOfTyres, int numberOfDoors, String transmissionType){
    //super is the method to send the data to parent/base class
    super(name, model, numberOfTyres);
    this.numberOfDoors = numberOfDoors;
    this.transmissionType = transmissionType;
//    super.startEngine();
    }
    public void startAC(){
        System.out.println("AC started of " + name);
    }
}
