package Interfaces;

public class Car implements Brake,Engine {
    @Override
    public void apply() {
        System.out.println("Brake applied");
    }

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void Price() {
        System.out.println("Engine Price");
    }

    public static void main(String[] args) {
        Car ob = new Car();
        ob.apply();
        ob.Price();
        ob.start();
        ob.stop();
        int a=ob.brake_price;
        System.out.println(a);

    }
}
