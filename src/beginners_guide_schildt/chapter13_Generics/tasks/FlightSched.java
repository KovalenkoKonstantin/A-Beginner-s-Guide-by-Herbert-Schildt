package beginners_guide_schildt.chapter13_Generics.tasks;

public class FlightSched <T, V, M>{
        private T obj;
        private V obj1;
        private M obj2;

    public FlightSched(T obj, V obj1, M obj2) {
        this.obj = obj;
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public V getObj1() {
        return obj1;
    }

    public M getObj2() {
        return obj2;
    }

    public void showFlightSched () {
        System.out.println(getObj().getClass().getName());
        System.out.println(getObj1().getClass().getName());
        System.out.println(getObj2().getClass().getName());
    }
}
