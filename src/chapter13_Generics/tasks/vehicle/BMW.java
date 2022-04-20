package chapter13_Generics.tasks.vehicle;

public class BMW implements Yamaha, Boeing {
    String carName;

    public BMW(String carName) {
        this.carName = carName;
    }

    void bmw (){
        System.out.println("Vrum Vrum "+ carName);
    }
}
