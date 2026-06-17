package Transport;

public class Vehicles {
    public String name;
    public String model;
    public int numberOfTyres;
//Default constructor:
    public Vehicles(){
        this.name = "";
        this.model = "";
        this.numberOfTyres = -1;
    }
//Parametrised Constructor
    public Vehicles(String name, String model, int numberOfTyres){
        this.name = name;
        this.model = model;
        this.numberOfTyres = numberOfTyres;
    }
    public void startEngine(){
        System.out.printf("Start Engine %s :%s \n",name,model);
    }
    public void stopEngine(){
        System.out.printf("Stop Engine %s :%s \n",name,model);
    }

}


