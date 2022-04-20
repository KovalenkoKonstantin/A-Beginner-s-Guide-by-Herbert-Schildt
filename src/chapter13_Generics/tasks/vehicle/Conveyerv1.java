package chapter13_Generics.tasks.vehicle;

public class Conveyerv1<T extends BMW & Yamaha & Boeing>{
    T vehicle;
    /**Generic Constructor*/
    public Conveyerv1(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    /**Generic Method*/
    void conveyer1 (){
        vehicle.bmw();
        vehicle.boeing();
        vehicle.yamaha();
    }
}
