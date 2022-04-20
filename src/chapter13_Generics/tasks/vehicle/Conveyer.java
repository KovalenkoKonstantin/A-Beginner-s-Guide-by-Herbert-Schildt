package chapter13_Generics.tasks.vehicle;

public class Conveyer <T,V>{
    T vehicle;
    V speed;
    /**Generic Constructor*/
    public Conveyer(T vehicle, V speed) {
        this.vehicle = vehicle;
        this.speed = speed;
    }

    public T getVehicle() {
        return vehicle;
    }

    public V getSpeed() {
        return speed;
    }

    /**Generic Method*/
    void conveyer (){
        System.out.println(vehicle + " " + speed);
    }
}
