package beginners_guide_schildt.chapter13_Generics.tasks;

public class FlightSchedv2<T, V extends T>{
        private T obj;
        private V obj1;


    public FlightSchedv2(T obj, V obj1) {
        this.obj = obj;
        this.obj1 = obj1;
    }

    public T getObj() {
        return obj;
    }

    public V getObj1() {
        return obj1;
    }

    public void showFlightSchedv2 () {
        System.out.println(getObj().getClass().getName());
        System.out.println(getObj1().getClass().getName());
    }
}
