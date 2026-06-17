package Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Swift", "Sw50",4,4,"Motor");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        Motorcycle m = new Motorcycle("Honda","xlime",3,"U","Auto");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
