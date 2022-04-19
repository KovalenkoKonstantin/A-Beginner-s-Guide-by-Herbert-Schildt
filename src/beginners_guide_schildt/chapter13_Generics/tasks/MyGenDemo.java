package beginners_guide_schildt.chapter13_Generics.tasks;

import beginners_guide_schildt.chapter13_Generics.tasks.vehicle.BMW;

public class MyGenDemo {
    public static void main(String[] args) {
        MyGen raw = new MyGen<>();
        MyGen <Integer> o = new MyGen<>();
        MyGen <String> o1 = new MyGen<>();


        raw.method(new BMW("x6"));
        o.method(132);
        o1.method("Врум");

        System.out.println(o1.equals(o));
    }
}
